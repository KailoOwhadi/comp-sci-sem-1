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
		if(a.equals("Wizard"))
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
		int Points = 10;
		int StP = 0;
		int DexP = 0;
		int IntP = 0;
		int ConstP = 0;
		int CharisP = 0;
		System.out.println("You have 10 Points, You can spend it on Strength, Dexterity, Intelligence, Constitution, or Charisma, type in which one you want to spend a point on");
		while(Points > 0)
		{
			Scanner sc2 = new Scanner(System.in);
			String b = sc2.nextLine();
			if(b.equals("Strength"))
			{
				if(StP < 11)
				{
					StP = StP+1;
					System.out.println("You have " + StP + "Strength Points");
					Points = Points-1;
				}
				
			}
			else if(b.equals("Dexterity"))
			{
				DexP = DexP+1;
				System.out.println("You have" + DexP + "Dexterity Points");
				Points = Points-1;
			}
			else if(b.equals("Intelligence"))
			{
				IntP = IntP+1;
				System.out.println("You have" + IntP + "Intelligence Points");
				Points = Points-1;
			}
			else if(b.equals("Constitution"))
			{
				ConstP = ConstP+1;
				System.out.println("You have" + ConstP + "Constitution Points");
				Points = Points-1;
			}
			else if(b.equals("Charisma"))
			{
				CharisP = CharisP+1;
				System.out.println("You have" + CharisP + "Charisma Points");
				Points = Points-1;
			}
			
		}
	
	}
}
