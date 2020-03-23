package makechange;

import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {

//		open scanner
		Scanner sc = new Scanner(System.in);

		System.out.println("***** Welcome to Random's Virtual Skill Distillery Store!!! *****\n");

		pGreet();

		int i = 0;
		while (i == 0) {

//			enter price of item
			System.out.print("Enter Price of item you wish to purchase: \n");
			double price = sc.nextDouble();

//			enter what you are paying with

			System.out.println(
					"\nWhat denomination do want to pay with? \n1) 100 \n2) 50 \n3) 20 \n4) 10 \n5) 5 \n6) 1 \n7) .50 \n8) .25 \n9) .10 \n10) .05 \n");
			int pd = (int) sc.nextDouble();

			double paid = 0;

			switch (pd) {
			case 0:
				paid = .01;
				break;
			case 1:
				paid = 100.00;
				break;
			case 2:
				paid = 50.00;
				break;
			case 3:
				paid = 20.00;
				break;
			case 4:
				paid = 10.00;
				break;
			case 5:
				paid = 5.00;
				break;
			case 6:
				paid = 1.00;
				break;
			case 7:
				paid = .50;
				break;
			case 8:
				paid = .25;
				break;
			case 9:
				paid = .10;
				break;
			case 10:
				paid = .05;
				break;
			default:
				System.out.println("Thats not U.S. Currrency!");
				break;
			}
//				pass price and paid into Cash() method
			Cash(paid, price);

			System.out.println("Would you like to purchase something else?\t 1) Yes 2) No \n");
			int answ = sc.nextInt();

			if (answ == 2) {
				i++;
				System.out.println("Thank you coming in!!  Please shop with us again");
			} else {
				i = 0;
				continue;
			}

//				close scanner
			sc.close();

		}

	}

// 			Cash method for denomination logic
	public static void Cash(double paid, double price) {
		String tw, tn, fv, on, ft, qt, dm, nk;

//			determine what the diff is between price and paid
		double change = (paid - price);

//			determine short, exact or overpayment

		if (paid < price) {
			System.out.println("HEY!!! YOU SHORTED ME!!\n");
		} else if (paid == price) {
			System.out.println("Thank You for the exact change!!\n");
		} else {

//				~~~~~~~~~~change logic with plural string add on~~~~~~~~~~

			double twenty = (int) (change / 20);
			change = change % 20;
			if (twenty > 1) {
				tw = "s";
			} else {
				tw = " ";
			}

			double ten = (int) (change / 10);
			change = change % 10;
			if (ten > 1) {
				tn = "s";
			} else {
				tn = " ";
			}

			double five = (int) (change / 5);
			change = change % 5;
			if (five > 1) {
				fv = "s";
			} else {
				fv = " ";
			}

			double one = (int) (change / 1);
			change = change % 1;
			if (one > 1) {
				on = "s";
			} else {
				on = " ";
			}

			double fiftyC = (int) (change / .50);
			change = change % .50;
			if (fiftyC > 1) {
				ft = "s";
			} else {
				ft = " ";
			}

			double quarter = (int) (change / .25);
			change = change % .25;
			if (quarter > 1) {
				qt = "s";
			} else {
				qt = " ";
			}

			double dime = (int) (change / .10);
			change = change % .10;
			if (dime > 1) {
				dm = "s";
			} else {
				dm = " ";
			}

			double nickle = (int) (change / .05);
			change = change % .05;
			if (nickle > 1) {
				nk = "s";
			} else {
				nk = " ";
			}

			double penny = Math.round(change / .01);

//              printf() to round the doubles to two places
			System.out.printf("\tYour item cost is: $%.2f", (double) price);
			System.out.printf("\n \tYou paid with: $%.2f", (double) paid);
			System.out.printf("\n\n \tYour change is: $%.2f", (paid - price));

//				change print to customer
			System.out.println("\n\n" + (int) twenty + " ~Twenty" + tw + "\n" + (int) ten + " ~Ten" + tn + "\n"
					+ (int) five + " ~Five" + fv + "\n" + (int) one + " ~One" + on + "\n" + (int) fiftyC + " ~Fifty Cent piece" + ft + "\n" + (int) quarter + " ~Quarter"
					+ qt + "\n" + (int) dime + " ~Dime" + dm + "\n" + (int) nickle + " ~Nickle" + nk + "\n"
					+ (int) penny + " ~Pennies\n \n");

		}
	}

//	personal greeting method
	public static void pGreet() {

		int x = 0;
		while (x == 0) {
			int instructor;
			System.out.println("Which instructor is entering Random's Virtual Skill Disitillery Store?");
			System.out.println("1) Rob");
			System.out.println("2) Anthony");
			System.out.println("3) Jeremy");
			System.out.println("4) Alex");
			System.out.println("5) Dee");
			System.out.println("6) Emily");
			System.out.println("7) Mystery Instructor");

			Scanner sc = new Scanner(System.in);
			instructor = sc.nextInt();

			String sensi = "";

			switch (instructor) {
			case 1:
				sensi = "Rob";
				x = 1;
				break;
			case 2:
				sensi = "Anthony";
				x = 1;
				break;
			case 3:
				sensi = "Jeremy";
				x = 1;
				break;
			case 4:
				sensi = "Alex";
				x = 1;
				break;
			case 5:
				sensi = "Dee";
				x = 1;
				break;
			case 6:
				sensi = "Emily";
				x = 1;
				break;
			case 7:
				sensi = "Mystery Instructor";
				x = 1;
				break;
			default:
				System.out.println("AUTHORIZED PERSONEL ONLY \n\n");

			}
//			close scanner
//			sc.close();
			if (x == 1) {
				System.out.println("\nHello " + sensi + ", shall we get down to business?\n\n");
			} else {
				x = 0;
			}

		}
	}
}
