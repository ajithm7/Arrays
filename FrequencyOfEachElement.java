package com.arrays;

//84.Frequency of each element in the array
import java.util.Scanner;

public class FrequencyOfEachElement {

	public void frequency(int arr[]) {

		int n = arr.length;
		int[] vis = new int[n];
		for (int i = 0; i < n; i++) {// 1 2 3 1 2

			if (vis[i] == 1)
				continue;

			int count = 1;
			for (int j = i + 1; j < n; j++) {

				if (arr[i] == arr[j]) {
					vis[j] = 1;
					count++;
				}
			}
			System.out.println(arr[i] + "  occurs : " + count + "  times. ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrequencyOfEachElement obj = new FrequencyOfEachElement();
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter number of an array :  ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the element of an array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		obj.frequency(arr);
	
			

	}
	
	 

}
