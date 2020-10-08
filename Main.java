import java.util.Scanner;

/**
 * program thats swaps values for ascending order
 * 
 * @author Darian
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * 
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double values[] = new double[2];

    // ask the user for two values
    System.out.println("Please enter the 2 values for the array");
    for (int i = 0; i < values.length; i++) {
      values[i] = input.nextDouble();
    }

    if (values[0] >= values[1]) {
      double temp = values[0];
      values[0] = values[1];
      values[1] = temp;
      System.out.println("Your numbers in ascending order are " + values[0] + " and " + values[1]);

    } else if (values[0] <= values[1]) {
      System.out.println("Your numbers in ascending order are " + values[0] + " and " + values[1]);
    }
  }
}
