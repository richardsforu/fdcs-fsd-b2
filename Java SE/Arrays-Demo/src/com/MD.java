package com;

public class MD {

	public static void main(String[] args) {

		/*
		 * Notes ------ -> Elements in the MD can be accessed by row wise
		 * 
		 * int[][] m;
		 * int m[][];
		 * int [][]m;
		 * int[][] m=new int[5][2];
		 * int [][]m=new int[3][3];
		 * 
		 */

		int marks[][] = { { 10, 20, 30 }, { 30, 40, 76 }, { 65, 34, 87 } };

		// System.out.println("No of rows: "+marks.length);
		// System.out.println("1st row no of cols: "+marks[1].length);

		for (int row = 0; row < marks.length; row++) { // outer loop
			for (int col = 0; col < marks[row].length; col++) { // inner loop
				System.out.print(marks[row][col] + "  ");
			}

			System.out.println();
		}

	}

}
