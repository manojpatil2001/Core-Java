package WhileloopingConcept;

public class ReverseDigit {
	static void PrintReverseDigits(int start , int end ,int step) {

		for(int i = start; i >= end; i = i-step) {
		//	System.out.println(i);
			System.out.print(i);
		}
	}
}

