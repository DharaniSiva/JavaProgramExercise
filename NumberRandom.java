package JavaLearn.JavaLearn;

import java.util.Random;

public class NumberRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random=new Random();
		
		//random number generates from -2 billion to 2 billion
		int num;
		num=random.nextInt();
		System.out.println(num);
		
		//randomly generate number between 0 to 99
		int num1;
		num1=random.nextInt(100);
		System.out.println(num1);
		
		//random double number between 0 and 1
		double num2;
		num2=random.nextDouble();
		System.out.println(num2);
		
		
				//num4=random.nextInt(1,6); this works only in JAVA 17
				
				
		//random boolean
		boolean isTails;
		isTails=random.nextBoolean();
		System.out.println(isTails);
		
		if(isTails) {
			System.out.println("TAILS");
		}
		else {
			System.out.println("HEADS");
		}
		
	}

}
