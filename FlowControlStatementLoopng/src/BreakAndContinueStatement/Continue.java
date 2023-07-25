package BreakAndContinueStatement;

public class Continue {
//Forloop
	void PrintOneToTenContinueStatement(int start, int end, int step) {

		for (int i = start; i <= end; i = i + step) {
			if (i == 4) {
				continue;

			} else {
				System.out.println(i);
			}

		}
	}

//whileloop
	void PrintOneToFive() {
		int i = 1;
		while (i <= 10) {

			if (i == 5) {
				continue;
			} else {
				System.out.print(i);
				i++;
			}

		}
	}

	// Do-while loop
	void printOneToTen() {
		int i = 1;
		do {
			if (i == 5) {
				continue;
			} else
				System.out.println(i);
			i++;

		} while (i <= 10);
	}
}
