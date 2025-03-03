package loop.assignment1;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// Palindrome of a number

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		int org_num=num;
		int rev=0;

		while(num!=0) {

			rev=rev*10+num%10;
			num=num/10;
		}
		
		if(org_num==rev) {
			System.out.println(rev+" is a Palindrome Number");
		}else {
			System.out.println(rev+" is not a Palindrome Number");
		}
		
		sc.close();
	}

}
