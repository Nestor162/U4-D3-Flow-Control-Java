package app;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;

		do {
			System.out.println("Inserisci una stringa: ");
			str = sc.nextLine();

			for (int i = 0; i < str.length(); i++) {
				if (!str.equals(":q") && (i != str.length() - 1)) {

					// gestione degli spazi vuoti tra una parola e l'altra
					if (str.charAt(i) != ' ') {
						System.out.print(str.charAt(i) + ", ");
					} else {
						System.out.print(str.charAt(i)); // stampa lo spazio senza virgole
					}

				} else {
					System.out.print(str.charAt(i) + "\n");
				}

			}

		} while (!str.equals(":q"));

		sc.close();
	}
}
