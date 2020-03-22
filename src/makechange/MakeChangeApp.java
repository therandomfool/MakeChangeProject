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
//			double paid = 0.0;
			System.out.println("What denomination do want to pay with? \n1) 100 \n2) 50 \n3) 20 \n4) 10 \n5) 5 \n6) 1 \n7) .25 \n8) .10 \n9) .05 \n0) .01\t");
			int pd = (int) sc.nextDouble();
			
			double paid = 0;
			
			switch(pd) {
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
            	paid = .25;
            	break;
            case 8:
            	paid = .10;
            	break;
            case 9:
            	paid = .05;
            	break;
            default:
            System.out.println("Thats not U.S. Currrency!");
            break;
			}
        
//			double paid = sc.nextDouble();
			
			paid = Math.round(paid);
			
//			pass price and paid into Cash() method
			Cash(paid, price);
							
			System.out.println("Would you like to purchase something else?\t 1) Yes 2) No ");
			int answ = sc.nextInt();
			
			if (answ == 2) {
				i++;
				System.out.println("Thank you coming in!!  Please shop with us again");
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
				System.out.println("HEY!!! YOU SHORTED ME!!\n");
			} 
			else if (paid == price) {
				System.out.println("Thank You for the exact change!!\n");
			}
			else {
//				~~~~~~~~~~change logic~~~~~~~~~~

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
				System.out.println("\tYour item cost is: " + (double)price + "\n \tYou paid with: " + (double)paid + " is: \n \tYour change is: \n\n" + (int)twenty + " Twenty" + tw + "\n" + (int)ten + " Ten" + tn + "\n" 
						+ (int)five + " Five" + fv + "\n" + (int)one + " One" + on + "\n" + (int)quarter + " Quarter" + qt + "\n" + (int)dime + " Dime" + dm + "\n" 
						+ (int)nickle + " Nickle" + nk + "\n" + (int)penny + " Penny:\n \n");
				
				
			
		}
		

	}
}