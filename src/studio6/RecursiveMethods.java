package studio6;

import java.util.Arrays;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		
			// FIXME compute the geometric sum for the first n terms recursively
			if (n == 0) {
				return 0;
			}
			else {
				return geometricSum(n-1) + Math.pow(0.5, n);
			}
		
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		
			// FIXME compute the gcd of p and q using recursion
		if(q == 0) {
			return p;
		}
		else {
			return gcd(q,p%q);
		}
	
		
	}

	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) { //array of any elements of any integer
		int index = 0;
		int[] arrayCopy = Arrays.copyOf(array, array.length);
		if (array.length == 0) {
			return new int[0];
			
		}
		else if (array.length == 1) {
			return array;
		}
		else return helpingReverse(arrayCopy, index);	
		
	}
	
	public static int[] helpingReverse(int[] array, int index) {
		if (index >= array.length/2) {
			return array;
		}
		else {
			int mirrorIndex = (array.length - 1) - index;
			int temp = array[mirrorIndex]; 
			array[mirrorIndex] = array[index];
			array[index] = temp;
			return helpingReverse(array, index + 1);
		}
		// should rerun for index going to half the length of the array
		
		

	}

	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		
		// FIXME
	}

}
