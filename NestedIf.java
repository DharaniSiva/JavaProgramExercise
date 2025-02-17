package JavaLearn.JavaLearn;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner=new Scanner(System.in);
		
		double price=9.99;
		boolean isStudent=false;
		boolean isSenior=true;
		
		if(isStudent) {
			if(isSenior) {
				System.out.println("You get a discount of 10% as you are student");
				System.out.println("You get a discount of 20% as you are senior");
				price*=0.7;
			}
			else {
			System.out.println("You get a discount of 10% as you are student");
			price*=0.9;
			}
		}
		else {
			if(isSenior) {
				
				System.out.println("You get a discount of 20% as you are senior");
				price*=0.8;
			}
			else {
			price*=1;
			}
		}
		System.out.printf("The Price: $%.2f",price);
		scanner.close();
	}

}
