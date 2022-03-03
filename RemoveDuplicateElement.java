package com.arrays;
//91.Java Program to remove Duplicate Element in an Array

import java.util.Scanner;

public class RemoveDuplicateElement {

	public void fremoveDuplicate(int arr[]) {
		int n = arr.length;
		boolean[] visit = new boolean[n];
		for (int i = 0; i < n; i++) {// 1 2 3 1 2
			if (visit[i] == true) {
				continue;}
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					visit[j] = true;
				}
			}if(visit[i]==false) {
				System.out.print(arr[i] + " " );
			}
			
		} }


	public static void main(String[] args) {
		RemoveDuplicateElement obj=new RemoveDuplicateElement();
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter number of an array :  ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the element of an array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		obj.fremoveDuplicate(arr);

	}

}
