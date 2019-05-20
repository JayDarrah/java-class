package com.prs;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prs.business.*;
import com.prs.db.*;
import com.prs.util.Console;

@SpringBootApplication
public class PrsJpaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrsJpaDemoApplication.class, args);
		
		System.out.println("Welcome to the prs-jpa-demo app!\n");
		
		String choice = "0";
		
		while (!choice.equalsIgnoreCase("x")) {

			choice = displayMainMenu();
			
			
		}
		
		System.out.println("\nGoodbye");
}
	
	
	private static void printU() {
		System.out.println("\n=========USERS==============================");		
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
		System.out.println("\n=========VENDORS==============================");
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
		System.out.println("\n=========PRODUCTS==============================");
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
		System.out.println("\n=========PURCHASE REQUESTS==============================");
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
		System.out.println("\n=========PURCHASE REQUEST LINE ITEMS==============================");
		List<PurchaseRequestLineItem> purchaseRequestLineItems = PurchaseRequestLineItemDB.getAll();
		if (purchaseRequestLineItems!=null) {
			for (PurchaseRequestLineItem prli: purchaseRequestLineItems) {
				System.out.println(prli);
			}
		} else {
			System.out.println("purchase request line items null");
		}
		
	}
	
	private static String displayMainMenu() {
		StringBuilder mainMenu = new StringBuilder();
		mainMenu.append("\n\t╔══════════════════════╗\n");
		mainMenu.append("\t║  [ Select a Table ]  ║\n");
		mainMenu.append("\t╟───┬──────────────────╢\n");
		mainMenu.append("\t║ 1 │ User             ║\n");
		mainMenu.append("\t╟───┼──────────────────╢\n");
		mainMenu.append("\t║ 2 │ Vendor           ║\n");
		mainMenu.append("\t╟───┼──────────────────╢\n");
		mainMenu.append("\t║ 3 │ Product          ║\n");
		mainMenu.append("\t╟───┼──────────────────╢\n");
		mainMenu.append("\t║ 4 │ Purchase Request ║\n");
		mainMenu.append("\t╟───┼──────────────────╢\n");
		mainMenu.append("\t║ 5 │ PR Line Item     ║\n");
		mainMenu.append("\t╟───┼──────────────────╢\n");
		mainMenu.append("\t║ X │ Exit             ║\n");
		mainMenu.append("\t╚═══╧══════════════════╝\n");
		System.out.println(mainMenu);
		
		String[] menuArray = new String[] {"1","2","3","4","5","X"};
		String c = Console.getSelectionString("Select table to work with: ",menuArray);

		if (c.equals("1")) {		// User
			//printU();
			displayActionMenu("User");
		} else if (c.equals("2")) {	// Vendor
			displayActionMenu("Vendor");
		} else if (c.equals("3")) {	// Product
			displayActionMenu("Product");
		} else if (c.equals("4")) {	// Purchase Request
			displayActionMenu("Purchase Request");
		} else if (c.equals("5")) {	// PR Line Item
			displayActionMenu("PR Line Item");
		} else if (c.equals("x")) {	// Exit
			c = "x";
		} else {
			System.out.println("Unknown command: "+c+". Please try again.");
			c = "0";
		}
		
		
		return c;
	}


	private static String displayActionMenu(String table) {
		StringBuilder actionMenu = new StringBuilder();
		actionMenu.append("\n\t╔══════════════════════╗\n");
		actionMenu.append("\t║ [ Select an Action ] ║\n");
		actionMenu.append("\t╟───┬──────────────────╢\n");
		actionMenu.append("\t║ 1 │ List             ║\n");
		actionMenu.append("\t╟───┼──────────────────╢\n");
		actionMenu.append("\t║ 2 │ Search (by ID)   ║\n");
		actionMenu.append("\t╟───┼──────────────────╢\n");
		actionMenu.append("\t║ 3 │ Add              ║\n");
		actionMenu.append("\t╟───┼──────────────────╢\n");
		actionMenu.append("\t║ 4 │ Delete           ║\n");
		actionMenu.append("\t╟───┼──────────────────╢\n");
		actionMenu.append("\t║ B │ Back             ║\n");
		actionMenu.append("\t╚═══╧══════════════════╝\n");
		System.out.println(actionMenu);

		String[] menuArray = new String[] {"1","2","3","4","B"};
		String c = Console.getSelectionString("Select an action to perform on "+table+": ",menuArray);

		while (!c.equalsIgnoreCase("B")) {
			if (c.equals("3") || c.equals("4")) { // If user selects add or delete (while it's not implemented)
				final String ANSI_YELLOW = "\u001B[33m";
				final String ANSI_RESET = "\u001B[0m";
				final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
				System.out.println("Add and Delete functions are available to PRS-JPA-Demo "+ANSI_YELLOW+ANSI_BLACK_BACKGROUND+" 𝓟𝓻𝓮𝓶𝓲𝓾𝓶 "+ANSI_RESET+" users only!");
				c = "B";
			} else if (c.equals("1")) { // If user selects List
				switch (table) {
				case "User": 	printU();
								break;
				case "Vendor": 	printV();
								break;
				case "Product":	printP();
								break;
				case "Purchase Request": 	printPR();
											break;
				case "PR Line Item":	printPRLI();
										break;
				default:
					System.out.println("Invalid table in action list");
				}
			} else if (c.equals("2")) {
				int getAnID = Console.getInt("Please enter an ID number to search for: ");
				
//				User testing = UserDB.getUserByID(4);
//				System.out.println("Here's a quick test: " + testing);

				
				switch (table) {
				case "User": 	System.out.println(UserDB.getUserByID(getAnID));
								break;
				case "Vendor": 	System.out.println(VendorDB.getVendorByID(getAnID));
								break;
				case "Product":	System.out.println(ProductDB.getProductByID(getAnID));
								break;
				case "Purchase Request": System.out.println(PurchaseRequestDB.getPurchaseRequestByID(getAnID));
											break;
				case "PR Line Item":	System.out.println(PurchaseRequestLineItemDB.getPurchaseRequestLineItemByID(getAnID));
										break;
				default:
					System.out.println("Invalid table in action list");
				}
				
			} else {
				System.out.println("I'm not sure what that means.");
			}

			c = "B";		
		}
		return c;
	}


}