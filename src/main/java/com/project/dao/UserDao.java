package com.project.dao;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.project.to.Policy;
import com.project.to.User;

public class UserDao {
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public String addUser(User user) {
		Session session = hibernateTemplate.getSessionFactory().openSession();
		session.beginTransaction();
		Query<User> query = session.createQuery("from User where username=:username");
		query.setParameter("username", user.getUsername());
		List<User> users = query.getResultList();
		String str;
		if(users.size()>0) {
			str="User already exists!";
			session.close();
		}
		else {
			str="Registration successful!";
			session.save(user);
			session.getTransaction().commit();
			session.close();
		}
		return str;
	}
	
	public int validateUser(User user) {
		Session session = hibernateTemplate.getSessionFactory().openSession();
		session.beginTransaction();
		Query<User> query = session.createQuery("from User where username=:username");
		query.setParameter("username", user.getUsername());
		List<User> users = query.getResultList();
		session.close();
		if(users.size()>0) {
			User dbUser = users.get(0);
			if(dbUser.getPassword().equals(user.getPassword())) {
				return dbUser.getUserId();
			}
			else {
				return -1;
			}
		}
		else {
			return -1;
		}
	}
	
	public Policy getPolicy(HttpSession httpSession) {
		Session session = hibernateTemplate.getSessionFactory().openSession();
		session.beginTransaction();
		int userId = (int) httpSession.getAttribute("userId");
		Policy policy = session.get(Policy.class, userId);
		return policy;
	}
}
