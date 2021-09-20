package com.greatlearning.service;

public class MinNotesService {

	public MinNotesService() {
	}
	public static void findMinComb(int currencydenominations[], int amount) {
		int[] currencyCounter = new int[currencydenominations.length];
		boolean flag=false;
		for(int i=0;i<currencydenominations.length;i++) {
			if(amount!=0) {
				currencyCounter[i]=amount/currencydenominations[i];
				amount=amount%currencydenominations[i];

			}
		}
		System.out.println("Your payment approach in order to give min no of notes will be");


		for(int i =0;i<currencydenominations.length;i++) {
			if(currencyCounter[i]!=0) {
				System.out.println(currencydenominations[i]+":"+currencyCounter[i]);
				flag=true;
			}

		}
		if(!flag)
			System.out.println("no denominations are available");
	}
	public static void display(int[] currencydenominations, int n) {
		for(int i =0;i<n;i++) {
			System.out.println(currencydenominations[i]);
		}
	}

}
