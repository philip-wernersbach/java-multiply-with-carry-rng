/*
 * MultiplyWithCarryRandomOutputIntegers.java
 * Part of java-multiply-with-carry-rng
 * Copyright (c) 2015 Philip Wernersbach
 *
 * Dual-Licensed under the Public Domain and the Unlicense.
 * Choose the one that you prefer.
 */

package org.pwernersbach.test;

import org.pwernersbach.MultiplyWithCarryRandom;

public class MultiplyWithCarryRandomOutputIntegers {

	public static void main(String[] args) {
		MultiplyWithCarryRandom random = new MultiplyWithCarryRandom();

		while (true)
			System.out.println(random.nextInt());
	}

}
