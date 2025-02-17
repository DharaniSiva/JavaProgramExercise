package JavaLearn.JavaLearn;

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name;
		int age;
		boolean isStudent;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your name:");
		name=scanner.nextLine();
		System.out.println("Enter the age:");
		age=scanner.nextInt();
		System.out.println("Are you a Student(true/false):");
		isStudent=scanner.nextBoolean();
		
		if(name.isEmpty()) {
			System.out.println("You haven't enter your name yet!😡");
		}
		else {
			System.out.println("Hello " +name+"!.😊");
		}
		
		if(age<18) {
			System.out.println("You are a child👶");
		}
		else if(age>60) {
			System.out.println("You are a senior👵");
		}
		else if(age<0) {
			System.out.println("You haven't born yet😇");
		}
		else if(age==0) {
			System.out.println("You are a baby👼");
		}
		else {
			System.out.println("You are a adult👱‍♀️");
		}
		
		if(isStudent) {
			System.out.println("You are a Student🏫");
		}
		else {
			System.out.println("You are NOT a student🏢");
		}
		scanner.close();
	}

}
