import java.util.Scanner;
import java.util.Random;

class character{
	String role = "Wizard";
	int strength = 1;
	int intelligence = 4;
	int dexterity = 15;
}

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		character mycharacter = new character();
		System.out.println(mycharacter.role);
		System.out.println("strength points is: " + mycharacter.strength);
		System.out.println("dexterity points is: " + mycharacter.dexterity);
		System.out.println("intelligence points is: " + mycharacter.intelligence);

		
	}
}
