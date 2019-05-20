package com.prs.db;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.prs.business.Product;
import com.prs.business.PurchaseRequest;

public class PurchaseRequestDB {
	
	public static List<PurchaseRequest> getAll() {
		List<PurchaseRequest> purchaseRequests = null;
		
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		
		try {
			Query q = em.createQuery("Select pr from PurchaseRequest pr");
			purchaseRequests = q.getResultList();
		}
		finally {
			em.close();
		}
		return purchaseRequests;
	}
	
	public static PurchaseRequest getPurchaseRequestByID(int purchaseRequestID) {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		PurchaseRequest purchaseRequest = null;

		try { 
			purchaseRequest = em.find(PurchaseRequest.class, purchaseRequestID);
			return purchaseRequest;
		} finally {
			em.close();
		}
		
	}

	
}