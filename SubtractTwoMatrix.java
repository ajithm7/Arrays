package com.arrays;
//98.Java Program to subtract the two matrices
import java.util.Scanner;

public class SubtractTwoMatrix {
	
	public void  subtraction(int[][] a,int[][] b,int row,int col) {
		int c[][] = new int[10][10];
		
		for (int i = 0; i < row; i++) {
			
			for (int j = 0; j < col; j++) {
				c[i][j] = a[i][j] - b[i][j];
			}
		}
		System.out.println("Subtraction of two matrix is ");
		{
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					System.out.print(c[i][j]+"  ");
				}
				System.out.println();
			}

		}
		}
	

	public static void main(String[] args) {
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
		SubtractTwoMatrix sub=new SubtractTwoMatrix();
		
        
		sub.subtraction(a,b,row,col);
		sc.close();
	}

}