package de.uk.java;

import de.uk.java.ball.*;
import de.uk.java.human.*;
import de.uk.java.natural.*;

public class TossSomeStuff {
	
	public static void main(String[] args) {
		Male max = new Male("Max", 18, 70);
		max.toss(new Apple("Red", "sweet", "Pink Lady"));
		
		Female erika = new Female("Erika", 18, 70);
		erika.toss(new Basketball("Orange", 3));
	}

}
