package pkg;
import java.util.Scanner;
import java.util.Random;


public class Donkey{
	public String name;

	public Donkey(){
		name = "Donkey";
	}

	public String getName(){
		return name;
	}

	public void interact(Ogre a){
		System.out.println(a.name + ", parfaits may be the most delicious thing on the whole planet!");
	}



}
