package JavaLearn.JavaLearn;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables -> It is a container to store data
		/* Two types of variables
		 Primitive: Data is directly stored in the stack
		 Reference: Data is stored as memory in the stack where it will be in heap
		 Primitive					Reference
		 Integer					String
		 Byte						Arrays
		 Float						Object
		 Long
		 Double
		 Char
		 Boolean
		 */
		
		//Primitive Variable
		
		//integer
		int age=24;
		System.out.println("I am " + age +" Years Old");
		
		//double
		double price=17000.7;
		System.out.println("My Phone price is $" + price + " in the market");

		//char
		char letter='L';
		System.out.println("I love the letter " + letter);
		
		//Boolean
		boolean isStudent=false;
		System.out.println("You are a Student(true/false): " +isStudent);
		
		//Boolean in conditional statements
		if(isStudent) {
			System.out.println("You are a student");
		}
		else {
			System.out.println("You are NOT a student");
		}
		
		
		
		//String
				String name="Dharani";
				System.out.println("I am " + name);
	}

}
