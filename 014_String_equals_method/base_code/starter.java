import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		String Wiz = "Wizard";
		String War = "Warrior";
		String Ro = "Rouge";
		Scanner sc = new  Scanner(System.in);
		System.out.println("choose: Wizard, Warrior, or Rouge");
		String a = sc.nextLine();
		if(a.equals(Wiz))
		{
			System.out.println("Wizard");
		}
		else if(a.equals(War))
		{
			System.out.println("Warrior");
		}
		else if(a.equals(Ro))
		{
			System.out.println("Rouge");
		}
		else
		{
			System.out.println("your input does not match");
		}
	}
}
