package week2;

import acm.program.*;

public class Fibonacci extends ConsoleProgram {

	
	public void run() {
		
			println("This program lists the Fibonacci sequence.");
			int t1 = 0;
			int t2 = 1;
			while (t1 <= MAX_TERM_VALUE) {
			println(t1);
			int t3 = t1 + t2;
			t1 = t2;
			t2 = t3;
			}
			}
			/* Defines the largest term to be displayed */
			private static final int MAX_TERM_VALUE = 10000;
			
	}

