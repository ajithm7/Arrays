package com.arrays;
//83.Java Program to copy all elements of one array into another array
import java.util.Scanner;

public class CopyOneArrayToAnotherArray {
	
	public void copyArray(int arr[]) {
		int copy[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];
		}

		System.out.println("Copy of an array : ");
		for (int j = 0; j < copy.length; j++) {
			System.out.print(copy[j] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOneArrayToAnotherArray obj=new CopyOneArrayToAnotherArray();
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter number of an array :  ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the element of an array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		obj.copyArray(arr);

	}

}
