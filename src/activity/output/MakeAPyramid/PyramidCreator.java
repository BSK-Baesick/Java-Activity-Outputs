package activity.output.MakeAPyramid;

/**
 *
 * <h1> PyramidCreator </h1>
 * <h2> a program that will display a pyramid of asterisks.
 *
 * <p>*</p>
 * <p>**</p>
 * <p>***</p>
 * <p>****</p>
 * <p>*****</p>
 *
 * </h2>
 *
 * @author Matthew Johannes C. Balubar
 * @version 2020.3.0a1
 * @since 2020-12-10
 *
 * @moduleNumber Module #2
 * @moduleWeek Week-2
 * @activityNumber Activity #8
 *
 */

public class PyramidCreator
{

    private static int _loopIndex;
    private static String _asterisksPlaceholder = "*";
    private static String[] _asterisksPyramid;

    /**
     * Main method is called on the frame when the program is enabled just before any of the methods are called the first time.
     * @param args - accepts a single argument of type String array
     */
    public static void main(String[] args)
    {
        // Executes the VARIATION #1 of the Pyramid Creator
        //CreateNoobPyramid();

        // Executes the VARIATION #2 of the Pyramid Creator
        //CreateBeginnerPyramid();

        // Executes the VARIATION #3 of the Pyramid Creator
        //CreateClassicPyramid();

        // Executes the VARIATION #4 of the Pyramid Creator
        CreateIntermediatePyramid();
    }

    // VARIATION #1: A simple pyramid made with multiple System.out.println() methods.
    private static void CreateNoobPyramid()
    {
        // Print one asterisks to the console.
        System.out.println("*");

        // Print two asterisks to the console.
        System.out.println("**");

        // Print three asterisks to the console.
        System.out.println("***");

        // Print four asterisks to the console.
        System.out.println("****");

        // Print five asterisks to the console.
        System.out.println("*****");
    }

    // VARIATION #2: A beginner pyramid made with System.out.print() method.
    private static void CreateBeginnerPyramid()
    {
        // Prints an asterisk pyramid in the console using one line of code.
        System.out.print("*\n**\n***\n****\n*****");
    }

    // VARIATION #3: A classic pyramid made with "for" loop.
    private static void CreateClassicPyramid()
    {
        // Iterates and prints out asterisk/s on the console until the _loopIndex is less than 5.
        for (_loopIndex = 0; _loopIndex < 5; _loopIndex++)
        {
            // Prints an asterisks on the console.
            System.out.println(_asterisksPlaceholder);

            // Add another asterisk to the _asterisksPlaceholder.
            _asterisksPlaceholder += "*";
        }
    }

    // VARIATION #4: An intermediate pyramid made with arrays, "for" loops and "for-each" loops.
    private static void CreateIntermediatePyramid()
    {

        // Initialize the _asteriskPyramid items to have a size of 5
        _asterisksPyramid = new String[5];

        // Set _asterisksPlaceholder value to empty
        _asterisksPlaceholder = "";

        // Iterates and add asterisk/s on the _asterisksPyramid until the _loopIndex is less than 5.
        for (_loopIndex = 0; _loopIndex < 5; _loopIndex++)
        {
            // Add another asterisk to the _asterisksPlaceholder.
            _asterisksPlaceholder += "*";

            // Stack the _asterisksPlaceholder value to the current _asterisksPyramid array element index.
            _asterisksPyramid[_loopIndex] = _asterisksPlaceholder;
        }

        // Iterate through the elements of _asterisksPyramid.
        for (String asterisksPyramid: _asterisksPyramid)
        {
            // Prints an asterisk/s on the console.
            System.out.println(asterisksPyramid);
        }
    }

    /**
     *
     * OUTPUT/RESULT
     *
     * "C:\Users\my pc\.jdks\openjdk-15\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2020.1.3\lib\idea_rt.jar=14116:C:\Program Files\JetBrains\IntelliJ IDEA 2020.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\my pc\Documents\MEGA\Projects\Java\JavaActivityOutputs\out\production\Java" activity.output.MakeAPyramid.PyramidCreator
     * *
     * **
     * ***
     * ****
     * *****
     *
     * Process finished with exit code 0
     *
     */
}