package com.arrays;
import java.util.Scanner;
//94.Print Odd and Even Number from an Array
public class PrintOddAndEvenNumberArray {

	public static void main(String[] args) {
		EvenPositionOfArray eve=new EvenPositionOfArray();
		OddPositionOfArray od=new OddPositionOfArray ();
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter number of an array :  ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the element of an array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		eve.even(arr);
		od.odd(arr);
	}

}
