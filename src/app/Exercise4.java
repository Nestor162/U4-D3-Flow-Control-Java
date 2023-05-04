package app;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci un numero intero: ");
		int n = sc.nextInt();

		for (int i = n; i >= 0; i--) {
			System.out.println(i);
		}

		sc.close();
	}

}
