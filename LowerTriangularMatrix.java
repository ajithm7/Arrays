package com.arrays;
//102. Java Program to display the lower triangular matrix

import java.util.Scanner;

public class LowerTriangularMatrix {
	void upperTriAngle(int[][] a, int row, int col) {

		if (row != col) {
			System.out.println("Matrix should be a Square Matrix");
			return;
		} else {
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					if (i < j) {
						a[i][j] = 0;
					}
				}
			}

			System.out.println("Lower Triangular Matrix is given by :");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		LowerTriangularMatrix obj = new LowerTriangularMatrix();
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[10][10];
		int row, col;
		System.out.println("Enter rows<10 : ");
		row = sc.nextInt();
		System.out.println("Enter col<10 : ");
		col = sc.nextInt();
		System.out.println("Enter the matrix value of A : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		obj.upperTriAngle(a, row, col);
		sc.close();
	}

}
