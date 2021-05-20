
package activity.output.AverageCalculator;

/**
 *
 * <h1> ArithmeticCalculator </h1>
 * <h2> A Java program that will compute the sum and average of 85, 77, 90, 81, 84. 88, 87, 90 </h2>
 *
 * @author Matthew Johannes C. Balubar
 * @version 2020.1.0a1
 * @since 2021-20-04
 *
 * <Pseudocode>
 *
 *     TODO: Create a method that will compute average of the given numbers on h2 tag
 *     TODO: Refactor code
 *
 * </Pseudocode>
 *
 */

public class AverageCalculator
{

    // Configuration Parameters
    static int[] grades; // array is used to store the numbers
    static int gradeSum; // the total sum of all numbers
    static int gradeAverage; // the total sum of all numbers divided by their overall total count

    public static void main(String[] args)
    {
        // Initialize array. Items are based on the given numbers on the h2
        grades = new int[]{85, 77, 90, 81, 84, 88, 87, 90};

        Add();
        GetAverage();
        PrintResult();
    }

    private static void PrintResult()
    {
        // Print the sum of the eight numbers
        System.out.println("Sum of eight numbers is: " + gradeSum);

        // Print the average of the eight numbers
        System.out.println("Average of eight numbers is: " + gradeAverage);
    }

    private static void GetAverage()
    {
        // The grade average is equals to the gradeSum divided to the total size of items in the grades array
        gradeAverage = gradeSum / grades.length;
    }

    private static void Add()
    {
        // For each item in the array, add them to the gradeSum
        for (int grade : grades)
        {
            // Shorthand syntax for gradeSum = gradeSum + grade
            gradeSum += grade;
        }
    }

    /**
     *
     * OUTPUT/RESULT:
     *
     * "C:\Users\my pc\.jdks\openjdk-15\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2020.1.3\lib\idea_rt.jar=9372:C:\Program Files\JetBrains\IntelliJ IDEA 2020.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\my pc\Documents\MEGA\Projects\Java\JavaActivityOutputs\out\production\Java" activity.output.AverageCalculator.AverageCalculator
     * Sum of five numbers is: 682
     * Average of five numbers is: 85
     *
     * Process finished with exit code 0
     *
     */
}