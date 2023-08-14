//Java Dates
// Java does not have a built-in Date class, but we can import the 
// java.time package to work with the date and time API. the package includes many date and time classes.
// LocalDate
// Represents a date (year, month, day (yyyy-MM-dd))
// LocalTime
// Represents a time (hour, minute, second and milliseconds (HH-mm-ss-zzz))
// LocalDateTime
// Represents both a date and a time (yyyy-MM-dd-HH-mm-ss.zzz)
// DateTimeFormatter
// Formatter for displaying and parsing date-time objects

// To display the current date, import the java.time.LocalDate class, and use its now() method:

import java.time.LocalDate; // import the LocalDate class
import java.time.LocalTime; // import the LocalTime class
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class DateClass {
  public static void main(String[] args) {
    LocalDate myObj = LocalDate.now(); // Create a date object
    LocalTime Time = LocalTime.now();
	LocalDateTime DateTime = LocalDateTime.now();
	System.out.println("Before Formatting: ");
	System.out.println(myObj); // Display the current date
	System.out.println(Time);
	System.out.println(DateTime);
	DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	String formattedDate = DateTime.format(myFormatObj);
	System.out.println("After formatting: " + formattedDate);
  }
}

// To display the current time (hour, minute, second, and milliseconds), import the java.time.LocalTime class, and use its now() method:
// To display the current date and time, import the java.time.LocalDateTime class, and use its now() method:
// The "T" in the example above is used to separate the date from the time. You can use the DateTimeFormatter class with the ofPattern() method in the same package to format or parse date-time objects. The following example will remove both the "T" and milliseconds from the date-time:
// The ofPattern() method accepts all sorts of values, if you want to display the date and time in a different format. For example:
// Value
// Example
// yyyy-MM-dd
// "1988-09-29"
// dd/MM/yyyy
// "29/09/1988"
// dd-MMM-yyyy
// "29-Sep-1988"
// E, MMM dd yyyy
// "Thu, Sep 29 1988"
