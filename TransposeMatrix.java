package com.arrays;
import java.util.Scanner;
//95.Java Program to display the transpose matrix
import com.program75.MatrixTranspose;
public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		MatrixTranspose trans=new MatrixTranspose();
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
		trans.transposeMat(row,col,a);
		sc.close();
	}

}
