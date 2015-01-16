# java-multiply-with-carry-rng
This is a Java implementation of Dr. George Marsaglia's excellent
complimentary-multiply-with-carry PRNG. It's written straight from
Marsaglia's implementation as defined in his email
"Re: good C random number generator" in the comp.lang.c newsgroup.

A copy of his email is available online at
http://school.anhb.uwa.edu.au/personalpages/kwessen/shared/Marsaglia03.html.

## Verified Code
This code has been verified against Marsaglia's implementation, and it
produces the same output as Marsaglia's implementation when both
implementations are seeded with the same data. See the `marsaglia_original`
directory and the `org.pwernersbach.test.MultiplyWithCarryRandomOutputSeeded`
class for the verification code.

## License
This code is dual-licensed under the Public Domain and the Unlicense. Choose
the one that you prefer.
