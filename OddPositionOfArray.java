package com.arrays;

//79.Odd position of an array
import java.util.Scanner;

public class OddPositionOfArray {

	public void odd(int odd[]) {
		System.out.println("Odd position of an array : ");
		for (int i = 0; i < odd.length; i++) {
			System.out.print(odd[i] + " ");
			++i;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddPositionOfArray od = new OddPositionOfArray();
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter number of an array :  ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the element of an array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		od.odd(arr);

	}

}
