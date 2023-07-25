package com.patter;

public class ForLoop_Pattern {

	void method1() {
		System.out.println("*");
	}

	void method2() {
		System.out.print("* * * * *");
	}

	void method3() {

		// i = "rows"
		// j = "coloumn"
		for (int i = 1; i <= 2; i++) { // rows

			for (int j = 1; j <= 5; j++) { // coloumn
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

	void Alphabetpattern() {
		// condition mean = "iterature"?
		for (int i = 1; i <= 5; i++) {

			char ch = 'A';
			for (int j = 1; j <= 5; j++) {
				// System.out.print(" A ");
				System.out.print(ch);
			}
			System.out.println();
		}
	}

	// Display no of character in a row eg: A B C D E
	void alphaPattern() {
		char ch = 'A';
		for (int i = 1; i <= 5; i++) {
			System.out.print(" " + ch++ + " ");
		}
	}

	// Display on matrix character 5 * 5;
	void matrixPattern() {

		char ch = 'A';
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {

				System.out.print(" " + ch++ + " ");
			}
			System.out.println();
		}
	}

	// Display consecutive number in 2*3 matrix

	void twobyTreeMatrix() {

		for (int i = 1, k = 1; i <= 2; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(" " + k++ + " ");
			}
			System.out.println();
		}
	}
	//Display 1 2 3 4 5 in mutiple rows
	void consecutiveNumber() {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(" " + j + " ");
			}
			System.out.println();
		}
	}
}
