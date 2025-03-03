package loop.assignment1;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		// Count of the number of digits

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		int count=0;
		
		while(num!=0) {
			num=num/10;
			count++;
		}
		
		System.out.println("Total number of digits in the number:"+count);
		
		sc.close();
	}

}
