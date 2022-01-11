import pkg.*;
import java.util.Scanner;
import java.util.Random;

class dwarf {
	public int age;
	public String name;
	public dwarf(){
		
	}
}


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		dwarf[] dwerf = new dwarf[100];
		int[] age = new int[100];
		String[] name = new String[100];
		for(int x = 0; x < dwerf.length; x = x+1){
			Random rand = new Random();
			int a = rand.nextInt(100)+1;
			age[x] = a;
			Random rando = new Random();
			int b = rand.nextInt(5);
			String c = "";
			if(b == 0){
				c = "Grumpy";
			}
			else if(b == 1){
				c = "Dopey";
			}
			else if(b == 2){
				c = "Doc";
			}
			else if(b == 3){
				c = "Happy";
			}
			else if(b == 4){
				c = "Bashful";
			}
			else{
				c = "Sneezy";
			}
			name[x] = c;
		}
		for(int x = 0; x < dwerf.length; x = x+1){
			System.out.println(age[x] + "  " + name[x]);
		}
		
	
		
	}
}
