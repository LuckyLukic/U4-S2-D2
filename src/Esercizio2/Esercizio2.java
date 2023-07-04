package Esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Esercizio2 {

	public static void main(String[] args) {

		boolean vero = true;
		boolean falso = false;

		List<Integer> nuovaLista = new ArrayList<>();
		nuovaLista.add(4);
		nuovaLista.add(5);
		nuovaLista.add(8);
		nuovaLista.add(9);

		System.out.println(functionRandom(7));

		System.out.println(functionList(nuovaLista));

		functionBoolean(nuovaLista, vero);

		// functionBoolean(nuovaLista, falso);
	}

	public static List<Integer> functionRandom(int num) {
		List<Integer> myList = new ArrayList<>();

		Random random = new Random();

		for (int i = 0; i < num; i++) {

			int randomNumber = random.nextInt(100) + 1;
			myList.add(randomNumber);
		}

		Collections.sort(myList);
		return myList;

	}

	public static List<Integer> functionList(List<Integer> lista) {

		List<Integer> reversedList = new ArrayList<>(lista);
		Collections.reverse(reversedList);
		lista.addAll(reversedList);
		return lista;

	}

	public static void functionBoolean(List<Integer> lista, boolean buleano) {
		if (buleano) {
			for (int i = 0; i < lista.size(); i++) {
				if (i % 2 == 0)
					System.out.println(lista.get(i));
			}
		} else {
			for (int i = 0; i < lista.size(); i++) {
				if (i % 2 != 0)
					System.out.println(lista.get(i));
			}
		}
	}
}
