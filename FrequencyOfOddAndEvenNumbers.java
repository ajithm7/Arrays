package com.arrays;

//104. Java Program to find the frequency of odd & even numbers in the given
//matrix
import java.util.Scanner;

public class FrequencyOfOddAndEvenNumbers {

	void frequencyOfOdd(int[][] a, int row, int col) {
		int od = 0, e = 0;
		for (int i = 0; i < row; i++) {

			for (int j = 0; j < col; j++) {
				if (a[i][j] % 2 != 0) {
					od++;
				} else {
					e++;
				}
			}

		}
		System.out.println("Frequency of odd : " + od);
		System.out.println("Frequency of even : " + e);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrequencyOfOddAndEvenNumbers obj = new FrequencyOfOddAndEvenNumbers();
		Scanner sc = new Scanner(System.in);
		
		int row, col;
		System.out.println("Enter rows<10 : ");
		row = sc.nextInt();
		System.out.println("Enter col<10 : ");
		col = sc.nextInt();
		int[][] a = new int[row][col];

		System.out.println("Enter the matrix value of A : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		obj.frequencyOfOdd(a, row, col);

		sc.close();
	}

}
