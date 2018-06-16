package cesargroupid.cesarartefactid;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public class Calculator {

	public Hashtable<String, String> hastablePrimes = new Hashtable<String, String>();
	public ArrayList<Integer> arrayPrimes = new ArrayList<>();
	public ArrayList<Integer> arrayPrimesResults = new ArrayList<>();

	public boolean searchPrimeNumberOne(int number) {
		int countDivisor = 0;
		if (number == 0)
			return false;
		if (number == 1)
			return false;
		if (number == 2 || number == 3 || number == 5 || number == 7) {
			return true;
		}
		// Criba de eratostenes
		if (number % 2 == 0)
			countDivisor++;
		if (number % 3 == 0)
			countDivisor++;
		if (number % 5 == 0)
			countDivisor++;
		if (number % 7 == 0)
			countDivisor++;
		if (countDivisor >= 1) {
			return false;
		}

		for (int i = 1; i <= (number / 2) + 1; i++) {
			if (number % i == 0) {
				countDivisor++;
			}
		}
		if (countDivisor > 2)
			return false;
		else {
			return true;
		}

	}

	public boolean searchPrimeNumberTwo(int number) {
		int countDivisor = 0;

		if (number == 1)
			return false;

		if (number == 2 || number == 3 || number == 5 || number == 7) {
			return true;
		}
		// Criba de Eratostenes
		if (number % 2 == 0)
			countDivisor++;
		if (number % 3 == 0)
			countDivisor++;
		if (number % 5 == 0)
			countDivisor++;
		if (number % 7 == 0)
			countDivisor++;
		if (countDivisor >= 1) {
			return false;
		}

		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				countDivisor++;
			}
		}
		if (countDivisor > 2)
			return false;
		else {
			return true;
		}

	}

	public void storeListCousinsHash(int number) {
		hastablePrimes.put(" " + hastablePrimes.size(), " " + number);
	}

	public void storeListCousinsArray(int number) {
		arrayPrimes.add(number);
	}

	public void showPrimesInHash(Hashtable<String, String> hastable) {
		Enumeration<String> enumeration = hastable.elements();
		int count = 1;
		while (enumeration.hasMoreElements()) {
			System.out.println(count + " " + enumeration.nextElement());
			count++;
		}
	}

	public void showPrimesInArray(ArrayList<Integer> arrayPrimes) {
		int count = 1;
		for (Integer integer : arrayPrimes) {
			System.out.println(count + " " + integer.intValue());
			count++;
		}
	}

	public void showPrimesResults(ArrayList<Integer> arrayOriginal) {

		for (Integer integerOri : arrayPrimes) {
			for (Integer integerParent : arrayOriginal) {
				if (isNumberBrother(integerOri, integerParent)) {
					arrayPrimesResults.add(integerParent);
				}

			}
		}

		for (Integer integer : arrayPrimesResults) {
			System.out.println(integer.intValue());
		}
	}

	/**
	 * Determina si un numero de la misma cantidad de cifras es un pariente osea que
	 * compartan las misma cifras en diferente orden (197 es pariente de 917)
	 * 
	 * @param original
	 *            es el numero primero al que se validara un pariente
	 * @param parent
	 *            es el numero primo posible pariente
	 * @return
	 */
	public boolean isNumberBrother(Integer original, Integer parent) {
		int count = 0;

		if (original.intValue() <= 11 || parent.intValue() <= 11)
			return false;

		if (original.intValue() == parent.intValue()) {
			return false;
		}

		if (original.toString().length() != parent.toString().length()) {
			return false;
		} else {

			String strParent = parent.toString();
			String strOriginal = original.toString();
			for (int i = 0; i < strParent.length(); i++) {
				for (int j = 0; j < strOriginal.length(); j++) {

					if (strParent.charAt(i) == strOriginal.charAt(j))
						count++;

				}

			}
		}
		if (count == original.toString().length()) {
			return true;
		} else {
			return false;
		}

	}

	public ArrayList<Integer> getListPrimes(int limit) {
		for (int i = 1; i <= limit; i++) {
			if (searchPrimeNumberTwo(i)) {
				// storeListCousinsHash(i);
				storeListCousinsArray(i);

			}
		}
		return arrayPrimes;
	}

}
