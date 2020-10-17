package activity.output.ProgramTracing;

/**
 *
 * <h1> ProgramTracing </h1>
 * <h2> Write the output of the source code below.
 *
 * public class Activity
 * {
 *
 * public static void main(String[] args)
 * {
 *
 * String school = “SJLSHS”;
 *
 * int x = 5, y = 3;
 * int z = x - y;
 *
 * System.out.println(“The name of my school is ” + school);
 *
 * System.out.println(“The value of x is ” + x + “ and the value of y is ” + y);
 *
 * System.out.println(x + “ - ” + y + “ = ” + z);
 * }
 *
 * }
 *
 * </h2>
 *
 * @author Matthew Johannes C. Balubar
 * @version 2020.5.0a1
 * @since 2020-17-10
 *
 * @moduleNumber Module #3
 * @moduleWeek Week-3
 * @activityNumber Activity #6
 *
 */

public class Activity
{
    public static void main(String[] args)
    {
        String school = "SJLSHS";

        int x = 5, y = 3;
        int z = x - y;

        System.out.println("The name of my school is " + school);

        System.out.println("The value of x is " + x + " and the value of y is " + y);

        System.out.println(x + " - " + y + " = " + z);
    }

    /**
     *
     * OUTPUT/RESULT:
     *
     * "C:\Users\my pc\.jdks\openjdk-15\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2020.1.3\lib\idea_rt.jar=3876:C:\Program Files\JetBrains\IntelliJ IDEA 2020.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\my pc\Documents\MEGA\Projects\Java\JavaActivityOutputs\out\production\Java" activity.output.ProgramTracing.Activity
     * The name of my school is SJLSHS
     * The value of x is 5 and the value of y is 3
     * 5 - 3 = 2
     *
     * Process finished with exit code 0
     *
     */
}