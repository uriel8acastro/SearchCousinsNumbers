package cesargroupid.cesarartefactid;

/**
 * Clase principal de la solucion
 * 
 * @author Cesar8a
 *
 */
public class PrimeCalculation {
	public static void main(String[] args) throws InterruptedException {
		Calculator miCalculator = new Calculator();
		long initTimeMill = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {

			if (miCalculator.searchPrimeNumberOne(i)) {
				// miCalculator.storeListCousinsHash(i);
				miCalculator.storeListCousinsArray(i);

			}
		}

		long durationTimeMill = (System.currentTimeMillis() - initTimeMill);
		miCalculator.showPrimesInArray(miCalculator.arrayPrimes);
		Thread.sleep(3000);
		System.err.println(durationTimeMill / 1000);
		/*
	    ---------algoritmo uno------
		78493 999931
		78494 999953
		78495 999959
		78496 999961
		78497 999979
		78498 999983
		135
		---------algoritmo dos------
		78493 999931
		78494 999953
		78495 999959
		78496 999961
		78497 999979
		78498 999983
		682
		*/
	}
}
