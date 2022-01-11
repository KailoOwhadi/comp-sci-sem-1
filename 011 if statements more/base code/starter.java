import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new  Scanner(System.in);
		Scanner scc = new Scanner(System.in);
		System.out.println("input a number");
		int a = sc.nextInt();
		System.out.println("input another number");
		int b = scc.nextInt();
		boolean jimmy = a!=b;
		if(jimmy = true)
		{
			System.out.println("they were not the same");
		}
	}
}
