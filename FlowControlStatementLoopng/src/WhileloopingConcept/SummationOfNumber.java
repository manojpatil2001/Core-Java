package WhileloopingConcept;

public class SummationOfNumber {

	// For loop
	void PrintSumOneTOTenNumber(int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum = sum + i;

		}
		System.out.println("Sum ="+sum);
	}

	// While Loop
	void SumOfNaturalNumber() {

		int i = 1;
		int sum = 0;

		while (i <= 10) {
			sum = sum + i;
			i++;
		}
		System.out.println("Sum of First 10 Natural Numbers is==" + sum);

	}

	// Do-while loop

	void SumNumber() {

		int i = 1;
		int sum = 0;

		do {
			sum = sum + i;
			i++;
		} while (i <= 10);
		System.out.println("one to tem summation of numbers= " + sum);
	}
}
