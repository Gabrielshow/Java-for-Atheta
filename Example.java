//java inner classes
class OuterClass {
	int x = 10;
	
	class InnerClass {
		int y = 8;
	}
	
}

class OuterClass1 {
	int x = 11;
	
	class InnerClass1 {
		public int myInnerMethod() {
			return x;
		}
	}
}



public class Example{
	public static void main(String[] args){
		OuterClass myOuter = new OuterClass();
		OuterClass.InnerClass myInner = myOuter.new InnerClass();
		System.out.println(myInner.y + myOuter.x);
		OuterClass1 myOuter1 = new OuterClass1();
		OuterClass1.InnerClass1 myInner1 = myOuter1.new InnerClass1();
		System.out.println(myInner1.myInnerMethod());
	}
}

// Outputs 18 (10 + 8)
// an inner class can be private or protected
// if we don't want outside objects to access the inner class
// an inner class can also be static, which means that you can access it without creating
// an object of the outer class:
// just like static attributes and methods, a static inner class does not have access to 
// members of the outer class.
// one attribute of inner class is that they can access attribute and methods of the outer class



