package ForloopingConcept;

public class EvenNumber {

	static int i;

	static void EvenNumReverseOrder() {

		for (i = 20; i >= 1; i--) {
			if (i % 2 == 0) {

				System.out.println("even no =" + i);
			}
		}

	}
}
