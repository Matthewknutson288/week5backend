package week5backend;

//Step 1 & 2: Create an interface named Logger with two methods
interface Logger {
 void log(String message);
 void error(String message);
}

//Step 3 & 4: Create a class AsteriskLogger that implements Logger
class AsteriskLogger implements Logger {
 public void log(String message) {
     System.out.println("***" + message + "***");
 }

 public void error(String message) {
     String border = "*".repeat(message.length() + 12);
     System.out.println(border);
     System.out.println("***Error: " + message + "***");
     System.out.println(border);
 }
}

//Step 3 & 5: Create a class SpacedLogger that implements Logger
class SpacedLogger implements Logger {
 public void log(String message) {
     System.out.println(message.replace("", " ").trim());
 }

 public void error(String message) {
     System.out.println("ERROR: " + message.replace("", " ").trim());
 }
}

//Step 6: Create a class named Main that has a main method
public class Main {
 public static void main(String[] args) {
     // Instantiate an instance of each logger class
     Logger asteriskLogger = new AsteriskLogger();
     Logger spacedLogger = new SpacedLogger();

     // Test both methods on both instances
     asteriskLogger.log("Hello");
     asteriskLogger.error("Hello");

     spacedLogger.log("Hello");
     spacedLogger.error("Hello");
 }
}