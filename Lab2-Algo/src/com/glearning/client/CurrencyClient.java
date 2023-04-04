package com.glearning.client;

import java.util.Arrays;
import java.util.Scanner;

import com.glearning.currencyService.CurrencyService;

public class CurrencyClient {
	public static void main(String[] args) {
		CurrencyService currencyService = new CurrencyService();
		
//		int [] denominations=new int [] {500,200,50,20,10};
//	    Arrays.sort(denominations);
//	    int[] sortedDenominations = new int[denominations.length];
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of array :");
		int size = s.nextInt();
		int denominations[] = new int[size];
		System.out.println("enter the values of array :");
		for (int i = 0; i < size; i++) {
			denominations[i] = s.nextInt();
		}
		System.out.println("enter the amount :");
		int amount = s.nextInt();
		currencyService.denominationService(denominations, amount);
	}
}
