package com.glearning.trasactionService;

public class TransactionService {

	public void checkTransactionTarget(long[] array, long target) {
		long totalCount = 0;
		boolean flag = false;
		for (int i = 0; i < array.length; i++) {
			totalCount = totalCount + array[i];
			if (totalCount >= target) {
				System.out.println("target value achieved after " + (i + 1) + " Transaction");
				flag = true;
				break;
			}
		}

		if (!flag) {
			System.out.println("target value not achieved after" + (array.length + 1) + "trasaction");
		}

	}
}
