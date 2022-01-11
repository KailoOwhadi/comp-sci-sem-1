import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		System.out.println("please enter your full name: ");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		System.out.println(a.substring(a.indexOf(" ")));

		
	}
}
