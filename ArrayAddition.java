package com.arrays;
//92.Java Program to add two matrices

import java.util.Scanner;

import com.program75.MatrixAddition;

public class ArrayAddition extends MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		MatrixAddition add = new MatrixAddition();
		add.addition(a, b, row, col);
		sc.close();
	}

}
