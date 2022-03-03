package com.arrays;
//103. Java Program to display the upper triangular matrix

import java.util.Scanner;

public class UpperTriangularMatrix {

	void upperTriAngle(int[][] a, int row, int col) {

		if (row != col) {
			System.out.println("Matrix should be a Square Matrix");
			return;
		} else {
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					if (i > j) {
						a[i][j] = 0;
					}
				}
			}

			System.out.println("Upper Triangular Matrix is given by :");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		UpperTriangularMatrix obj = new UpperTriangularMatrix();
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
