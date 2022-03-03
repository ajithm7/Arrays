package com.arrays;

//100. Java Program to determine whether a given matrix is a sparse matrix
import java.util.Scanner;

public class SparseMatrix {
	public void sparseMatrix(int[][] a, int row, int col) {
		int n = 0, m = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				if (a[i][j] == 0) {
					n++;
				}
				if (a[i][j] != 0) {
					m++;
				}
			}
		}
		if (n > m) {
			System.out.println("It's Sparse Matrix array");
		} else {
			System.out.println("It's not Sparse Matrix array");
		}

	}

	public static void main(String[] args) {
		SparseMatrix obj = new SparseMatrix();
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
		obj.sparseMatrix(a, row, col);
		sc.close();
	}
}
