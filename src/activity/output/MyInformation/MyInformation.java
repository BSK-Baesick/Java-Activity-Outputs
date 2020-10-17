package activity.output.MyInformation;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * <h1> MyInformation </h1>
 * <h2> A JAVA code that will display my last name, first name, middle initial, school, age, birth date and weight. </h2>
 *
 * @author Matthew Johannes C. Balubar
 * @version 2020.6.0a1
 * @since 2020-17-10
 *
 * @moduleNumber Module #3
 * @moduleWeek Week-3
 * @activityNumber Activity #8
 *
 * <Pseudocode>
 *
 *     TODO: Create a method that prints any message to the console
 *     TODO: Print the following details needed
 *     TODO: Refactor code
 *
 * </Pseudocode>
 *
 */

public class MyInformation
{

    // Configuration Parameters

    /**
     * @param _lastName - Student's last Name
     * @param _firstName - Student's first name
     * @param _middleInitial - Student's name middle initial
     * @param _schoolName - Student's school's name
     * @param _studentWeight - Student's current weight
     * @param _studentBirthday - The student birthday (written like LocalDate.if(year, month, dayOfMonth)).
     * @param _birthday - The student birthday in "Date" datatype. Used to identify the age of the student.
     */

    private static String _lastName = "Balubar";
    private static String _firstName = "Matthew";
    private static String _schoolName = "Cainta Senior High School";

    private static char _middleInitial = 'C';

    private static int _studentWeight = 132;

    private static LocalDate _studentBirthday = LocalDate.of(2002, Month.FEBRUARY, 18);

    protected static Date _birthday;

    /**
     * Main method is called on the frame when the program is enabled just before any of the methods are called the first time.
     * @param args - accepts a single argument of type String array
     */
    public static void main(String[] args)
    {
        // Set the Student's Birthday
        SetBirthDate(2002, Calendar.FEBRUARY, 18);

        // Executes the PrintStudentInformation() method which prints out the following details of the student on the console
        PrintStudentInformation();
    }

    private static void PrintStudentInformation()
    {
        // Executes the PrintStudentName() method
        PrintStudentName();

        // Executes the PrintStudentAge() method
        PrintStudentAge();

        // Executes the PrintStudentSchoolName() method
        PrintStudentSchoolName();

        // Executes the PrintStudentBirthday() method
        PrintStudentBirthday();

        // Executes the PrintWeight() method
        PrintStudentWeight();
    }

    private static void PrintStudentWeight()
    {
        // Print the student's weight in the console
        System.out.println("Weight: " + _studentWeight + " lbs.");
    }

    private static void PrintStudentBirthday()
    {
        // Print the student's birthday in the console
        System.out.println("Birthday: " + _studentBirthday);
    }

    private static void PrintStudentSchoolName()
    {
        // Print the student's school name in the console
        System.out.println("School Name: " + _schoolName);
    }

    private static void PrintStudentAge()
    {
        // Print the student's age in the console
        System.out.println("Age: " + GetAge());
    }

    // A method that returns the age of the student based on his age
    public static int GetAge()
    {
        // Calendar objects for "today" and "date of birth"...
        Calendar today    = Calendar.getInstance();
        Calendar birthday = new GregorianCalendar();
        birthday.setTime( _birthday );

        // Compute basic difference in years ....
        int yearDiff = today.get( Calendar.YEAR ) - birthday.get( Calendar.YEAR );

        // Birthday still needs to occur this year...
        if ( today.get(Calendar.MONTH) < birthday.get(Calendar.MONTH) )
        {
            yearDiff = yearDiff - 1;
        }

        else if (today.get(Calendar.MONTH) == birthday.get(Calendar.MONTH) && today.get(Calendar.DATE) < birthday.get(Calendar.DATE))
        {
            yearDiff = yearDiff - 1;
        }

        return yearDiff;
    }

    /**
     * This method is responsible for setting the _birthday value
     *
     * @param aBirthDate - we can pass in a Date parameter as a value of _birthday
     */
    public static void SetBirthDate(Date aBirthDate)
    {
        _birthday = aBirthDate;
    }

    /**
     * Same as the above method which is responsible for setting the _birthday value. But we can pass in 3 integer value to set the
     * value of _birthday.
     *
     * @param iYear - Student year of birth
     * @param iMonth - Student month of birth
     * @param iDay - Student day of birth
     */
    public static void SetBirthDate(int iYear, int iMonth, int iDay )
    {
        // Instantiate a calendar
        Calendar cal = Calendar.getInstance();

        // Set calendar date
        cal.set( iYear, iMonth, iDay );

        _birthday = cal.getTime();
    }

    private static void PrintStudentName()
    {
        // Print the student's name in the console
        System.out.println("Last Name: " + _lastName);
        System.out.println("First Name: " + _firstName);
        System.out.println("Middle Initial: " + _middleInitial);
    }

    /**
     *
     * OUTPUT/RESULT:
     *
     * "C:\Users\my pc\.jdks\openjdk-15\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2020.1.3\lib\idea_rt.jar=5190:C:\Program Files\JetBrains\IntelliJ IDEA 2020.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\my pc\Documents\MEGA\Projects\Java\JavaActivityOutputs\out\production\Java" activity.output.MyInformation.MyInformation
     * Last Name: Balubar
     * First Name: Matthew
     * Middle Initial: C
     * Age: 18
     * School Name: Cainta Senior High School
     * Birthday: 2002-02-18
     * Weight: 132 lbs.
     *
     * Process finished with exit code 0
     *
     */
}
