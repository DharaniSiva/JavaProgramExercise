package JavaLearn.JavaLearn;

public class MethodString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name ="Naruto Uzumaki";
		
		/*int length=name.length();//14
		char letter=name.charAt(0);//N
		int index=name.indexOf("U");//7
		int lastIndex=name.lastIndexOf("a");//11
		
		//name=name.toUpperCase();
		//name=name.toLowerCase();
		//name=name.trim();
		name=name.replace("a", "o");
		System.out.println(name);*/
		
		/*if(name.isEmpty()) {
			System.out.println("Your name is empty");
		}
		else {
			System.out.println("Hello "+name);
		}*/
		
		/*if(name.equals("password")) {
			System.out.println("Your name cant be password");
		}
		else {
			System.out.println("Hello "+name);
		}*/
		
		if(name.equalsIgnoreCase("password")) {
			System.out.println("Your name cant be password");
		}
		else {
			System.out.println("Hello "+name);
		}
		
		/*if(name.contains(" ")) {
			System.out.println("Your name contains spaces");
		}
		else {
			System.out.println("Hello "+name);
		}*/
		
		
		
	}

}
