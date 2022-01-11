import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		mycharacter characterstuff = new mycharacter();
		mycharacter.setRole();
		System.out.println("You have 25 points, you can spend it on strength, intelligence, or dexterity");
		mycharacter.setStrength();
		mycharacter.setDexterity();
		mycharacter.setIntelligence();

		
	}
}
