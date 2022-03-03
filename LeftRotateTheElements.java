package com.arrays;

//85.Left rotate the elements of an array
import java.util.Scanner;

public class LeftRotateTheElements {

	public void rotateleft(int arr[], int n) {
		int rotate[] = new int[arr.length];
		int m = 0;
		n = n % arr.length;
		System.out.print("Left " + n + " rotation of an array");
		for (int i = 0; i < arr.length; i++) {
			m = arr.length - n + i;
			m = m % (arr.length);
			rotate[m] = arr[i];
		}
		for (int i = 0; i < rotate.length; i++) {
			System.out.print(rotate[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeftRotateTheElements obj = new LeftRotateTheElements();
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter number of an array :  ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the element of an array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		obj.rotateleft(arr, 2);
	}

}
