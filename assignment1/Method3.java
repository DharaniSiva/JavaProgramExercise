package loop.assignment1;

import java.util.Scanner;

public class Method3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		StringBuilder sbl=new StringBuilder(String.valueOf(num));
		//sbl.append(num);
		StringBuilder rev=sbl.reverse();
		System.out.println("Reverse of a number:"+rev);
		sc.close();
	}

}
