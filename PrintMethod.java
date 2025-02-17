package JavaLearn.JavaLearn;

public class PrintMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// % [flags] [width] [.precision] [specifier-character]

		// [specifier-character]
		
		String name="Naruto";
		char letter='N';
		int age =29;
		double price=23.44;
		boolean isNinja=true;
		
		System.out.printf("Hello %s\n",name);
		System.out.printf("My name starts with the letter %c\n",letter);
		System.out.printf("I'm %d years old\n",age);
		System.out.printf("I bought a shuriken with the price %f rupees\n",price);
		System.out.printf("are you a ninja(true/false):%b\n",isNinja);
		
		// [.precision] 
		double num1=99.2201;
		double num2=83.91;
		double num3=78.3;
		System.out.printf("%.1f\n",num1);
		System.out.printf("%.2f\n",num2);
		System.out.printf("%.3f\n",num3);
		
		//[width]
		
		// + = output a plus
	       // , = comma grouping separator
	       // ( = negative numbers are enclosed in ()
	       // space = display a minus if negative, space if positive
		double num4=99.2201;
		double num5=834244.91;
		double num6=-78.3;
		double num7=46463.43;
		double num8=-4895.455;
		System.out.printf("%+.1f\n",num4);
		System.out.printf("%,.2f\n",num5);
		System.out.printf("%(.3f\n",num6);
		System.out.printf("% .3f\n",num7);
		System.out.printf("% .3f\n",num8);
		
		// [width]

	       // 0 = zero padding
	       // number = right justified padding
	       // negative number = left justified padding

	       int id1 = 1;
	       int id2 = 23;
	       int id3 = 456;
	       int id4 = 7890;

	       System.out.printf("id: %-4d\n", id1);
	       System.out.printf("id: %-4d\n", id2);
	       System.out.printf("id: %-4d\n", id3);
	       System.out.printf("id: %-4d\n", id4);
	}

}
