//Encapsulation
class Person {
	private String name;
	
	//Getter
	public String getName() {
		return name;
	}
	
	//Setter
	public void setName(String newName){
		this.name = newName;
	}
}

public class EncapsulatedClass {
	public static void main(String[] args){
		Person myObj = new Person();
		myObj.setName("John");// Set the value of the name variable
		System.out.println(myObj.getName());
	}
}

//outputs "John"

