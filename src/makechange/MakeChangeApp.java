package makechange;

import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
//		open scanner
		
		System.out.println(" Welcome to Random's Store!!!");
		int i = 0;
		while (i == 0){

			Scanner sc = new Scanner(System.in);
			
//			enter price of item
			System.out.print("Enter Price: ");
			double price = sc.nextDouble();
			
//			enter what you are paying with
			System.out.print("Enter how much you pay with: ");
			double paid = sc.nextDouble();
			
//			pass price and paid into Cash() method
			Cash(paid, price);
							
			System.out.println("Would you like to purchase something else?\t 1) Yes 2) No ");
			int answ = sc.nextInt();
			
			if (answ == 2) {
				i++;
				System.out.println("Thank you coming in!!");
			} 
			else {
				i=0;
				continue;
			}
		
//			close scanner
			sc.close();
		}
			
				}
				

		public static void Cash(double paid, double price) {
			String tw,
					tn,
					fv,
					on,
					qt,
					dm,
					nk;
//			determine what the diff is between price and paid
			double change = (paid-price);
			
			
//			determine short, exact or overpayment
			if (paid < price) {
				System.out.println("HEY!!! YOU SHORTED ME!!");
			} 
			else if (paid == price) {
				System.out.println("Thank You for the exact change!!");
			}
			else {
//				~~~~~~~~~~change logic~~~~~~~~~~
//				look at switch to compare logic choices
				double twenty  = (int)(change / 20);
				change = change % 20;
				if (twenty > 1) {
					tw = "s";
				}
				else {
					tw = " ";
				}
		
				double ten = (int)(change /10);
				change = change % 10;
				if (ten > 1) {
					tn = "s";
				}
				else {
					tn = " ";
				}
		
				double five = (int)(change /5);
				change = change % 5;
				if (five > 1) {
					fv = "s";
				}
				else {
					fv = " ";
				}

				double one = (int)(change /1);
				change = change % 1;
				if (one > 1) {
					on = "s";
				}
				else {
					on = " ";
				}
		
				double quarter = (int)(change /.25);
				change = change % .25;
				if (quarter > 1) {
					qt = "s";
				}
				else {
					qt = " ";
				}
		
				double dime = (int)(change /.10);
				change = change % .10;
				if (dime > 1) {
					dm = "s";
				}
				else {
					dm = " ";
				}
		
				double nickle = (int)(change /.05);
				change = change % .05;
				if (nickle > 1) {
					nk = "s";
				}
				else {
					nk = " ";
				}
		
				double penny = Math.round(change / .01);
//				change = change % .01;
//				look at alternative to Math.round??
//				
//				
				
//				change print to customer
				System.out.println("\tYour item is: " + price + "\n \tYou paid with: " + paid + " is: \n \tYour change is: \n" + (int)twenty + " Twenty" + tw + "\n" + (int)ten + " Ten" + tn + "\n" 
						+ (int)five + " Five" + fv + "\n" + (int)one + " One" + on + "\n" + (int)quarter + " Quarter" + qt + "\n" + (int)dime + " Dime" + dm + "\n" 
						+ (int)nickle + " Nickle" + nk + "\n" + (int)penny + " Penny:\n \n");
				
				
			
		}
		

	}
}