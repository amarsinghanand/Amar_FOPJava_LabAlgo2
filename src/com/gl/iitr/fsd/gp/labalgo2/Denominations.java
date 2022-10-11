package com.gl.iitr.fsd.gp.labalgo2;

import java.util.Scanner;

public class Denominations {
	public void pay(Scanner sc) {
		System.out.println("Enter the size of the denominations array");
		int denominationSize = sc.nextInt();
		int denominations[] = new int[denominationSize];
		System.out.println("Enter the values of the denominations array");
		for (int i = 0; i < denominationSize; i++) {
			denominations[i] = sc.nextInt();
		}
		MergeSort mergeSort = new MergeSort();
		int sortedDenominations[] = mergeSort.doMergeSort(denominations);
		System.out.println("The sorted values of the denominations array in descending order");
		mergeSort.printArray(sortedDenominations);
		System.out.println("Enter the amount you want to pay with available denominations");
		int amount = sc.nextInt();
		DenominationsCount dc = new DenominationsCount();
		dc.denominationsCountImplementation(sortedDenominations, amount);
	}

}
