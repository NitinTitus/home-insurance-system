package com.project.dao;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.project.to.Admin;
import com.project.to.User;

public class AdminDao {
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public int validateAdmin(Admin admin) {
		Session session = hibernateTemplate.getSessionFactory().openSession();
		session.beginTransaction();
		Query<Admin> query = session.createQuery("from Admin where adminname=:adminname");
		query.setParameter("adminname", admin.getAdminname());
		List<Admin> admins = query.getResultList();
		session.close();
		if(admins.size()>0) {
			Admin dbAdmin = admins.get(0);
			if(dbAdmin.getPassword().equals(admin.getPassword())) {
				return dbAdmin.getAdminId();
			}
			else {
				return -1;
			}
		}
		else {
			return -1;
		}
	}
	
	public void getUsers(HttpSession httpSession) {
		Session session = hibernateTemplate.getSessionFactory().openSession();
		session.beginTransaction();
		Query<User> query = session.createQuery("from User");
		List<User> users = query.getResultList();
		HashMap<Integer,String> usersMap = new HashMap<Integer,String>();
		for(User u: users) {
			usersMap.put(u.getUserId(), u.getUsername());
		}
		httpSession.setAttribute("usersMap", usersMap);
	}
}
