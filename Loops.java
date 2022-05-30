package tutorial;

public class Loops {
	public static void main(String[] args){
		//Loops
		//While loop
		int i = 0;
		while(i < 5) {
			System.out.println(i);
			i++;
		}
		
		
		//Do/while loop
		int x = 5;
		do {
			System.out.println(x);
			x--;
		} while (x > 0);	
		
		//for loop
		int y = 0;
		for (y = 0; y < 10; y++) {
			System.out.println(y);
		}
		
		//for-each
		String[] cars = {"Volvo", "BMW", "Mazda"};
		for (String w : cars) {
			System.out.println(w);
		}
		
		//continue
		for (int z = 0; z < 5; z++) {
			if (z == 3) {
				continue;
			}
			System.out.println(z);
		}
		
		//break
		for (int h = 0; h < 5; h++) {
			if (h == 2) {
				break;
			}
			System.out.println(h);
		}
		
	}
}
