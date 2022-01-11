import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Donkey donkey = new Donkey();
		Ogre shrek = new Ogre();
		String statement = new String();
		if(shrek.ugly == true){
			statement = (shrek.name + " IS UGLY!");
		}
		System.out.println(statement);
		donkey.interact(shrek);
		int ii = 1;
		for(int i = 0; i < 5; i++){
			shrek.isUgly(donkey);
			ii = i;
		}
		System.out.println("That printed out " + ii + " times");

	}
}
