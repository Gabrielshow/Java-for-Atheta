//Abstraction is the process of hiding certain details and showing
//only essential information to the user
//it can achieved with either abstract classes or interfaces
// abstract keyword is a non-access modifier, used for classes and methods
// abstract class is a restricted class that cannot be used to create objects
// (to access it, it must be inherited from another class).
// abstract method can only be used in an abstract class, and it does not have a body
// The body is provided by the subclass(inherited from).

abstract class Animal {
	// Abstract method ( does not have a body)
	public abstract void animalSound();
	// Regular method
	public void sleep() {
		System.out.println("Zzz");
	}
}

class Cow extends Animal{
public void animalSound(){
	System.out.println("The cow says: Moo Moo");
}
}

class Output {
	public static void main(String[] args) {
		Cow myCow = new Cow(); 
		myCow.animalSound();
		myCow.sleep();
	}
}

