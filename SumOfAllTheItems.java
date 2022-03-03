package com.arrays;

//87.Sum of all the items of the array
import java.util.Scanner;

public class SumOfAllTheItems {

	public void sumOfElements(int sum[]) {
		int temp = 0;
		for (int i = 0; i < sum.length; i++) {
			temp = temp + sum[i];
		}
		System.out.println("Sum of elements of the array : " + temp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfAllTheItems obj = new SumOfAllTheItems();
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter number of an array :  ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the element of an array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		obj.sumOfElements(arr);

	}

}
