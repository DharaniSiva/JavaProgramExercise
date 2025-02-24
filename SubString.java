package JavaLearn.JavaLearn;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		String userName;
		String email;
		String domain;
		
		System.out.println("Enter your Email:");
		email=scanner.nextLine();
		
		if(email.contains("@")) {
		userName=email.substring(0, email.indexOf("@"));
		domain=email.substring(email.lastIndexOf("@"));
		
		System.out.println(userName);
		System.out.println(domain);
		}
		else {
			System.out.println("Enter a valid email");
		}
		scanner.close();
	}

}
