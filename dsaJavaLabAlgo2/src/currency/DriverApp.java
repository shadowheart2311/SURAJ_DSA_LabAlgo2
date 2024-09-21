package currency;

import java.util.Arrays;
import java.util.Scanner;

public class DriverApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of currency denominations: ");
		int size = sc.nextInt();

		int currency[] = new int[size];

		System.out.println("enter the " + size + " currency denominations value in any order: ");
		for (int i = 0; i < currency.length; i++) {
			currency[i] = sc.nextInt();
		}

		System.out.println("Before Sorting: " + Arrays.toString(currency));
		MergeSort ms = new MergeSort();
		ms.sort(currency, 0, size - 1);

		System.out.println("After Sorting: " + Arrays.toString(currency));
		
		System.out.println("enter the amount you want to pay: ");
		int amount = sc.nextInt();
		System.out.println("Your payment approach in order to give the minimum number of notes will be:");

		
		NoteCount nc = new NoteCount();
		nc.counting(currency, amount);
	}
}