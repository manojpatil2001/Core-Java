package com.TwoDArray;

public class oneAndTwodArray {

	public static void main(String[] args) {

//One D Array
//		int[] innerArray = new int[3];
//
//		innerArray[0] = 10;
//		innerArray[1] = 20;
//		innerArray[2] = 30;
//
//		for (int num : innerArray) {
//			System.out.println(num);
//		}
//
//	}

//Two D Array

	int[][] outerArray = new int[2][2];

	outerArray[0][0]=10;
	outerArray[0][1]=20;
	outerArray[1][0]=30;
	outerArray[1][1]=40;
	
//	System.out.println(outerArray[0][0]);
//	System.out.println(outerArray[0][1]);

	for(int[] inner:outerArray)
	{

		for (int num : inner) {

			System.out.println(num);
			}

		}
	}
}
