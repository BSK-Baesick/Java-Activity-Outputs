package activity.output.ProgramCreation3;

/**
 *
 * <h1> VariablesTest </h1>
 *
 * <h2>A program that can compute and print an output of the average of the scores of four students.</h2>
 *
 * @author Matthew Johannes C. Balubar
 * @version 2020.13.0a1
 * @since 2020-2-12
 *
 * @moduleNumber Module #7
 * @moduleWeek Week-7
 * @activityNumber Activity 1.6 - Program Creation
 *
 * <Pseudocode>
 *
 *     NOTE ON GETTING THE AVERAGE: Average, which is the arithmetic mean, is calculated by adding a group of numbers
 *     and then dividing by the count of those numbers.
 *
 *     STUDENT GRADES LIST: 80, 78, 85, 90
 *
 *     TODO: Store the value of all the student grades. The variables must use "double" as a datatype.
 *     TODO: Compute the sum of all the student grades
 *     TODO: Compute the average grade of all the students
 *     TODO: Print the result in the console
 *     TODO: Refactor Code
 *
 * </Pseudocode>
 *
 */

public class VariablesTest
{

    // Configuration Parameters
    static double[] grades; // the grades array is used to store all the student grades
    static double gradeSum; // the total sum of all grades are stored here
    static double gradeAverage; // the total sum of all grades divided by their overall total count/length are stored here

    /**
     * Main method is called on the frame when the program is enabled just before any of the methods are called the first time.
     * @param args - accepts a single argument of type String array
     */
    public static void main(String[] args)
    {
        // Initialize array. The items/elements are based on the given student grades on the Pseudocode
        grades = new double[]{80, 78, 85, 90};

        // Execute the following methods.
        // We did some encapsulation here for refactoring purposes to make our code clean and easy to read.
        Add();
        GetAverage();
        PrintResult();
    }

    private static void PrintResult()
    {
        // Print the sum of all the grades
        System.out.println("The sum of all the student grades is: " + gradeSum);

        // Print the average of the student grades
        System.out.println("The average of all the student grades is: " + gradeAverage);
    }

    private static void GetAverage()
    {
        // The grade average is equals to the gradeSum divided to the total size of items/elements in the grades array
        // .length is used to identify the count of items/elements in an array
        // This is the reason I choose to use an array (we could also use a "list") since this is the most optimal
        // variation to use when getting the average because of its .length function.
        gradeAverage = gradeSum / grades.length;
    }

    private static void Add()
    {
        // We used a "for" loop to avoid having to type all the student grades all over again and to avoid repetition.
        // Similar to the expression "sum=80+78+85+90"
        // For each item in the array, add them to the gradeSum
        for (double grade : grades)
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
     * The sum of all the student grades is: 333.0
     * The average of all the student grades is: 83.25
     *
     * Process finished with exit code 0
     *
     */
}
