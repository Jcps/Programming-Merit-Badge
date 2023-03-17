import java.util.Scanner;

class CelsiusToFahrenheit {

  public static void main(String[] args) {
    // Sets up a way for us to ask for input from the user.
    Scanner scanner = new Scanner(System.in);

    // Prints the message to the user.
    System.out.print("Enter a temperature in Celsius: ");

    // Take the the next line of text input by the user, save it as a String
    String userName = scanner.nextLine();

    // Define a variable of type Double
    Double celsius;

    // The below code tries to parse a Double from the input from the user.
    // If the user does not put in a number, it will show an error and end the program.
    try {
      celsius = Double.parseDouble(userName);
    } catch (NumberFormatException e) {
      System.out.println("That wasn't a number!");
      return;
    }
    /*
      Here, you need to do the following:
        1. Convert the celsius to fahrenheit using the following formula: (celsius × (9/5)) + 32
        2. Assign that fahrenheit value to a variable.
        3. Based on that value, write if statements to print out if you need a coat, or you can wear shorts
    */

  }
}
