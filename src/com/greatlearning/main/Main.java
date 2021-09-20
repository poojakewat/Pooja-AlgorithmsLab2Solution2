package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.service.MergeSort;
import com.greatlearning.service.MinNotesService;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the size of currency denominations");
			n=sc.nextInt();
			int[] arr = new int[n];
			System.out.println("Enter the currency denominations value");

			for(int i= 0;i<n;i++) {
				int temp=sc.nextInt();
				if(temp==0) {
					System.out.println("Please enter a non-zero value");
					i--;
				}
				else
					arr[i]=temp;
			}

			int amount;
			System.out.println("Enter the amount you want to pay");
			amount=sc.nextInt();


			MergeSort.sort(arr, 0, n-1);
			System.out.println("Sorted currencydenominations");
			MinNotesService.display(arr,n);
			MinNotesService.findMinComb(arr,amount);
		}
		finally {
			sc.close();
		}
	}

}
