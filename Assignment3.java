package loop.assignment1;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		// Sum of digits of a number
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		int sum=0;
		while(num!=0) {
			sum=sum+num%10;
			num=num/10;
		}
		
		System.out.println("Sum of the digits of a number: "+sum);
		sc.close();

	}

}
