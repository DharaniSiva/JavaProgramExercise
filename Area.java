package JavaLearn.JavaLearn;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		//  Area of a rectangle
		
			double length=0;
			double breadth=0;
			double area=0;
			
			Scanner scanner=new Scanner(System.in);
			
			System.out.println("Enter the length:");
			length=scanner.nextDouble();
			
			System.out.println("Enter the breadth:");
			breadth=scanner.nextDouble();
			
			area=length * breadth;
			System.out.println("The area of the rectange= " +area+ "cm^2.");
			
			scanner.close();
	}

}
