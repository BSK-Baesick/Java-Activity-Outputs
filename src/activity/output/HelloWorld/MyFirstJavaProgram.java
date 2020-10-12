package activity.output.HelloWorld;

/**
 *
 * <h1> MyFirstJavaProgram </h1>
 * <h2> This program prints “ Hello World” on screen </h2>
 *
 * @author Matthew Johannes C. Balubar
 * @version 2020.0.1a2
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
    public static void main(String[] args)
    {
        // Executes the PrintHelloWorld() method
        PrintHelloWorld();
    }

    private static void PrintHelloWorld()
    {
        // Prints "Hello World" in the console
        System.out.print("Hello World!");
    }

    /*
     * OUTPUT/RESULT:
     *
     * "C:\Users\my pc\.jdks\openjdk-15\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2020.1.3\lib\idea_rt.jar=11283:C:\Program Files\JetBrains\IntelliJ IDEA 2020.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\my pc\Documents\MEGA\Projects\Java\JavaActivityOutputs\out\production\Java" activity.output.MyFirstJavaProgram.MyFirstJavaProgram
     * Hello World!
     *
     * Process finished with exit code 0
     */
}
