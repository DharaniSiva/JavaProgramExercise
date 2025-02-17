package JavaLearn.JavaLearn;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*A=P(1+ 
				n
				r
				​
				 ) 
				nt
				 
				Where:

				A = The future value of the investment/loan, including interest.
				P = The principal investment amount (the initial deposit or loan amount).
				r = The annual interest rate (decimal).
				n = The number of times that interest is compounded per year.
				t = The number of years the money is invested or borrowed for.
			*/
		
		Scanner scanner=new Scanner(System.in);
		
		double prinicipal;
		double rate;
		double num;
		double time;
		double amount;
		
		System.out.print("Enter the Principal amount:");
		prinicipal=scanner.nextDouble();
		
		System.out.print("Enter the annual interest rate in percent:");
		rate=scanner.nextDouble()/100;
		
		System.out.print("Enter the number of times that interest is compounded per year:");
		num=scanner.nextDouble();
		
		System.out.print("Enter the number of years the money is invested or borrowed :");
		time=scanner.nextDouble();
		
		amount=prinicipal*((1+rate/num )* Math.pow(num, time));
		
		System.out.println("Total Amount $"+amount+" received over the "+time+ " year(s).");
		scanner.close();
		
	}

	
}
