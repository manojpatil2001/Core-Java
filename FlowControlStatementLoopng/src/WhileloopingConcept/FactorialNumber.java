package WhileloopingConcept;

public class FactorialNumber {

	// For Loop
	void FactorialNumbers(int start, int end) {

		int fact = 1;
		for (int i = start; i <= end; i++) {

			fact = fact * i;

		}
		System.out.println("factorial Number= " + fact);

	}

	// While Loop

	void FactorOneToFiveNumber() {

		int i = 1;
		int fact = 1;

		while (i <= 5) {

			fact = fact * i;
			i++;
		}
		
		System.out.println("Factorial  is: " + fact);

	}
	// Do-While Loop

	void PrintOneToFiveFactorial() {

		int i = 1;
		int fact = 1;

		do {
			

		} while (i <= 5);
		System.out.println("Factor : " + fact);
fact = fact * i;
			i++;
	}

}