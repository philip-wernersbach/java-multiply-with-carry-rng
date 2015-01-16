/*
 * MultiplyWithCarryRandom.java
 * Part of java-multiply-with-carry-rng
 * Copyright (c) 2015 Philip Wernersbach
 *
 * Dual-Licensed under the Public Domain and the Unlicense.
 * Choose the one that you prefer.
 */

/*
 * This is a Java implementation of Dr. George Marsaglia's excellent 
 * complimentary-multiply-with-carry PRNG. It's written straight from
 * Marsaglia's implementation as defined in his email
 * "Re: good C random number generator" in the comp.lang.c newsgroup.
 * 
 * A copy of his email is available online at
 * http://school.anhb.uwa.edu.au/personalpages/kwessen/shared/Marsaglia03.html
 */

package org.pwernersbach;

import java.security.SecureRandom;

public class MultiplyWithCarryRandom {
	private static final int r = 0xFFFFFFFE;
	
	private int i = 4095;
	
	protected int c;
	protected int[] Q = new int[4096];
	
	public MultiplyWithCarryRandom() {
		SecureRandom random = new SecureRandom();
		c = random.nextInt(809430660);
		
		for (int j = 0; j < Q.length; j++)
			Q[j] = random.nextInt();
	}
	
	public int nextInt() {
		int x;
		long t;
		long a = 18782;
		
		i = (i + 1) & 4095;
		t = a * (Q[i] & 0xFFFFFFFFL) + c;
		c = (int)(t >>> 32);
		x = (int)(t + c);
		
		if (Integer.compareUnsigned(x, c) < 0) {
			x += 1;
			c += 1;
		}
		
		Q[i] = r - x;
		return Q[i];
	}
}
