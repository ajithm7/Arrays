package com.arrays;

//88.Java Program to rotate the elements of an array in the right direction
import java.util.Scanner;

public class RotateElementsRightDirection {

	public void rotateright(int arr[], int n) {
		int rotate[] = new int[arr.length];
		int m = 0;
		n = n % arr.length;
		System.out.print("Right " + n + " rotation of an array :");
		for (int i = 0; i < arr.length; i++) {
			m = arr.length + n + i;
			m = m % (arr.length);
			rotate[m] = arr[i];
		}
		for (int i = 0; i < rotate.length; i++) {
			System.out.print(rotate[i] + " ");
		}
	}
	 public void rotate(int arr[], int n)
	    {int b[]=new int[n];
	   for(int i=0;i<n;i++){
	       int r=0;
	       r=i+1;
	       r=r%n;
	       b[r]=arr[i];
	   } for(int i=0;i<n;i++){
	   System.out.print(b[i]+" ");}
	   System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotateElementsRightDirection obj = new RotateElementsRightDirection();
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter number of an array :  ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the element of an array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		obj.rotate(arr, n);
		obj.rotateright(arr, 2);

	}

}
