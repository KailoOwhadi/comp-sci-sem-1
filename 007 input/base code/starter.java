import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new  Scanner(System.in);
		System.out.println("what is your first name: ");
		String name = sc.nextLine();
		System.out.println("how old are you: ");
		int age = sc.nextInt();
		System.out.println("birthday month: ");
		int month = sc.nextInt();
		System.out.println("birthday day: ");
		int day = sc.nextInt();
		System.out.println("birthday year: ");
		int year = sc.nextInt();
		System.out.print("how much is a  dollar fifty: "); 
		double cost = sc.nextDouble();
	}
}
