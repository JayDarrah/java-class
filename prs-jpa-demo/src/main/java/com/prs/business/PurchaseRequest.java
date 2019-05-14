package com.prs.business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PurchaseRequest {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id = 0;
	int userID = 0;
	String description = null;
	String justification = null;
	String dateNeeded = null;
	String deliveryMode = null;
	String Status = null;
	double total = 0.0;
	String submittedDate = null;
	String reasonForRejection = null;
	
	public PurchaseRequest() {
		super();
	}

	public PurchaseRequest(int id, int userID, String description, String justification, String dateNeeded,
			String deliveryMode, String status, double total, String submittedDate, String reasonForRejection) {
		super();
		this.id = id;
		this.userID = userID;
		this.description = description;
		this.justification = justification;
		this.dateNeeded = dateNeeded;
		this.deliveryMode = deliveryMode;
		Status = status;
		this.total = total;
		this.submittedDate = submittedDate;
		this.reasonForRejection = reasonForRejection;
	}

	public PurchaseRequest(int userID, String description, String justification, String dateNeeded, String deliveryMode,
			String status, double total, String submittedDate, String reasonForRejection) {
		super();
		this.userID = userID;
		this.description = description;
		this.justification = justification;
		this.dateNeeded = dateNeeded;
		this.deliveryMode = deliveryMode;
		Status = status;
		this.total = total;
		this.submittedDate = submittedDate;
		this.reasonForRejection = reasonForRejection;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getJustification() {
		return justification;
	}

	public void setJustification(String justification) {
		this.justification = justification;
	}

	public String getDateNeeded() {
		return dateNeeded;
	}

	public void setDateNeeded(String dateNeeded) {
		this.dateNeeded = dateNeeded;
	}

	public String getDeliveryMode() {
		return deliveryMode;
	}

	public void setDeliveryMode(String deliveryMode) {
		this.deliveryMode = deliveryMode;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getSubmittedDate() {
		return submittedDate;
	}

	public void setSubmittedDate(String submittedDate) {
		this.submittedDate = submittedDate;
	}

	public String getReasonForRejection() {
		return reasonForRejection;
	}

	public void setReasonForRejection(String reasonForRejection) {
		this.reasonForRejection = reasonForRejection;
	}

	@Override
	public String toString() {
		return "PurchaseRequest [id=" + id + ", userID=" + userID + ", description=" + description + ", justification="
				+ justification + ", dateNeeded=" + dateNeeded + ", deliveryMode=" + deliveryMode + ", Status=" + Status
				+ ", total=" + total + ", submittedDate=" + submittedDate + ", reasonForRejection=" + reasonForRejection
				+ "]";
	}
	
	
}
