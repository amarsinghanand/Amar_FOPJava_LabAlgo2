package com.gl.iitr.fsd.gp.labalgo2;

public class DenominationsCount {
	public void denominationsCountImplementation(int denominations[], int amount) {
		int denominationsCounter[] = new int[denominations.length];
		try {
			for (int i = 0; i < denominations.length; i++) {
				if (amount >= denominations[i]) {
					denominationsCounter[i] = amount / denominations[i];
					amount = amount - denominationsCounter[i] * denominations[i];
				}
			}

			if (amount > 0) {
				System.out.println("Exact amont cannot be given with the highest denomination.");
			} else {
				System.out.println("Possible payment denomination combination");
				for (int i = 0; i < denominations.length; i++) {
					if (denominationsCounter[i] != 0) {
						System.out.println(denominations[i] + " : " + denominationsCounter[i]);
					}
				}
			}
		} catch (ArithmeticException ae) {
			System.out.println(ae + " notes of 0 denomination is invalid.");
		}
	}
}
