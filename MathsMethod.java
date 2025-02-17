package JavaLearn.JavaLearn;

import java.util.Scanner;

public class MathsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Math.PI);//PI Value
		System.out.println(Math.E);//Eulers number Value
		
		double result;
		result=Math.sqrt(2);
		result=Math.pow(2, 3);
		result=Math.abs(-9);
		result=Math.round(2.56);
		result=Math.ceil(2.56);
		result=Math.floor(2.56);
		System.out.println(result);
		
		//Hypotenuse of a rectange -> c=square root of a^2+b^2
		
		Scanner scanner=new Scanner(System.in);
		double a,b,c;
		
		System.out.print("Enter the length side A:");
		a=scanner.nextDouble();
		System.out.print("Enter the length side B:");
		b=scanner.nextDouble();
		
		c=Math.sqrt(Math.pow(a, 2)+ Math.pow(b, 2));
		
		System.out.println("The Hypotenuse of the rectangle is:"+c+"cm.");
		
		// circumference = 2 * Math.PI * radius;
        // area = Math.PI * Math.pow(radius, 2);
        // volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)
		
		double radius;
		double circumference,area,volume;
	    
		System.out.print("Enter the radius");
		radius=scanner.nextDouble();
		
		circumference=2 * Math.PI* radius;//2piR
		System.out.println("The circumference is:"+circumference);
		System.out.printf("The circumference is: %.1f\n",circumference);
		area= Math.PI * Math.pow(radius, 2);//piR
		System.out.println("The Area is:"+area);
		System.out.printf("The Area is:%.1f\n",area);
		volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);//4/3pir3
		System.out.println("The Volume is:"+volume);
		System.out.printf("The Volume is:%.1f\n",volume);
		
		scanner.close();
	}
}

