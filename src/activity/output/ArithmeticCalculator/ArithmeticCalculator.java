package activity.output.ArithmeticCalculator;

import java.util.Scanner;

/**
 *
 * <h1> ArithmeticCalculator </h1>
 * <h2>
 * A java program that will allow the user to input two integer values and the program
 * will print the results of:
 * a. addition
 * b. subtraction
 * c. division
 * d. multiplication
 *
 * Output:
 * Enter value1:
 * Enter value2:
 * The result of addition is 50
 * The result of subtraction is 30
 * The result of division is 4
 * The result of multiplication is 400
 * </h2>
 *
 * @author Matthew Johannes C. Balubar
 * @version 2020.8.0a1
 * @since 2020-20-10
 *
 * @moduleNumber Module #4
 * @moduleWeek Week-4
 * @activityNumber Activity #7
 *
 * <Pseudocode>
 *
 *     TODO: Create a method that will get two integer value from the user input
 *     TODO: Add the two integer value
 *     TODO: Subtract the two integer value
 *     TODO: Divide the two integer value
 *     TODO: Multiply the two integer value
 *     TODO: Refactor code
 *
 * </Pseudocode>
 *
 */

public class ArithmeticCalculator
{

    // Configuration Parameters
    static int _userFirstNumber;
    static int _userSecondNumber;

    // Cached Components
    static Scanner scanner;

    /**
     * Main method is called on the frame when the program is enabled just before any of the methods are called the first time.
     * @param args - accepts a single argument of type String array
     */
    public static void main(String[] args)
    {
        // Initialize cached components
        scanner = new Scanner(System.in);

        // The user will be asked to choose and input two integers
        PickANumber();

        // Solve. The methods take in two int parameters that our program will be using in solving math.
        Add(_userFirstNumber, _userSecondNumber);
        Subtract(_userFirstNumber, _userSecondNumber);
        Divide(_userFirstNumber, _userSecondNumber);
        Multiply(_userFirstNumber, _userSecondNumber);

        // We have used the close() method to close the object. It is recommended to close the scanner object once the input is taken.
        scanner.close();
    }

    private static void PickANumber()
    {
        // Ask for the 1st user input value.
        System.out.print("Enter value1: ");

        // The input must be of type int
        _userFirstNumber = scanner.nextInt();

        // Ask for the 2nd user input value.
        System.out.print("Enter value2: ");

        // The input must be of type int
        _userSecondNumber = scanner.nextInt();
    }

    /**
     * This method adds the two user input integer value
     * @param value1 - the user's first chosen number
     * @param value2 - the user's second chosen number
     */
    private static void Add(int value1, int value2)
    {
        // The sum of the 1st and 2nd user input
        int sum = value1 + value2;

        // Print sum
        System.out.println("The result of addition is " + sum);
    }

    /**
     * This method subtracts the two user input integer value
     * @param value1 - the user's first chosen number
     * @param value2 - the user's second chosen number
     */
    private static void Subtract(int value1, int value2)
    {
        // The difference of the 1st and 2nd user input
        int difference = value1 - value2;

        // Print difference
        System.out.println("The result of subtraction is " + difference);
    }

    /**
     * This method divides the two user input integer value
     * @param value1 - the user's first chosen number
     * @param value2 - the user's second chosen number
     */
    private static void Divide(int value1, int value2)
    {
        // The quotient of the 1st and 2nd user input
        int quotient = value1 / value2;

        // Print quotient
        System.out.println("The result of division is " + quotient);
    }

    /**
     * This method multiplies the two user input integer value
     * @param value1 - the user's first chosen number
     * @param value2 - the user's second chosen number
     */
    private static void Multiply(int value1, int value2)
    {
        // The product of the 1st and 2nd user input
        int product = value1 * value2;

        // Print product
        System.out.println("The result of multiplication is " + product);
    }

    /**
     *
     * OUTPUT/RESULT:
     *
     * "C:\Users\my pc\.jdks\openjdk-15\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2020.1.3\lib\idea_rt.jar=8044:C:\Program Files\JetBrains\IntelliJ IDEA 2020.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\my pc\Documents\MEGA\Projects\Java\JavaActivityOutputs\out\production\Java" activity.output.ArithmeticCalculator.ArithmeticCalculator
     * Enter value1: 40
     * Enter value2: 10
     * The result of addition is 50
     * The result of subtraction is 30
     * The result of division is 4
     * The result of multiplication is 400
     *
     * Process finished with exit code 0
     *
     */
}
