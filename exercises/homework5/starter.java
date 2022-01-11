import java.util.Scanner;
import java.util.Random;
class starter {
	

	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		System.out.println("you have $100");
		int monie = 100;
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.print("How much you want to wager");
			int wager = sc.nextInt();
			if(wager < monie+1){
				monie = monie-wager;
				Random rand = new Random();
				int a = rand.nextInt(9);
				int b = rand.nextInt(9);
				int c = rand.nextInt(9);
				a = a+1;
				b = b+1;
				c = c+1;
				System.out.println("Your numbers rolled are " + a + ", " + b + ", " + c);
				if(a == b||a == c||b == c)
				{
					wager = wager*2;
					monie = monie+wager;
					System.out.println("You doubled your wager and have $" + monie);
				}
				else if((a == b)&&(b == c)){
					wager = wager*3;
					monie = monie+wager;
					System.out.println("You tripled your wager and have $" + monie);
				}
				else{
					
					System.out.println("You lost your money haha");
					if(monie < 1){
						break;
					}
				}
				
			}
			else{
				System.out.println("you dont have enough money, please input another number");
			}
			
			
		}
	}
}
