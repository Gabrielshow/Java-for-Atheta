// input types
// nextBoolean() reads a boolean value from the user
// nextByte() reads a byte value from the user
// nextDouble() reads a double value from the user
// nextFloat()
// nextInt()
// nextLine()  reads a string value from the user
// nextLong()  reads a long value from the user
// nextShor() reads a short value from the user

import java.util.Scanner;

class ScanInput {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter name, age and salary:");

    // String input
    String name = myObj.nextLine();

    // Numerical input
    int age = myObj.nextInt();
    double salary = myObj.nextDouble();

    // Output input by user
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
  }
}