package com.project.dao;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.project.to.Policy;
import com.project.to.Quote;

public class PolicyDao {
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public void buyPolicy(Policy policy, HttpSession httpSession) {
		Session session = hibernateTemplate.getSessionFactory().openSession();
		session.beginTransaction();
		int userId = (int)httpSession.getAttribute("userId");
		policy.setUserId(userId);
		Quote quote = (Quote) session.get(Quote.class, userId);
		policy.setQuoteId(quote.getQuoteId());
		policy.setPolicyKey(quote.getQuoteId()+2);
		policy.setPolicyStatus("Bought");
		policy.setPolicyTerm("Term");
		session.saveOrUpdate(policy);
		session.getTransaction().commit();
		session.close();
	}
	
	public Policy getPolicy(HttpSession httpSession) {
		Session session = hibernateTemplate.getSessionFactory().openSession();
		session.beginTransaction();
		int userId = (int)httpSession.getAttribute("userId");
		Policy policy = (Policy) session.get(Policy.class, userId);
		session.close();
		return policy;
	}
	
	public Policy renewPolicy(HttpSession httpSession) {
		Session session = hibernateTemplate.getSessionFactory().openSession();
		session.beginTransaction();
		int userId = (int)httpSession.getAttribute("userId");
		Policy policy = (Policy) session.get(Policy.class, userId);
		policy.setPolicyStatus("Renewed");
		session.saveOrUpdate(policy);
		session.getTransaction().commit();
		session.close();
		return policy;
	}
	
	public Policy cancelPolicy(HttpSession httpSession) {
		Session session = hibernateTemplate.getSessionFactory().openSession();
		session.beginTransaction();
		int userId = (int)httpSession.getAttribute("userId");
		Policy policy = (Policy) session.get(Policy.class, userId);
		policy.setPolicyStatus("Cancelled");
		session.saveOrUpdate(policy);
		session.getTransaction().commit();
		session.close();
		return policy;
	}
	
	public Policy updateTerms(String newPolicyTerms, HttpSession httpSession) {
		Session session = hibernateTemplate.getSessionFactory().openSession();
		session.beginTransaction();
		int userId = (int)httpSession.getAttribute("userId");
		Policy policy = (Policy) session.get(Policy.class, userId);
		policy.setPolicyTerm(newPolicyTerms);
		session.saveOrUpdate(policy);
		session.getTransaction().commit();
		session.close();
		return policy;
	}
}
