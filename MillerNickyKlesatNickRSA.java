/**
 * Simple integer RSA Implementation
 *
 * @author Nicky Miller
 * @author Nick Klesat
 * @version September 20, 2023
 */
public class MillerNickyKlesatNickRSA {

	public static void main(String[] args) {
		testGcd();

	}
	
	// Test for GCD method
	public static void testGcd () {
		int result1 = gcd (29, 288);
		int result2 = gcd (30, 288);
		int result3 = gcd (149, 288);
		int result4 = gcd (2, 4);

		System.out.println ("GCD (29, 288) = 0x" + Integer.toString(result1, 16));
		System.out.println ("GCD (30, 288) = 0x" + Integer.toString(result2, 16));
		System.out.println ("GCD (149, 288) = 0x" + Integer.toString(result3, 16));
		System.out.println ("GCD (2, 4) = 0x" + Integer.toString(result4, 16));
	}
	
	/**
	 * Calculate the greatest common divisor between two numbers.
	 * 
	 * @param inE first number
	 * @param inZ second number
	 * @return the greatest common divisor
	 */
	public static int gcd(int inE, int inZ) {
		//int temp;
		while (inZ != 0) {
			if (inE > inZ) {
				inE = inE - inZ;
			} else {
				inZ = inZ - inE;
			}
			//temp = inZ;
			//inZ = inE % inZ;
			//inE = temp;
		}
		return inE;
	}
	
	/**
	 * Extended Euclids algorith finds the modular inverse
	 * 
	 * @param inE
	 * @param inZ
	 * @return
	 */
	public static int xgcd(int inE, int inZ) {
		// TO BE FINISHED
		// Must implement the extended Euclidean algorithm
		// NO brute-forcing; violation will lead to zero points
		// NO recursion; violation will lead to zero points
		return 0;
	}
}
