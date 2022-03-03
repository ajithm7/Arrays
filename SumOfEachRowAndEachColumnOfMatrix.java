package com.arrays;
//105. Java Program to find the sum of each row and each column of a matrix
import java.util.Scanner;

public class SumOfEachRowAndEachColumnOfMatrix {
	void sumOfEachRow(int [][]a,int row,int col){
		System.out.println("Sum of Each row : ");
		for(int i=0;i<row;i++) {
			int sumRow=0;
			for(int j=0;j<col;j++) {
				
				sumRow+=a[i][j];
			}
			System.out.println("Sum of "+(i+1)+" row is : "+sumRow);
		}
	}
	void sumOfEachCol(int [][]a,int row,int col){
		System.out.println("Sum of Each column : ");
		for(int i=0;i<col;i++) {
			int sumCol=0;
			for(int j=0;j<row;j++) {
				
				sumCol+=a[j][i];
			}
			System.out.println("Sum of "+(i+1)+" row is : "+sumCol);
		}
		
	}
	

	public static void main(String[] args) {
		SumOfEachRowAndEachColumnOfMatrix obj=new SumOfEachRowAndEachColumnOfMatrix();
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
		obj.sumOfEachRow(a,row,col);
		obj.sumOfEachCol(a,row,col);
		sc.close();
		
	}

}
