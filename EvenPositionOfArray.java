package com.arrays;
//78.Even position of an array
import java.util.Scanner;

public class EvenPositionOfArray {
	
	
		public void even(int even[]) {
			System.out.println("Even position of an array : ");
			for (int i = 1; i < even.length; i++) {
				System.out.print(even[i] + " ");
				++i;
			}
			System.out.println();
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenPositionOfArray eve=new EvenPositionOfArray();
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

	}

}
