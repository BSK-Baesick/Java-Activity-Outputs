package activity.output.AreaOfSquare;

import java.util.Scanner;

/**
 *
 * <h1> AreaOfSquare </h1>
 * <h2> A Java program that will compute the area of square. </h2>
 *
 * @author Matthew Johannes C. Balubar
 * @version 2020.10.0a1
 * @since 2020-21-10
 *
 * @moduleNumber Module #4
 * @moduleWeek Week-4
 * @activityNumber Activity #9
 *
 * <Pseudocode>
 *
 *     TODO: Find out how to get the area of the square (LINK: https://www.web-formulas.com/Math_Formulas/Geometry_Area_of_Square.aspx)
 *     TODO: Create a method that will get an integer value from the user input. This input will determine the side/length (or the "a" symbol) of the square.
 *     TODO: Compute the area of the square using the given length
 *     TODO: Refactor code
 *     TODO (OPTIONAL): Catch the "InputMismatchError" in case the user types in another type other than the specified type in the input process
 *
 * </Pseudocode>
 *
 */

public class AreaOfSquare
{

    // Configuration Parameters
    static int _squareLength;
    static int _squareArea;

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

        // Execute methods
        PickALength();
        ComputeAreaOfSquare();
        ShowResult();
    }

    private static void ShowResult()
    {
        // Print the result in the console
        System.out.println("The area of the square is equals to " + _squareArea);
    }

    private static void ComputeAreaOfSquare()
    {
        // Shorthand for "a symbol" (the length of the square) raise to the power of 2
        _squareArea = _squareLength * _squareLength;
    }

    private static void PickALength()
    {
        // Ask for the user input value.
        System.out.print("Enter the square side/length: ");

        // The input must be of type int
        _squareLength = scanner.nextInt();
    }

    /**
     *
     * OUTPUT/RESULT:
     *
     * "C:\Users\my pc\.jdks\openjdk-15\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2020.1.3\lib\idea_rt.jar=1956:C:\Program Files\JetBrains\IntelliJ IDEA 2020.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\my pc\Documents\MEGA\Projects\Java\JavaActivityOutputs\out\production\Java" activity.output.AreaOfSquare.AreaOfSquare
     * Enter the square side/length: 10
     * The area of the square is equals to 100
     *
     * Process finished with exit code 0
     *
     */
}
