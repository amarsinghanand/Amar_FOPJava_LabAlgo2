package com.gl.iitr.fsd.gp.labalgo2;

import java.util.Scanner;

public class Transactions {
	public void search(Scanner sc) {
		System.out.println("Enter the size of the transactions array");
		int transactionSize = sc.nextInt();
		int transactions[] = new int[transactionSize];
		System.out.println("Enter the values of the transactions array");
		for (int i = 0; i < transactionSize; i++) {
			transactions[i] = sc.nextInt();
		}
		System.out.println("Enter the size of the targets array");
		int targetSize = sc.nextInt();
		while (targetSize-- != 0) {
			int flag = 0;
			long target;
			System.out.println("Enter the value of target");
			target = sc.nextInt();
			long sum = 0;
			for (int i = 0; i < transactionSize; i++) {
				sum += transactions[i];
				if (sum >= target) {
					System.out.println("Target achieved after " + (i + 1) + " transactions ");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(" Given target is not achieved ");
			}
		}
	}
}
