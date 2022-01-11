import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Wizard[] a = new Wizard[100];
		for(int counte = 0; counte < a.length; counte = counte+1){
			a[counte] = new Wizard();
		}
		Warrior[] b = new Warrior[100];
		for(int count = 0; count < b.length; count = count+1){
			b[count] = new Warrior();
		}
		int onewi = 0;
		int onewa = 0;
		int winner = 0;
		while(true){
			a[onewi].attack(b[onewa]);
			if(b[onewa].isDead() == true){
				onewa = onewa+1;
				if(onewa > 99){
					winner = 1;
					break;
				}
			}
			b[onewa].attack(a[onewi]);
			if(a[onewi].isDead() == true){
				onewi = onewi+1;
				if(onewi > 99){
					winner = 2;
					break;
				}
			}
		}
		int onewii = 100-onewi;
		int onewaa = 100-onewa;
		if(winner == 1){
			System.out.println("the winners are the wizErds with remaining troops " + onewii);
		}
		else if(winner == 2){
			System.out.println("the winners are the WErrios with remaining troops " + onewaa);
		}


		
	}
}
