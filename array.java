package tutorial;

public class array {
	public static void main(String[] args) {
		//arrays
		//loop through arrays
		String[] cars = {"Volvo", "BMW", "Mazda"};
		cars[0] = "Chevrolet";
		//for loop in strings
		for (String i : cars) {
			System.out.println(i);
		}
		
		String[] EuropeanTeams = {"Barcelona", "Real Madrid", "Bayern Munchen", "Liverpool"};
		for (String x : EuropeanTeams) {
			System.out.println(x);
		}
		
		//for-each loop
		for (String i : cars) {
			System.out.println(i);
		}
		
		//multidimensional arrays
		int [][] myNumbers = {{1,2,3,4},{5,6,7}};
		System.out.println(myNumbers[0][2]);
		
		//multidimensional loops
		for (int i = 0; i < myNumbers.length; ++i) {
			for (int j = 0; j < myNumbers[i].length; ++j) {
				System.out.println(myNumbers[i][j]);
			}
		}
	}
}
