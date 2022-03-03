package com.arrays;
//96.Java Program to sort the elements of an array in ascending order
//97.Java Program to sort the elements of an array in descending order
import java.util.Scanner;

public class SortAscendingOrderDescendingOrder {
	
	void descenting(int []a) {
		int b[]=new int[a.length];
		for(int j=a.length-1,i=0;j>=0;i++,j--) {
			
			b[i]=a[j];
		
	}
		System.out.println("DescendingOrder : ");
		for(int x:b) {
		System.out.print(x+" ");
	}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargestAndSmallestElementOfArray ar=new LargestAndSmallestElementOfArray();
		SortAscendingOrderDescendingOrder des=new SortAscendingOrderDescendingOrder();
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter number of an array :  ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the element of an array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		ar.sort(arr);
		System.out.println("AscendingOrder : ");
		for(int i:arr) {
		System.out.print(i+" ");}
		System.out.println();
		des.descenting(arr);
		
		
	}

}
