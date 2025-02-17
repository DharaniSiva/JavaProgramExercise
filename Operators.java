package JavaLearn.JavaLearn;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Arithmetic operators
		int x=10;
		int y=2;
		int z;
		
		//add
		z=x+y;
		System.out.println(z);
		//subtract
		z=x-y;
		System.out.println(z);
		//multiplication
		z=x*y;
		System.out.println(z);
		//division
		z=x/y;
		System.out.println(z);
		//modulo
		z=x%y;
		System.out.println(z);
		
		
		//Augmented assignment Operators
		x+=y;  //add
		System.out.println(x);
		x-=y;//sub
		System.out.println(x);
		x*=y;//multiply
		System.out.println(x);
		x/=y;//Division
		System.out.println(x);
		x%=y;//modulo
		System.out.println(x);
		
		//increment decrement operators
		x++;
		System.out.println(x);
		x++;
		System.out.println(x);
		x--;
		System.out.println(x);
		
		//order of expression -> PEMDAS
		/* P-Parenthesis
		 * e-exponents
		 * m-multiplication
		 * d-division
		 * a-addition
		 * s-subtraction
		 */
	}

}
