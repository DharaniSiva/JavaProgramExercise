package loop.assignment1;

import java.util.Scanner;

public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Reversing a number :method2
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num =sc.nextInt();
		
		StringBuffer rev;
		StringBuffer sb=new StringBuffer();
		sb.append(num);
		rev=sb.reverse();
		System.out.println("Reverse of a number is:"+rev );
		
		sc.close();
	}

}
