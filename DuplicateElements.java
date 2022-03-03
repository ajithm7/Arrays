package com.arrays;
//86.Duplicate elements of an array
import java.util.Scanner;

public class DuplicateElements {

	
		public void dublicateArray(int dublicate[]) {
			System.out.println();
			System.out.println("Dublicate elements of an array :");

			for (int i = 0; i < dublicate.length; i++) {
				for (int j = i + 1; j < dublicate.length; j++) {
					if (dublicate[i] == dublicate[j])
						System.out.print(dublicate[j] + " ");
				}
			}
			System.out.println();
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateElements obj=new DuplicateElements();

		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter number of an array :  ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the element of an array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		obj.dublicateArray(arr);
	}

}
