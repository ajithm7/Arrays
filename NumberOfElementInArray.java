package com.arrays;

import java.util.Scanner;
//82.Print the number of element in array
public class NumberOfElementInArray {
	
	
	/*public void numOfElement(int numEle[]) {
		int temp = numEle.length;
		System.out.println("Number of lement in array : " + temp);}*/
	public void numOfElement(int numEle[][]) {
		int i=numEle.length;
		int j=numEle[0].length;
		int temp = i+j;
		System.out.println("Number of lement in array : " + temp);}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberOfElementInArray  obj =new NumberOfElementInArray ();
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter number of an array :  ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the element of an array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter 2 di");
		int b[][]=new int[2][2];
		for (int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				b[i][j]=sc.nextInt();			}
		}
		sc.close();
		//Sobj.numOfElement(arr);
		obj.numOfElement(b);

	}

}
