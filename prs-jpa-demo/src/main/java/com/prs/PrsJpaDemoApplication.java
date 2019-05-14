package com.prs;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prs.business.*;
import com.prs.db.*;

@SpringBootApplication
public class PrsJpaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrsJpaDemoApplication.class, args);
		System.out.println("Hello\n");
		
		
		printU();
		printV();
		printP();
		printPR();
		printPRLI();
		
		System.out.println("\nGoodbye");
}

	private static void printU() {
		// delet this
		System.out.println("=========USERS===========\n===================");
		// end delet
		
		List<User> users = UserDB.getAll();
		if (users!=null) {
			for (User u: users) {
				System.out.println(u);
			}
		} else {
			System.out.println("users null");
		}

	}
	
	private static void printV() {
		// delet this
		System.out.println("=========VENDORS===========\n===================");
		// end delet
		
		List<Vendor> vendors = VendorDB.getAll();
		if (vendors!=null) {
			for (Vendor v: vendors) {
				System.out.println(v);
			}
		} else {
			System.out.println("vendors null");
		}

	}

	private static void printP() {
		// delet this
		System.out.println("=========PRODUCTS===========\n===================");
		// end delet
		
		List<Product> products = ProductDB.getAll();
		if (products!=null) {
			for (Product p: products) {
				System.out.println(p);
			}
		} else {
			System.out.println("products null");
		}

	}
	
	private static void printPR() {
		System.out.println("=========PURCHASE REQUESTS===========\n===================");
		// end delet
		
		List<PurchaseRequest> purchaseRequests = PurchaseRequestDB.getAll();
		if (purchaseRequests!=null) {
			for (PurchaseRequest pr: purchaseRequests) {
				System.out.println(pr);
			}
		} else {
			System.out.println("purchase requests null");
		}

	}

	private static void printPRLI() {
		System.out.println("=========PURCHASE REQUEST LINE ITEMS===========\n===================");
		// end delet
		
		List<PurchaseRequestLineItem> purchaseRequestLineItems = PurchaseRequestLineItemDB.getAll();
		if (purchaseRequestLineItems!=null) {
			for (PurchaseRequestLineItem prli: purchaseRequestLineItems) {
				System.out.println(prli);
			}
		} else {
			System.out.println("purchase request line items null");
		}
		
	}
}