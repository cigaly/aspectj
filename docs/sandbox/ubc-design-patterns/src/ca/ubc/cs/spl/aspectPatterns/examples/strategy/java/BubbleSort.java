package ca.ubc.cs.spl.aspectPatterns.examples.strategy.java;

/* -*- Mode: Java; tab-width: 4; indent-tabs-mode: nil; c-basic-offset: 4 -*-
 *
 * This file is part of the design patterns project at UBC
 *
 * The contents of this file are subject to the Mozilla Public License
 * Version 1.1 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * either https://www.mozilla.org/MPL/ or https://aspectj.org/MPL/.
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is ca.ubc.cs.spl.aspectPatterns.
 * 
 * For more details and the latest version of this code, please see:
 * https://www.cs.ubc.ca/labs/spl/projects/aodps.html
 *
 * Contributor(s):   
 */
 
/**
 * Implements the bubblesort sorting strategy for int arrays.
 *
 * @author  Jan Hannemann
 * @author  Gregor Kiczales
 * @version 1.1, 02/17/04
 * 
 */

public class BubbleSort implements SortingStrategy {

    /**
     * Helper method that exchanges two values in an int array
     * 
     * @param numbers the int array
     * @param pos1 the position of the first element
     * @param pos2 the position of the second element
     */

	private void exchange(int[] numbers, int pos1, int pos2) {
		int tmp = numbers[pos1];
		numbers[pos1] = numbers[pos2];
		numbers[pos2] = tmp;
	}

    /**
     * Sorts an int array using basic bubble sort
     * 
     * @param numbers the int array to sort
     */

	public void sort(int[] numbers) {
		System.out.print("Sorting by BubbleSort...");		
		for (int end = numbers.length; end > 1; end --) {
			for (int current = 0; current < end - 1; current ++) {
				if (numbers[current] > numbers[current+1]) {
					exchange(numbers, current, current+1);
				}
			}
		}
		System.out.println("done.");
	}
}
