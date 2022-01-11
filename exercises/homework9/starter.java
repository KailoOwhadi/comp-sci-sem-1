import java.util.Scanner;
import java.util.Random;
class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		int[]jimmy = new int[20];
		for(int count = 0; count < jimmy.length; count = count+1){
			Random rand = new Random();
			int a = rand.nextInt(50)+1;
			jimmy[count] = a;
			System.out.println(jimmy[count]);
		}
		int[]lastweektonight = new int[20];
		int counterr = 0;
		for(int count = jimmy.length-1; count > -1; count = count-1){
			lastweektonight[counterr] = jimmy[count];
			System.out.println(lastweektonight[counterr]);
			counterr = counterr+1;
		}
	}
}
