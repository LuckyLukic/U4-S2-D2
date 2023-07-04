package Esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Esercizio1 {

	public static void main(String[] args) {

		int numero;
		String parola;
		Set<String> mySet = new HashSet<>();
		Set<String> mySetRipetute = new HashSet<>();

		Scanner scanner = new Scanner(System.in);

		System.out.println("quanti elementi vuoi inserire?");

		try {

			numero = Integer.parseInt(scanner.nextLine());

		} catch (NumberFormatException e) {
			System.out.println("Errore: input non valido");
			scanner.close();
			return;
		}

		catch (Exception e) {
			System.out.println(e);
			scanner.close();
			return;
		}

		for (int i = 0; i < numero; i++) {

			System.out.println("inserisci la parola numero" + " " + (i + 1));
			parola = scanner.nextLine();

			if (!mySet.contains(parola)) {
				mySet.add(parola);
			} else {
				mySetRipetute.add(parola);
			}
		}

		scanner.close();

		for (String parole : mySet) {
			System.out.println(" parole singole: " + parole);
		}

		for (String parole : mySetRipetute) {
			System.out.println("parole duplicate: " + parole);
		}
	}
}
