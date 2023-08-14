//Interface
// another way to achieve abstraction in Java, is with interfaces.
// An interface is a completely "abstract class" that is used to group related
// methods with empty bodies

interface Animal {
	public void animalSound();
	public void sleep();
}

//interface must be implemented 
class Cat implements Animal {
	public void animalSound() {
		System.out.println("The cat says: meow meow");
	}
	
	public void sleep() {
		System.out.println("Zzz");
	}
	
}

class CatImplementsInterface {
	public static void main(String[] args) {
		Cat myCat  = new Cat(); 
		myCat.animalSound();
		myCat.sleep();
	}
}
//Java doesn't support multiple inheritance but a class can implement multiple interfaces
//interfce methods are by default abstract and public
//interface attributes are by default public, static and final
// An interface cannot contain a constructor
// interface FirstInterface {
  // public void myMethod(); // interface method
// }

// interface SecondInterface {
  // public void myOtherMethod(); // interface method
// }

// class DemoClass implements FirstInterface, SecondInterface {
  // public void myMethod() {
    // System.out.println("Some text..");
  // }
  // public void myOtherMethod() {
    // System.out.println("Some other text...");
  // }
// }

// class MyMainClass {
  // public static void main(String[] args) {
    // DemoClass myObj = new DemoClass();
    // myObj.myMethod();
    // myObj.myOtherMethod();
  // }
// }

	