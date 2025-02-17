package JavaLearn.JavaLearn;

import java.util.Scanner;
public class UserInput {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//To Get UserInput in JAVA
		
		
		Scanner scanner=new Scanner(System.in);
		
		//String -> nextLine
				System.out.print("Enter your name: " );
				String name=scanner.nextLine();
				System.out.println("I am " + name);
				
		
		//String ->next (next will print only the first it will not print the word after space 
		
		System.out.print("Enter your food: " );
		String food=scanner.next();
		System.out.println("I love " + food);
		
		//Integer
		System.out.print("Enter your age: " );
		int age=scanner.nextInt();
		System.out.println("I am " + age + " Years old");
		scanner.nextLine();

		//String -> nextLine
		System.out.print("Enter your color: " );
		String color=scanner.nextLine();
		System.out.println("You like " + color);
		
		
		//Double
		System.out.println("Enter your GPA:");
		double gpa=scanner.nextDouble();
		System.out.println("My GPA in college : " +gpa);
		
		
		scanner.close();
		
		
	}

}
