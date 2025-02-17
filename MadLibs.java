package JavaLearn.JavaLearn;

import java.util.Scanner;

public class MadLibs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
		String adjective1,adjective2;
		String noun1,verb1;
		String adjective3;
		
		System.out.println("Enter a adjective(description):");
		adjective1=scanner.nextLine();
		System.out.println("Enter a noun(person or animal):");
		noun1=scanner.nextLine();
		System.out.println("Enter a action(description):");
		verb1=scanner.nextLine();
		System.out.println("Enter a adjective(description):");
		adjective2=scanner.nextLine();
		System.out.println("Enter a adjective(description):");
		adjective3=scanner.nextLine();
		
		
		 System.out.println("\nToday I went to a " + adjective1 + " zoo.");
	        System.out.println("In an exhibit, I saw a " + noun1 + ".");
	        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
	        System.out.println("I was " + adjective3 + "!");
	        
	        scanner.close();
	        
	}

}
