package loop.assignment1;

import java.util.Scanner;

public class Method1 {

	public static void main(String[] args) {
		
		//Reversing a number
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your reversing number:");
		int num = sc.nextInt();
		
		int rev=0;
		while(num!=0) {
			
			rev= rev*10 + num%10; //modulo will provide the remainder
			num=num/10;  // division will eliminate the last value
			
		}
		
		System.out.println("Reverse of the number is:"+rev);
		sc.close();
	}

}
