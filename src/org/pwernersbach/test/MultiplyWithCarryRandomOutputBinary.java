/*
 * MultiplyWithCarryRandomOutputBinary.java
 * Part of java-multiply-with-carry-rng
 * Copyright (c) 2015 Philip Wernersbach
 *
 * Dual-Licensed under the Public Domain and the Unlicense.
 * Choose the one that you prefer.
 */

package org.pwernersbach.test;

import org.pwernersbach.MultiplyWithCarryRandom;

public class MultiplyWithCarryRandomOutputBinary {

	public static void main(String[] args) {
		MultiplyWithCarryRandom random = new MultiplyWithCarryRandom();

		while (true) {
			int i = random.nextInt();
			
			System.out.print((char)(i >>> 24));
			System.out.print((char)(i >>> 16));
			System.out.print((char)(i >>> 8));
			System.out.print((char)i);
		}
	}

}
