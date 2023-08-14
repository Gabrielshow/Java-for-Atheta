//inheritance
//to inherit a class, we use the extends keyword
class Vehicle{
	protected String brand = "Ford"; //Vehicle attribute
	public void honk() {
		System.out.println("Tuut, tuut!");
	}
}

class Car extends Vehicle {
	private String modelName = "Mustang"; //car attribute
	public static void main(String[] args) {
		Car myCar = new Car();  //Car object
		myCar.honk();  
		System.out.println(myCar.brand + " " + myCar.modelName);
	}
}

//if you don't want other classes to inherit from a class, use the final keyword:
//if you try to access a final class, java will generate an eror:


		
