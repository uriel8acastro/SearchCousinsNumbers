package cesargroupid.cesarartefactid;

/**
 * Clase principal de la solucion
 * 
 * @author Cesar8a
 *
 */
public class PrimeCalculation {
	public static void main(String[] args) throws InterruptedException {
		Calculator myPrimeCalculator = new Calculator();
		long initTimeFirts = System.currentTimeMillis();
		myPrimeCalculator.firstSolution(1000);
		long durationTimeFirts = (System.currentTimeMillis() - initTimeFirts);
		Thread.sleep(3000);
		System.err.println(durationTimeFirts / 1000);
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
