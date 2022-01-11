package pkg;
import java.util.Scanner;
import java.util.Random;


public class Ogre{
	public String name;
	public boolean ugly;
	

	public Ogre(){
		name = "Shrek";
		ugly = true;
	}

	public String getName(){
		return name;
	}

	public void isUgly(Donkey a){
		System.out.println(a.name + ", what are you doing in my swamp?!");
	}


}
