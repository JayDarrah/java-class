package com.prs.business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PurchaseRequestLineItem {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id = 0;
	int purchaseRequestID = 0;
	int productID = 0;
	int quantity = 0;
	
	public PurchaseRequestLineItem() {
		super();
	}

	public PurchaseRequestLineItem(int id, int purchaseRequestID, int productID, int quantity) {
		super();
		this.id = id;
		this.purchaseRequestID = purchaseRequestID;
		this.productID = productID;
		this.quantity = quantity;
	}

	public PurchaseRequestLineItem(int purchaseRequestID, int productID, int quantity) {
		super();
		this.purchaseRequestID = purchaseRequestID;
		this.productID = productID;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPurchaseRequestID() {
		return purchaseRequestID;
	}

	public void setPurchaseRequestID(int purchaseRequestID) {
		this.purchaseRequestID = purchaseRequestID;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "PurchaseRequestLineItem [id=" + id + ", purchaseRequestID=" + purchaseRequestID + ", productID="
				+ productID + ", quantity=" + quantity + "]";
	}
	
	
	
	
}
