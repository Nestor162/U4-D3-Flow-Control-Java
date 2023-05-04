package app;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;

		do {
			System.out.println("Inserisci un numero intero: ");
			n = sc.nextInt();

			switch (n) {
			case 0: {
				System.out.println("zero");
				break;
			}
			case 1: {
				System.out.println("uno");
				break;
			}
			case 2: {
				System.out.println("due");
				break;
			}
			case 3: {
				System.out.println("tre");
				break;
			}
			default:
				System.out.println("Per favore inserire un numero compreso tra 0 è 3");
			}
		} while (n < 0 || n > 3);

		sc.close();

	}

}
