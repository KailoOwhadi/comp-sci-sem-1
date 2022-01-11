import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random();
		int rand_1 = rand.nextInt(10);
		Random rando = new Random();
		int rando_1 = rando.nextInt(100);
		Random random = new Random();
		int random_1 = random.nextInt(1);
		Random g = new Random();
		int g_1 = g.nextInt(576);
		Random randouble = new Random();
		double randouble_1 = randouble.nextDouble();
		
		System.out.println(rand_1);
		System.out.println(rando_1+1);
		System.out.println(random_1+2.5);
		System.out.println(randouble_1+g_1+14);
		
	}
}
