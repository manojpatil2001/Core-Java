package ForloopingConcept;

public class FactorExample {

	void FactorialValue() {
		int i = 1;
		int fact = 1;
		// It is the number to calculate factorial

		for (i = 1; i <= 5; i++) {
			fact = fact * i;
		}

		System.out.println("Factorial of " + fact);

	}
}
