package com.project.dao;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.project.to.HomeOwner;

public class HomeOwnerDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public void addHomeOwner(HomeOwner owner, HttpSession httpSession) {
		Session session = hibernateTemplate.getSessionFactory().openSession();
		session.beginTransaction();
		owner.setUserId((int)httpSession.getAttribute("userId"));
		session.saveOrUpdate(owner);
		session.getTransaction().commit();
		session.close();
	}
}
