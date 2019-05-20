package com.prs.db;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.prs.business.User;

	public class UserDB {
	
	private static List<User> users = null;

	public static List<User> getAll() {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		
		
		try {
			Query q = em.createQuery("Select u from User u");
			users = q.getResultList();
		}
		finally {
			em.close();
		}		
		return users;
	}
	
	public static User getUserByID(int userID) {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		User user = null;

		try { 
			user = em.find(User.class, userID);
			return user;
		} finally {
			em.close();
		}
		
	}
	
}
