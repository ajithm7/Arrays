package com.arrays;
//77.Array in reverse
import java.util.Scanner;

public class ArrayInReverse {
	
	
	public void reverseArray(int rev[]) {

		System.out.println("Element of reversed array : ");
		for (int i = rev.length - 1; i >= 0; i--) {
			System.out.print(rev[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		ArrayInReverse ob=new ArrayInReverse();
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter number of an array :  ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the element of an array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		ob.reverseArray(arr);
	}

}
