package com.arrays;

//80.Largest element of an array
// 81.Smallest element of an array
import java.util.Arrays;
import java.util.Scanner;

public class LargestAndSmallestElementOfArray {

	public void largeAndSmall(int arr[]) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (temp < arr[i])
				temp = arr[i];
		}
		System.out.println("Largest element of an array : " + temp);

		for (int i = 0; i < arr.length; i++) {
			if (temp > arr[i])
				temp = arr[i];
		}
		System.out.println("Smallest element of an array : " + temp);
	}

	public void largesmall(int arr[]) {
		int s = Integer.MAX_VALUE;
		int l = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (s > arr[i])
				s = arr[i];
			if (l < arr[i])
				l = arr[i];
		}
		System.out.println("Large number of an array : " + l);
		System.out.println("Small number of an array : " + s);
	}

	public void sort(int[] a) {
		Arrays.sort(a);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargestAndSmallestElementOfArray obj = new LargestAndSmallestElementOfArray();
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter number of an array :  ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the element of an array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		obj.largeAndSmall(arr);
		obj.largesmall(arr);
		obj.sort(arr);

	}

}
