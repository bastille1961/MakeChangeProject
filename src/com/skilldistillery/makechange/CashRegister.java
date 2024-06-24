package com.skilldistillery.makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to Camp Distillery's Cash and Carry");
		System.out.println("Great news! We only accept $$CASH$$ but keep our prices low!");

		System.out.println("============================================");
		System.out.println("|              Grocery Items               |");
		System.out.println("| 1. Apples                    $ 1.12 each |");
		System.out.println("| 2. DeAngelo Pears            $ 1.80 each |");
		System.out.println("| 3. SunKist Oranges           $ 1.85 each |");
		System.out.println("| 4. Potato Chips (bag)        $ 3.99 each |");
		System.out.println("| 5. BBQ Potato Chips (bag)    $ 4.20 each |");
		System.out.println("| 6. Bread loaf                $ 4.99 each |");
		System.out.println("| 7. Eggs/dozen                $ 6.40 each |");
		System.out.println("| 8. Butter                    $ 5.29 each |");
		System.out.println("| 9. Milk whole 1/2 gal.       $ 3.50 each |");
		System.out.println("|10. Veg Oil Canola            $ 2.99 each |");
		System.out.println("|11. Veg Oil Olive             $ 4.30 each |");
		System.out.println("|12. Spam                      $ 2.20 each |");
		System.out.println("|   * Distillery's Freshness Guarantee *   |");
		System.out.println("============================================");

		String item1 = "Apples";
		double applesPrc = 1.12f;
		String item2 = "Pears";
		double deangeloPearsPrc = 1.80f;
		String item3 = "Oranges";
		double sunKistOrangPrc = 1.85f;
		String item4 = "Potato Chips";
		double potChipsPlainPrc = 4.20f;
		String item5 = "Potato Chips BBQ";
		double potChipsBbqPrc = 4.99f;
		String item6 = "Bread";
		double breadLoafPrc = 4.99f;
		String item7 = "Eggs";
		double eggsDozPrc = 6.40f;
		String item8 = "Butter";
		double butterPrc = 5.29f;
		String item9 = "Milk";
		double milkWholePrc = 3.5f;
		String item10 = "Veg Oil Canola";
		double vegOilCanolaPrc = 2.99f;
		String item11 = "Veg Oil Olive";
		double vegOilOlivePrc = 4.30f;
		String item12 = "Spam";
		double spamCanPrc = 2.20f;

		int applesQty;
		int deangeloPearsQty;
		int sunKistOrangQty;
		int potChipsPlainQty;
		int potChipsBbqQty;
		int breadLoafQty;
		int eggsDozQty;
		int butterQty;
		int milkWholeQty;
		int vegOilCanolaQty;
		int vegOilOliveQty;
		int spamCanQty;

		char dollar = '$';

		System.out.print("Welcome to Distillery's Self Checkout Process!");

		System.out.print("Enter quantity of Apples you are purchasing, if none, press 0 for none.");
		applesQty = keyboard.nextInt();
		System.out.print("Enter quantity of Pears you are purchasing, if none, press 0 for none.");
		deangeloPearsQty = keyboard.nextInt();
		System.out.print("Enter quantity of Oranges you are purchasing, if none, press 0 for none.");
		sunKistOrangQty = keyboard.nextInt();
		System.out.print("Enter quantity of Plain Potato Chips you are purchasing, if none, press 0 for none.");
		potChipsPlainQty = keyboard.nextInt();
		System.out.print("Enter quantity of BBQ Potato Chips you are purchasing, if none, press 0 for none.");
		potChipsBbqQty = keyboard.nextInt();
		System.out.print("Enter quantity of Loaves of Bread you are purchasing, if none, press 0 for none.");
		breadLoafQty = keyboard.nextInt();
		System.out.print("Enter quantity of Dozen Eggs you are purchasing, if none, press 0 for none.");
		eggsDozQty = keyboard.nextInt();
		System.out.print("Enter quantity of Butter you are purchasing, if none, press 0 for none.");
		butterQty = keyboard.nextInt();
		System.out.print("Enter quantity of Cartons of Milk you are purchasing, if none, press 0 for none.");
		milkWholeQty = keyboard.nextInt();
		System.out.print("Enter quantity of Canola Oil you are purchasing, if none, press 0 for none.");
		vegOilCanolaQty = keyboard.nextInt();
		System.out.print("Enter quantity of Olive Oil you are purchasing, if none, press 0 for none.");
		vegOilOliveQty = keyboard.nextInt();
		System.out.print("Enter quantity of Spam Cans you are purchasing, if none, press 0 for none.");
		spamCanQty = keyboard.nextInt();

		double totalSale = (applesQty * applesPrc) + (deangeloPearsQty * deangeloPearsPrc)
				+ (sunKistOrangQty * sunKistOrangPrc) + (potChipsPlainQty * potChipsPlainPrc)
				+ (potChipsBbqQty * potChipsBbqPrc) + (breadLoafQty * breadLoafPrc) + (eggsDozQty * eggsDozPrc)
				+ (butterQty * butterPrc) + (milkWholeQty * milkWholePrc) + (vegOilCanolaQty * vegOilCanolaPrc)
				+ (vegOilOliveQty * vegOilOlivePrc) + (spamCanQty * spamCanPrc);

		System.out.println("Thank you for your purchase! Your total amount due is" + dollar + totalSale);

		System.out.println("Please note: The automated cash teller cannot process more than $100.00");

		while (true) {

			System.out.println(
					"Please enter the amount of cash entered into the automated checkout receptacle in the space provided.");
			double cashTendered = keyboard.nextDouble();

			if (cashTendered < totalSale) {
				System.out.println(
						"The amount you are tendering is less than the value of the items you want to purchase.");
				continue;
			} else {

				double change = cashTendered - totalSale;
				System.out.println("Thank you! Your change is" + dollar + change);

				int changeCents = (int) change;

				changeCents = (int) (change * 100);

				int twentyBill = changeCents / 2000;
				changeCents = changeCents - twentyBill * 2000;
				int tenBill = changeCents / 1000;
				changeCents = changeCents - tenBill * 1000;
				int fiveBill = changeCents / 500;
				changeCents = changeCents - fiveBill * 500;
				int oneBill = changeCents / 100;
				changeCents = changeCents - oneBill * 100;
				int quarters = changeCents / 25;
				changeCents = changeCents - quarters * 25;
				int dimes = changeCents / 10;
				changeCents = changeCents - dimes * 10;
				int nickels = changeCents / 5;
				changeCents = changeCents - nickels * 5;
				int pennies = changeCents / 1;
				changeCents = changeCents - pennies * 1;

				System.out.println("Please recover your change from the automated teller's dispensing tray.");
				System.out.println(
						"Review the change provided. You should have been provided with the following denominations:");
				System.out.println("Twenty Dollar Bills: " + twentyBill);
				System.out.println("Ten Dollar Bills: " + tenBill);
				System.out.println("Five Dollar Bills: " + fiveBill);
				System.out.println("One Dollar Bills: " + oneBill);
				System.out.println("Quarters: " + quarters);
				System.out.println("Dimes: " + dimes);
				System.out.println("Nickels: " + nickels);
				System.out.println("Pennies: " + pennies);

				System.out.println(
						"Thank you for shopping at Distillery's Cash and Carry where great prices and freshness are guaranteed!");
				break;
			}

		}
		keyboard.close();
	}

}
