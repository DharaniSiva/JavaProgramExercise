package JavaLearn.JavaLearn;

import java.util.Scanner;

public class ShoppingCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scanner=new Scanner(System.in);
	String item;
	double price;
	int num;
	char symbol='$';
	double total;
	
	System.out.println("Which item would you like to Buy?:");
	item=scanner.nextLine();
	System.out.println("What is the price of the item?:");
	price=scanner.nextDouble();
	System.out.println("How many would you like to buy?:");
	num=scanner.nextInt();
	
	total=price*num;
	System.out.println("You have bought "+num+" "+item + " and it's price is "+symbol+total+".");
	
	scanner.close();
	
	
	}

}
