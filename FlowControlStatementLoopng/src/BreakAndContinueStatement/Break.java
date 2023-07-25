package BreakAndContinueStatement;

public class Break {

	// For loop
	void OneToTenBreakStatement() {
		System.out.print("Forloop= ");
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break;
			} else {
				System.out.print(i);
			}
		}
	}

	// While loop
	void PrintOneToTen() {
		System.out.println();
		System.out.print("Whileloop= ");

		int i = 1;
		while (i <= 10) {

			if (i == 5) {
				break;
			} else {
				System.out.print(i);
				i++;
			}
		}
	}

	// Do While loop
	void printOneToTenStatement() {
		System.out.println();
		System.out.print("Dowhileloop= ");

		int i = 1;
		do {
			if (i == 5) {
			
				break;
			}

			System.out.print(i);
			i++;

		} while (i <= 10);
	}
}
