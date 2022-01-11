import java.util.Scanner;
import java.util.Random;
class starter {
	

	public static void main(String args[]) {
			// the string "I love to learn coding remotely." will appear in
			// the command window when you compile and run this program.
			// kucoin stuff
			
		System.out.println("you have $30");
		double monie = 30;
		int counter = 0;
		int counter2 = 0;
		for(int blobfishie = 0; blobfishie < 30; blobfishie++){
			while(true){
				if(counter < 2){
					counter2 = counter2+1;
					if(counter2 > 30){
						break;
					}
					double wager = 1;
					if(wager < monie+1){
						monie = monie-wager;
						Random rand = new Random();
						int a = rand.nextInt(2)+1;
						System.out.println("your number is " + a);
						if(a > 1)
						{
							wager = wager*1.8;
							monie = monie+wager;
							System.out.println("You multipled your wager by 1.8 and have $" + monie);
							counter = 0;
						}
						else{
							System.out.println("You lost your money haha and now have " + monie);
							counter = counter+1;
							if(monie < 1){
								break;
							}
						}
							
					}
					else{
						System.out.println("you dont have enough money, please input another number");
					}
						
				}
				else if(counter == 2){
					double wager = 1;
					if(wager < monie+1){
						monie = monie-wager;
						Random rand = new Random();
						int a = rand.nextInt(2)+1;
						System.out.println("your number is " + a);
						if(a > 1)
						{
							wager = wager*1.8;
							monie = monie+wager;
							System.out.println("You multipled your wager by 1.8 and have $" + monie);
							counter = 0;
						}
						else{
							System.out.println("You lost your money haha and now have " + monie);
							counter = counter+1;
							if(monie < 1){
								break;
							}
						}
						
					}
				}
				else if(counter == 3){
					double wager = 2;
					if(wager < monie+1){
						monie = monie-wager;
						Random rand = new Random();
						int a = rand.nextInt(2)+1;
						System.out.println("your number is " + a);
						if(a > 1)
						{
							wager = wager*1.8;
							monie = monie+wager;
							System.out.println("You multipled your wager by 1.8 and have $" + monie);
							counter = 0;
						}
						else{
							System.out.println("You lost your money haha and now have " + monie);
							counter = counter+1;
							if(monie < 1){
								break;
							}
						}
						
					}
				}
				else if(counter == 4){
					double wager = 3;
					if(wager < monie+1){
						monie = monie-wager;
						Random rand = new Random();
						int a = rand.nextInt(2)+1;
						System.out.println("your number is " + a);
						if(a > 1)
						{
							wager = wager*1.8;
							monie = monie+wager;
							System.out.println("You multipled your wager by 1.8 and have $" + monie);
							counter = 0;
						}
						else{
							System.out.println("You lost your money haha and now have " + monie);
							counter = counter+1;
							if(monie < 1){
								break;
							}
						}
						
					}
				}
				else if(counter > 4){
					double wager = 5;
					if(wager < monie+1){
						monie = monie-wager;
						Random rand = new Random();
						int a = rand.nextInt(2)+1;
						System.out.println("your number is " + a);
						if(a > 1)
						{
							wager = wager*1.8;
							monie = monie+wager;
							System.out.println("You multipled your wager by 1.8 and have $" + monie);
							counter = 0;
						}
						else{
							System.out.println("You lost your money haha and now have " + monie);
							counter = counter+1;
							if(monie < 1){
								break;
							}
						}
						
					}
				}
			}
		}
	}
}
	
