package makechange;

import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				
				System.out.print("Enter Price of product: ");
				double price = sc.nextDouble();
				
				System.out.print("Enter how much you pay with: ");
				double paid = sc.nextDouble();
				
				double change = (paid-price);
	}

}
