package com.glearning.client;

import java.util.Scanner;

import com.glearning.trasactionService.TransactionService;


public class TransactionClient {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of transaction array");
		long size = s.nextInt();
		long arr[] = new long[(int) size];
		System.out.println("enter the values of array");
		for (int i = 0; i < size; i++)
		arr[i] = s.nextInt();
		System.out.println("enter the total no of targets that needs to be achieved");
		long targetNo = s.nextInt();
		
		TransactionService transaction =new TransactionService();
//		long []inputTrasaction=new long[] {100,200,400,500,600};
//		long target=1200;
		transaction.checkTransactionTarget(arr, targetNo);
	}

}
