package com.arrays;
//101. Java Program to determine whether two matrices are equal

import java.util.Scanner;

public class TwoMatricesAreEqual {
	public void checkEquals(int[][] a, int b[][], int row, int col) {
		boolean fl = false;
		outerloop: for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				if (a[i][j] == b[i][j]) {
					fl = true;
					continue;
				} else {
					System.out.println("Not equal");
					fl = false;
					break outerloop;
				}
			}
		}
		if (fl == true)
			System.out.println("Equal");
	}

	public static void main(String[] args) {
		TwoMatricesAreEqual obj = new TwoMatricesAreEqual();
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[10][10];
		int b[][] = new int[10][10];
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
		System.out.println("Enter the matrix value of B : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		sc.close();
		obj.checkEquals(a, b, row, col);
	}

}
