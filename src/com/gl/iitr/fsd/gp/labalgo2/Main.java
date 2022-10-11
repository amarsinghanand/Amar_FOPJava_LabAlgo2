package com.gl.iitr.fsd.gp.labalgo2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the any of the following options to continue.....");
		System.out.println("1. Transactions \n2. Denominations\n3. Exit the program");
		int option = sc.nextInt();
		do {
			switch (option) {
			case 1:
				// Case 1
				Transactions transaction = new Transactions();
				transaction.search(sc);
				break;
			case 2:
				// Case 2
				Denominations denomination = new Denominations();
				denomination.pay(sc);
				break;
			case 3:
				System.out.println("Exited Successfully!!!");
			default:
				System.out.println("Invalid option. Enter a valid no.\n");
			}
		} while (option != 3);

		sc.close();

	}
}
