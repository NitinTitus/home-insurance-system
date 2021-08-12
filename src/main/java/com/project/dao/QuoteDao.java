package com.project.dao;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.ui.Model;

import com.project.to.HomeOwner;
import com.project.to.Location;
import com.project.to.Property;
import com.project.to.Quote;

public class QuoteDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public Quote getQuote(HttpSession httpSession) {
		Session session = hibernateTemplate.getSessionFactory().openSession();
		session.beginTransaction();
		int userId = (int) httpSession.getAttribute("userId");
		Location location = (Location) session.get(Location.class, userId);
		Property property = (Property) session.get(Property.class, userId);
		HomeOwner owner = (HomeOwner) session.get(HomeOwner.class, userId);
		if(location==null||property==null||owner==null) {
			return null;
		}
		double dwellingCoverage=calcDwellingCoverage(property);
		double monthlyPremium=calcMonthlyPremium(location, dwellingCoverage);
		double detachedStructures=0.1*dwellingCoverage;
		double personalProperty=0.6*dwellingCoverage;
		double additionalExpense=0.2*dwellingCoverage;
		double medicalExpense=5000;
		double deductable=0.01*property.getMarketValue();
		Quote quote = new Quote(monthlyPremium,dwellingCoverage,detachedStructures,personalProperty,medicalExpense,additionalExpense,deductable);
		quote.setUserId(userId);
		quote.setQuoteId(userId+3);
		session.saveOrUpdate(quote);
		session.getTransaction().commit();
		session.close();
		return quote;
	}
	
	public void retrieveQuote(Model model, HttpSession httpSession) {
		Session session = hibernateTemplate.getSessionFactory().openSession();
		session.beginTransaction();
		int userId = (int) httpSession.getAttribute("userId");
		Location location = (Location) session.get(Location.class, userId);
		Property property = (Property) session.get(Property.class, userId);
		HomeOwner owner = (HomeOwner) session.get(HomeOwner.class, userId);
		Quote quote = (Quote) session.get(Quote.class, userId);
		model.addAttribute("location",location);
		model.addAttribute("property",property);
		model.addAttribute("owner",owner);
		model.addAttribute("quote",quote);
	}
	
	private double calcDwellingCoverage(Property property) {
		double constructionCost = property.getSqFootage()*120;
		double homeValue=constructionCost;
		Date date = new Date();
		int age = date.getYear() - property.getYearBuilt().getYear();
		if(age<5) {
			homeValue*=0.9;
		}
		else if(age<10) {
			homeValue*=0.8;
		}
		else if(age<20) {
			homeValue*=0.7;
		}
		else {
			homeValue*=0.5;
		}
		return (0.5*property.getMarketValue())+homeValue;
		
	}
	
	private double calcMonthlyPremium(Location location,double coverage) {
		double premium = (coverage/1000)*5;
		switch(location.getResidenceType())
		{
			case "Single-Family Home":{
				premium=1.005 * premium;
			}
			case "Condo":{
				premium = 1.006*premium;
				break;
			}
			case "Duplex":{
				premium = 1.006*premium;
				break;
			}
			case "Apartment":{
				premium = 1.006*premium;
				break;
			}
			case "Town House":{
				premium = 1.007*premium;
				break;
			}
			case "Row House":{
				premium = 1.007*premium;
				break;
			}
		}
		return (premium/12);
		
	}
}
