package tutorial;

public class Conditinoals {
	public static void main(String[] args) {
		//Conditionals
		double nota = 9.2;
		
		if (nota >= 9.0) {
			System.out.println("Voce esta acima da media. Parabens!");
		} else if (nota > 5.0){
			System.out.println("Voce esta na media!");
		} else if (nota >= 1.0) {
			System.out.println("Sua nota e pessima. Busque melhorar!");
		} else {
			System.out.println("Sua nota e horrivel.");
		}
		
		//ternary operator
		double nota2 = 9.6;
		String result = (nota2 > 9.0)? "Aprovado" : "Reprovado";
		System.out.println(result);
		
		//Using a string in a conditional
		String name1 = "Eduardo";
		if (name1.equals("Eduardo")) {
			System.out.println("Your name is " + name1);
		}
		
		//switch
		int day = 9;
		
		switch(day) {
		case 1 :
			System.out.println("Monday");
			break;
		case 2 :
			System.out.println("Tuesday");
			break;
		case 3 :
			System.out.println("Wednesday");
			break;
		case 4 : 
			System.out.println("Thursday");
			break;
		case 5 :
			System.out.println("Friday");
			break;
		case 6 :
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
		default :
			System.out.println("ERROR! not a week day.");
			break;
		}
	}
}
