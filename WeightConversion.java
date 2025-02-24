package JavaLearn.JavaLearn;

import java.util.Scanner;

public class WeightConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		double weight;
		double weight2;
		int choice;
		
		System.out.println("Weight Conversion Program");
		System.out.println("1.Convert kgs to lbs");
		System.out.println("2.Convert lbs to kgs");
		System.out.print("Enter your choice:");
		choice=scanner.nextInt();
		
		
		
		if(choice==1) {
			System.out.print("Enter your weight in kgs:");
			weight=scanner.nextDouble();
			weight2=weight *2.20462;
			System.out.printf("Your weight is %.2f lbs",weight2);
		}
		else if(choice==2) {
			System.out.print("Enter your weight in lbs:");
			weight=scanner.nextDouble();
			weight2= weight *0.453592;
			System.out.printf("Your weight is %.2f kgs",weight2);
		}
		else {
			System.out.println("This is not a valid choice");
		}
		
		scanner.close();
	}

}
