import java.util.Scanner;
import java.util.Random;
class Cat {
    String name;
	public Cat(){
		name = "Garfield";
	}
	public Cat(String a){
		name = a;
	}
	public void Meow(){
		System.out.println(name + ": meow");
	}
}

class starter {
	

	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Cat a = new Cat();
		a.Meow();
		Cat b = new Cat("other cat");
		a.Meow();
		b.Meow();
	
		
	
	}
}
