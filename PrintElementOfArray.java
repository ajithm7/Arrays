package com.arrays;
//76.Element of an array
import java.util.Scanner;
public class PrintElementOfArray {


	public void element(int ele[]) {
		System.out.println("Element of an array : ");
		for (int i = 0; i < ele.length; i++) {
			System.out.print(ele[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter number of an array :  ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the element of an array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		PrintElementOfArray obj = new PrintElementOfArray();

		obj.element(arr);
		

	}

}
