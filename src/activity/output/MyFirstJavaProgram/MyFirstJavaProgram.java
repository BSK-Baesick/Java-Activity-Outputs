package activity.output.MyFirstJavaProgram;

/**
 *
 * <h1> Scripts.MyFirstJavaProgram </h1>
 * <h2> This program prints “ Hello World” on screen </h2>clear
 *
 * @author Matthew Johannes C. Balubar
 * @version 2020.0.0a1
 * @since 2020-12-10
 *
 * @moduleNumber Module #2
 * @moduleWeek Week-2
 * @activityNumber Activity #4
 *
 */

public class MyFirstJavaProgram
{
    /**
     * Main method is called on the frame when the program is enabled just before any of the methods are called the first time.
     * @param args - accepts a single argument of type String arra
     */
    public static void main(String args[])
    {
        // Executes the PrintHelloWorld() method
        PrintHelloWorld();
    }

    private static void PrintHelloWorld()
    {
        // Prints "Hello World" in the console
        System.out.print("Hello World!");

        // Outputs "Hello World"
    }
}
