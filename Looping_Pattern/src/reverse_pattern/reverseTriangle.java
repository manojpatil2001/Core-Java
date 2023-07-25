package reverse_pattern;

public class reverseTriangle {

// $ $ $ $ $ 
// $ $ $ $ 
// $ $ $ 
// $ $ 
// $

	void triangle(int size) {

		for (int i = size; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {
				System.out.print(" $ ");
			}
			System.out.println();
		}

	}

//* * * * * 
//* * * * 
//* * * 
//* * 
//* 

	void triangle1(int size) {

		for (int i = size; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

//5 5 5 5 5 
//4 4 4 4
//3 3 3 
//2 2
//1

	void pattern1(int size) {

		for (int i = size; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {

				System.out.print(" " + i + " ");

			}
			System.out.println();
		}
	}

//1 1 1 1 1
//2 2 2 2
//3 3 3 
//4 4
//5
	void pattern2(int size) {

		for (int i = 0; i < size; i++) {
			
			for (int j = size; j > i; j--) {
				
				System.out.print(" " + (i + 1) + " ");
			}
			System.out.println();
		}

	}
}
