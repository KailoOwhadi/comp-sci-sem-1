import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Ascii a = new Ascii();
		Ascii b = new Ascii("human");
		Ascii c = new Ascii("dog", "theDog");
		Ascii d = new Ascii("something", "someone", 4);
		d.setType("HomerChopOffYourHead");
		d.setName("HomerSimpsonChoppingOffYourHead");
		d.setNumber(4);
		a.printArt();
		b.printArt();
		c.printArt();
		d.printArt();
		
		


		
	}
}
