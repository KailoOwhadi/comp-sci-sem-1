import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		mycharacter characterstuff = new mycharacter();
		mycharacter.setRole();
		mycharacter.levelUp();
		mycharacter.setAttackMod();
		mycharacter.takeDamage(2);
		mycharacter.takeDamage(10);
		mycharacter.isDead();

		
	}
}
