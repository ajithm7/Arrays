package com.arrays;
import java.util.Scanner;
//93.Java Program to find the product of two matrices
import com.program75.MultiplyTwoMatricesByPassingMatrixToFunction;
public class ProductOfTwoMatrices {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MultiplyTwoMatricesByPassingMatrixToFunction pro= new  MultiplyTwoMatricesByPassingMatrixToFunction();
		System.out.println("Enter row and column of matrix A :");
		int rowA, colA, rowB, colB;
		rowA = sc.nextShort();
		colA = sc.nextShort();
		System.out.println("Enter row and column of matrix B :");
		rowB = sc.nextShort();
		colB = sc.nextShort();
		int a[][] = new int[rowA][colA];
		int b[][] = new int[rowB][colB];

		if (colA == rowB) {
			System.out.println("Enter row and column values of matrix A :");
			for (int i = 0; i < rowA; i++) {
				for (int j = 0; j < colA; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			System.out.println("Enter row and column values of matrix B :");
			for (int i = 0; i < rowB; i++) {
				for (int j = 0; j < colB; j++) {
					b[i][j] = sc.nextInt();
				}
			}
			sc.close();

			pro.multiMatrix(a, b, rowA,colA, rowB, colB);

	}

}
}