package activity.output.MyFirstJavaProgram;

/**
 *
 * <h1> MyFirstJavaProgram </h1>
 * <h2> a Java program that will display:
 *
 * <p>“Good morning!”</p>
 * <p>“My name is (_your name_)”<p/>
 * <p>“ I studied @ (your school) ”</p>
 *
 * </h2>
 *
 * @author Matthew Johannes C. Balubar
 * @version 2020.2.0a2
 * @since 2020-12-10
 *
 * @moduleNumber Module #2
 * @moduleWeek Week-2
 * @activityNumber Activity #5
 *
 * <Pseudocode>
 *
 *     TODO: Create a method that prints any message on the console
 *     TODO: Print a greeting and make an introduction about my name and school
 *     TODO: Refactor code
 *
 * </Pseudocode>
 *
 */

public class MyFirstJavaProgram
{

    // Configuration Parameters

    /**
     * @param _name - Insert Student's Name HERE
     * @param _schoolName - Insert School's Name HERE
     */

    private static String _name = "Matthew Johannes C. Balubar";
    private static String _schoolName = "Cainta Senior High School";

    /**
     * Main method is called on the frame when the program is enabled just before any of the methods are called the first time.
     * @param args - accepts a single argument of type String array
     */
    public static void main(String[] args)
    {
        // Executes the PrintGreetings() method
        // PrintGreetings();

        // Executes the PrintName() method
        // PrintName();

        // Executes the PrintSchoolName() method
        // PrintSchoolName();

        // Executes the PrintAllMessages() method.
        // This method is used to avoid the repetition of System.out.println() methods in the script.
        PrintAllMessages();
    }

    private static void PrintSchoolName()
    {
        // Prints a school name in the console
        System.out.println("I studied at " + _schoolName);
    }

    private static void PrintName()
    {
        // Prints a name in the console
        System.out.println("My name is " + _name);
    }

    private static void PrintGreetings()
    {
        // Prints a greeting in the console
        System.out.println("Good morning!");
    }

    private static void PrintAllMessages()
    {
        // Prints all the messages written above in just one line of code
        System.out.print("Good morning!\nMy name is " + _name + "\nI studied at " + _schoolName);
    }

    /*

     * OUTPUT/RESULT
     *
     * "C:\Users\my pc\.jdks\openjdk-15\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2020.1.3\lib\idea_rt.jar=11457:C:\Program Files\JetBrains\IntelliJ IDEA 2020.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\my pc\Documents\MEGA\Projects\Java\JavaActivityOutputs\out\production\Java" activity.output.MyFirstJavaClass.MyFirstJavaClass
     * Good morning!
     * My name is Matthew Johannes C. Balubar
     * Cainta Senior High School
     *
     * Process finished with exit code 0
     *
     */
}
