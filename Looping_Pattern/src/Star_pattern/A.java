package Star_pattern;

public class A {

	// *
	// * *
	// * * *
	// * * * *
	void Pattern(int size) {
		for (int i = 1; i <= size; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(" * ");
			}
			System.out.println();

		}
	}
//A 
//B B
//C C C 
//D D D D
//E E E E E 

	void Pattern1(int size) {

		char ch = 'A';
		for (int i = 1; i <= size; i++, ch++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(" " + ch + " ");
			}
			System.out.println();

		}
	}
//A
//A B
//A B C
//A B C D
//A B C D E

	void Pattern2(int size) {

		for (int i = 1; i <= size; i++) {

			char ch = 'A';

			for (int j = 1; j <= i; j++, ch++) {

				System.out.print(" " + ch + " ");
			}
			System.out.println();

		}
	}

//A
//B C
//D E F
//G H I J
//K L M N O
	void Pattern3(int size) {

		char ch = 'A';
		for (int i = 1; i <= size; i++) { // row

			for (int j = 1; j <= i; j++, ch++) { // cloumn
				System.out.print(" " + ch + " ");
			}

			System.out.println();

		}

	}
}
