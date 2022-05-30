package tutorial;

public class Main {
	public static void main(String[] args) {
		//These are also primitive data types
		int hello_world = 5; //integers
		double num2 = 3.4; //Floating numbers
		boolean b = true; //Boolean value (true/false)
		char c = 't'; //Character value (can only be one)
		
		//This is an non-primitive data type
		String str = "Tim";
		
		int tim = hello_world;
		
		//assigning a variable without value, then call the value later
		int age;
		age = 18;
		
		//Final variables
		final String brazilianLang = "Portuguese";
		
		//Multiple variables
		int b1 = 5, b2 = 2, b3 = 3;
		
		//Variables with the same value
		int x1, x2, x3;
		x1 = x2 = x3 = 8;
	
		//Operators
		int x = 100;
		int y = 50;
		int result = x + y;
		
		//Divide #Needs to use double to obtain a floating result
		double a1 = 10;
		double a2 = 3;
		double d = a1 / a2;
			
		//Can also be used to connect strings and other values
		String name = "Eduardo ";
		String lastName = "Firmino";
		String fullName = name + lastName;
		
		//Type casting
		//widening casting (automatic)
		int number1 = 15;
		double number2 = number1;
		
		//Narrowing casting (manually)
		double myDouble = 27.4d;
		int myInt = (int) myDouble;
		
		//Java math 
		//random numbers
		int randomNum0to100 = (int) (Math.random() * 101); // Return a value between 0 and 100
		double randomNum0to1 = Math.random();
		
		double myAbsolute = Math.abs(-4.3); 
		int myMax1 = 8;
		int myMax2 = 4;
		int max = Math.max(myMax1, myMax2);
		int min = Math.min(myMax1, myMax2);		
		double squareRoot = Math.sqrt(9);

		//Strings
		String myString1 = "camelCase";
		String backslsh = "This \\ is a backslash";
		
		System.out.println(myString1.toLowerCase());
		System.out.println(myString1.toUpperCase());
		System.out.println(myString1.length());
		System.out.println(myString1.indexOf('a'));
		System.out.println(backslsh);

		System.out.println(number2);
		System.out.println(myInt);
				
		System.out.println(name.concat(lastName));
		System.out.println("What's up?");
		System.out.println("How're you doing?");
		
		System.out.println(b1 + b2 + b3);
		System.out.println(x1 + x2 + x3);
		
		System.out.println(randomNum0to100);
		System.out.println(randomNum0to1);
		System.out.println(myAbsolute);
		System.out.println(max);
		System.out.println(min);
		System.out.println(squareRoot);
	}
}
