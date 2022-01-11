import java.util.Scanner;
import java.util.Random;
class Dog {
	String name;
	int age;
	String breed;
	public Dog(){
		name = "clifford";
		age = 3;
		breed = "big red dog";
	}
	public Dog(String a){
		name = a;
		age = 1;
		breed = "dog dog";
	}
	public Dog(String a, String b){
		name = a;
		breed = b;
		age = 1;
	}
	public Dog(String a, int c){
		name = a;
		age = c;
		breed = "dog dog";
	}
	public void setName(String a){
		name = a;
	}
	public void setAge(int a){
		age = a;
	}
	public void setBreed(String a){
		breed = a;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getBreed(){
		return breed;
	}
	public boolean isSleeping(){
		Random rand = new Random();
		int a = rand.nextInt(2);
		int jim = a;
		if(jim == 1){
			return false;
		}
		else{
			return true;
		}
	}
	public void bark(){
		System.out.println(name + ": woof woof");
	}
}
class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Dog a = new Dog();
		a.setAge(10);
		Dog b = new Dog("bob", "labrador");
		if(a.isSleeping() == true){
			System.out.println(a.getName() + " is asleep");
		}
		else{
			a.bark();
		}
		if(b.isSleeping() == true){
			System.out.println(b.getName() + " is asleep");
		}
		else{
			b.bark();
		}
	}
}
