import java.util.Scanner;//Emphasizes that you need the scanner import or you will get an error 

public class gettingInput {
  public static void main(String[] args) {
    
    // Create scanner object
    Scanner input = new Scanner(System.in);
    
    // Output the prompt
    System.out.println("Enter a floating point value");
    
    // Wait for the user to enter something.
    double value = input.nextDouble();
    
    // Tell them what they entered.
    System.out.println("You entered: " + value); 
  }
}