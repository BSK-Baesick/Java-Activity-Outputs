package activity.output.MyPersonalDetails;

import java.time.Month;
import java.time.Year;

/**
 *
 * <h1> MyPersonalDetails </h1>
 * <h2> A Java program that will print:
 * <p> 1.) the name of your name and birthday </p>
 * <p> 2.) the name of your parents </p>
 * <p> 3.) the name of your school </p>
 *
 * </h2>
 *
 * @author Matthew Johannes C. Balubar
 * @version 2020.4.0a1
 * @since 2020-12-10
 *
 * @moduleNumber Module #2
 * @moduleWeek Week-2
 * @activityNumber Activity #9
 *
 * <Pseudocode>
 *
 *     TODO: Create a method that prints any message to the console
 *     TODO: Print my name, birthday, name of my parents and school to the console afterwards
 *     TODO: Refactor code
 *     TODO: (OPTIONAL) Set the range of the _studentBirthDay int variable from 1 to 31, from the minimum to maximum days of the month.
 *
 * </Pseudocode>
 *
 */

public class MyPersonalDetails
{

    // Configuration Parameters

    /**
     * @param _studentName - The Student's Name
     * @param _fatherName - Student's Father's name
     * @param _motherName - Student's Mother's name
     * @param _schoolName - Student's School's Name
     * @param _studentBirthMonth - Student's Birth Month in Enumeration (e.x: Month.JANUARY, Month.FEBRUARY, Month.MARCH...)
     * @param _studentBirthDay - Student's Birth Day
     * @param _studentBirthYear - Student's Birth Year = Year.of(INSERT BIRTH YEAR HERE)                   
     */

    private static String _studentName = "Matthew Johannes C. Balubar";
    private static String _fatherName = "Barry C. Balubar";
    private static String _motherName = "Del Casco";
    private static String _schoolName = "Cainta Senior High School";

    private static Month _studentBirthMonth = Month.FEBRUARY;

    private static Year _studentBirthYear = Year.of(2002);

    private static int _studentBirthDay = 18;

    /**
     * Main method is called on the frame when the program is enabled just before any of the methods are called the first time.
     * @param args - accepts a single argument of type String array
     */
    public static void main(String[] args)
    {
        // Executes the PrintPersonalDetails() method which prints out the following details of the student on the console
        PrintPersonalDetails();
    }

    private static void PrintPersonalDetails()
    {

        // Executes the PrintStudentName() method
        PrintStudentName();

        // Executes the PrintStudentBirthday() method
        PrintStudentBirthday();

        // Executes the PrintStudentParents() method
        PrintStudentParents();

        // Executes the PrintStudentSchool() method
        PrintStudentSchool();
    }

    private static void PrintStudentSchool()
    {
        // Print student's school name on the console
        System.out.println("I study at " + _schoolName);
    }

    private static void PrintStudentParents()
    {
        // Print parents name on the console
        System.out.println("My father's name is " + _fatherName);
        System.out.println("My mother's name is " + _motherName);
    }

    private static void PrintStudentBirthday()
    {
        // Print student's birthday in the console
        System.out.println("I'm born at " + _studentBirthMonth + " " + _studentBirthDay + " " + _studentBirthYear);
    }

    private static void PrintStudentName()
    {
        // Print student's name in the console
        System.out.println("I'm " + _studentName);
    }

    /**
     *
     * OUTPUT/RESULT:
     *
     * "C:\Users\my pc\.jdks\openjdk-15\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2020.1.3\lib\idea_rt.jar=3597:C:\Program Files\JetBrains\IntelliJ IDEA 2020.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\my pc\Documents\MEGA\Projects\Java\JavaActivityOutputs\out\production\Java" activity.output.MyPersonalDetails.MyPersonalDetails
     * I'm Matthew Johannes C. Balubar
     * I'm born at FEBRUARY 18 2002
     * My father's name is Barry C. Balubar
     * My mother's name is Del Casco
     * I study at Cainta Senior High School
     *
     * Process finished with exit code 0
     *
     */
}
