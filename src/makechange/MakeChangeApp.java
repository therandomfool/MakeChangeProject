package makechange;

import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
//		open scanner
			Scanner sc = new Scanner(System.in);
			
//			enter price of item
			System.out.print("Enter Price: ");
			double price = sc.nextDouble();
			
//			enter what you are paying with
			System.out.print("Enter how much you pay with: ");
			double paid = sc.nextDouble();
			
//			pass price and paid into Cash() method
			Cash(paid, price);
							
			
//			close scanner
			sc.close();
				}
				

		public static double Cash(double paid, double price) {
			
//			determine what the diff is between price and paid
			double change = (paid-price);
			
			
//			determine short, exact or overpayment
			if (paid < price) {
				System.out.println("HEY!!! YOU SHORTED ME!!");
			} 
			else if (paid == price) {
				System.out.println("Thank You for the exact change!!");
			}
			else if (paid > 20) {
				System.out.println("Sorry we dont take larger bills than twenties!");
			}
			else {
//				~~~~~~~~~~change logic~~~~~~~~~~
//				look at switch to compare logic choices
				double twenty  = (int)(change / 20);
				change = change % 20;
		
				double ten = (int)(change /10);
				change = change % 10;
		
				double five = (int)(change /5);
				change = change % 5;

				double one = (int)(change /1);
				change = change % 1;
		
				double quarter = (int)(change /.25);
				change = change % .25;
		
				double dime = (int)(change /.10);
				change = change % .10;
		
				double nickle = (int)(change /.05);
				change = change % .05;
		
				double penny = Math.round(change / .01);
//				change = change % .01;
//				look at alternative to Math.round??
//				
//				
				
//				change print to customer
				System.out.println("Your item is: " + price + "\n You paid with: " + paid + " is: \n Your change is: " + twenty + " Twenty: \n" + ten + " Ten: \n" 
						+ five + " Five: \n" + one + " One: \n" + quarter + " Quarter: \n" + dime + " Dime: \n" 
						+ nickle + " Nickle: \n" + penny + " Penny:");
			return change;
		}

	}
}