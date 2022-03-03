package com.arrays;

//99.Java Program to determine whether a given matrix is an identity matrix
import java.util.Scanner;

public class IdentityMatrix {
	public void identity(int[][] a, int row, int col) {
		int n = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				if (i == j && a[i][j] != 1) {
					n++;
				}
				if (i != j && a[i][j] != 0) {
					n++;
				}
			}
		}
		if (n != 0) {
			System.out.println("It's not identity array");
		} else {
			System.out.println("It's  identity array");
		}

	}

	public static void main(String[] args) {
		IdentityMatrix ob = new IdentityMatrix();
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[10][10];
		int row, col;
		System.out.println("Enter rows<10 : ");
		row = sc.nextInt();
		System.out.println("Enter col<10 : ");
		col = sc.nextInt();

		if (row == col) {
			System.out.println("Enter the matrix value of A : ");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			ob.identity(a, row, col);
		} else {
			System.out.println("Given array must be not  identity array");
		}

		sc.close();
	}

}
