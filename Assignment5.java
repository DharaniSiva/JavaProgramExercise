package loop.assignment1;

import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		//Count of even and odd digits in number
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		int num1;
		int evenCount=0,oddCount=0;
		while(num!=0) {
			
			num=num/10;
			num1=num%10;
			
			if(num1%2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
			
		}
		
		System.out.println("Even Number count is "+evenCount+". Odd Number count is "+oddCount+".");
		sc.close();
	}

}
