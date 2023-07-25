package WhileloopingConcept;

public class EvenOddNumber {

	void PrintEvenOddNumber() {
		int i, sum = 0;

		for (i = 1; i <= 5; i++) {
			sum = sum + i;
		}
		System.out.println("Sum of all even numbers from 1 to 5 = " + sum);

	}

}
