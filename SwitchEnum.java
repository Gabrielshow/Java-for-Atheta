//Enum in a switch statement
public class SwitchEnum {
	public static void main(String[] args) {
		EnumClass.Level myVar = EnumClass.Level.MEDIUM;
		
		switch(myVar) {
			case LOW:
			System.out.println("Low Level");
			break;
			
			case MEDIUM:
			System.out.println("Medium Level");
			break;
			
			case HIGH:
			System.out.println("High level");
			break;
		}
	}
}

//the enum type has a values() method, which returns an array of all enum constant
// this method is useful when you want to loop through the constants of an enum:

//for (EnumClass.Level myVar : EnumClass.Level.values()) {
	// System.out.println(myVar);
// }

// an enum cannot be used to create objects, and it cannot extend other classes and interfaces
// an enum can, just like a class, have attributes and methods. The only difference is that enum
// constants are public, static and final (unchangeable - cannot be overridden).

// use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards



