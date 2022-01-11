import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		
		Scanner sc = new  Scanner(System.in);
		System.out.println("choose: Wizard, Warrior, or Rouge");
		String a = sc.nextLine();
		mycharacter character = new mycharacter(a);
		mycharacter characterstuff = new mycharacter();
		System.out.println(characterstuff.role);
		characterstuff.myToString();
		


		
	}
}
