package com.arrays;

import java.util.Scanner;
//89.Java Program to find the 2nd Largest Number in an Array
//90.Java Program to find the 2nd Smallest Number in an Array
public class SecondLargeAndSmall extends PrintElementOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter number of an array :  ");
		int n = sc.nextInt();
		int array[] = new int[n];
		System.out.println("Enter the element of an array : ");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		LargestAndSmallestElementOfArray ar=new LargestAndSmallestElementOfArray();
		ar.sort(array);
		System.out.println("Second largest :"+array[array.length-2]);
		System.out.println("Second smallest :"+array[1]);
	}

}
