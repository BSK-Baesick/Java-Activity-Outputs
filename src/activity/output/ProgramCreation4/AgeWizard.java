package activity.output.ProgramCreation4;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * <h1> AgeWizard </h1>
 *
 * <h2>An application that asks for the user’s name, age and birth year
 * then displays an output of the user’s name with his/her age after 50 years and what year will it
 * be.</h2>
 *
 * @author Matthew Johannes C. Balubar
 * @version 2020.14.0a1
 * @since 2020-2-12
 *
 * @moduleNumber Module #8
 * @moduleWeek Week-8
 * @activityNumber Activity 1.8 - Program Creation
 *
 * <Pseudocode>
 *
 *     TODO: Ask for the user's name, age and birth date
 *     TODO: Validate the user's input in case they typed in something that is out of bounds
 *     TODO: Print the result in the console
 *     TODO: (OPTIONAL) Reset the user's session
 *     TODO: Refactor Code
 *
 * </Pseudocode>
 *
 */

public class AgeWizard
{

    // Configuration Parameters
    private static int _userAge; // the user's current age
    private static int _userBirthDay; // the user's birth day in a month

    private static String _userName; // the user's name
    private static String _userInputBirthMonth; // the inputted user's birth month in the console
    private static String _userRespond; // the user's respond when resetting the session

    private static int _userBirthYear; // the user's birth year

    private static Month _userBirthMonth; // the user's birth month in type Month

    protected static LocalDate _birthday; // the user's birthday

    // Cached Components
    static Scanner scanner; // input system

    /**
     * Main method is called on the frame when the program is enabled just before any of the methods are called the first time.
     * @param args - accepts a single argument of type String array
     */
    public static void main(String[] args)
    {
        // Initialize cached components
        scanner = new Scanner(System.in);

        Introduction();

        AskUserName();

        AskUserAge();

        AskUserBirthday();

        CalculateUserData();

        PrintAnswer();

        ResetSession();
    }

    // OPTIONAL: This method reverts the user's session back from the start
    private static void ResetSession()
    {
        // Ask the user for response
        System.out.println("Retry?");

        // Gets the user's response
        System.out.print("ENTER YES TO START A NEW SESSION: ");
        _userRespond = scanner.next().toUpperCase();

        // Check whether the user wants to retry the session
        if (_userRespond == "YES")
        {
            // Start again
            Introduction();
        }
        else
        {
            // Stop the console operation
            System.exit(0);
        }
    }

    // This method prints the answer in the user's console
    private static void PrintAnswer()
    {
        // Print Answer
        System.out.println("Hold your breath, " + _userName + "! I'm going to read your mind...");
        System.out.println("Alakazam! Alakazum!! Abrakadabra!!!");
        System.out.println("My psychic powers tells me that you will be " + _userAge + " in " + _birthday + ", " + _userName + "!");
    }

    // This method is responsible for solving the user's expected age 50 years from now
    private static void CalculateUserData()
    {
        // The user's age 50 years from now
        _userAge = _userAge + 50;

        // The user's birth year
        _userBirthYear = _userBirthYear + 50;

        // Set the user's birth date. We supply the following parameters in order to get the user's birth date.
        SetBirthDate(_userBirthMonth, _userBirthDay, _userBirthYear);
    }

    // This method is responsible for asking the user's birthday in the console
    private static void AskUserBirthday()
    {
        // Ask for the user's birthday
        System.out.println("So, " + _userName + ". When is your birthday?");

        ProcessBirthMonth();

        ProcessBirthDay();

        ProcessBirthYear();
    }

    // This method is responsible for checking the user's birth year
    private static void CheckBirthYear()
    {
        // Validate the user's birth year
        if (_userBirthYear <= 1950 || _userBirthYear >= 2020)
        {
            System.out.println("I'm pretty sure you aren't a caveman living in the paleolithic age...");
            System.out.println("And probably not a time traveler that came from the future.");
            System.out.println("My psychic powers is fool proof, my dear!");

            ProcessBirthYear();
        }
    }

    // This method is responsible for getting and setting the user's birth month
    private static void ProcessBirthYear()
    {
        // Get the user's birth month
        System.out.print("Enter your birth year: ");
        _userBirthYear = scanner.nextInt();

        CheckBirthYear();
    }

    // This method is responsible for getting and setting the user's birth day
    private static void ProcessBirthDay()
    {
        // Get the user's birth day
        System.out.print("Enter your birth day: ");
        _userBirthDay = scanner.nextInt();

        CheckUserBirthDay();
    }

    // This method is responsible for checking the user's birth day
    private static void CheckUserBirthDay()
    {
        // Validate the user's birth day
        if (_userBirthDay <= 0 || _userBirthDay >= 32)
        {
            System.out.println("Your birthday seems out of 'da world, my dear!");
            System.out.println("Kindly input a valid day, please?");

            ProcessBirthDay();
        }
    }

    // This method is responsible for getting and setting the user's birth month
    private static void ProcessBirthMonth()
    {
        // Get the user's birth month
        System.out.print("Enter your birth month (e.x: JANUARY, FEBRUARY, MARCH...): ");
        _userInputBirthMonth = scanner.next().toUpperCase();

        SetBirthMonth();
    }

    // This method is responsible for asking the user's age in the console
    private static void AskUserAge()
    {
        // Ask for the user's age
        System.out.println("What a beautiful name! How old are you, " + _userName + "?");

        // Get the user's age
        System.out.print("Enter your age: ");
        _userAge = scanner.nextInt();

        // Response to the user input. This will tell the user that his/her the input has been registered successfully.
        System.out.println("Don't worry, my dear! Age is just a word.");
    }

    // This method is responsible for asking the user's name in the console
    private static void AskUserName()
    {
        // Ask for the user's name
        System.out.println("What's yo' name, li'l fella?");

        // Get the user's name
        System.out.print("Enter your name: ");
        _userName = scanner.next();

        // Capitalize the first letter of the user's name
        _userName = _userName.substring(0, 1).toUpperCase() + _userName.substring(1);
    }

    // Greet the user
    private static void Introduction()
    {
        // Print Intro to the console
        System.out.println("Greetings stranger! Welcome to the Age Wizard!");
        System.out.println("Lem'me guess your age 50 years from now...");
    }

    /**
     * This method is responsible for setting the user's birth date
     *
     * @param birthMonth - user's birth month
     * @param birthDay - user's birth day
     * @param birthYear - user's birth year
     */
    private static void SetBirthDate(Month birthMonth, int birthDay, int birthYear )
    {
        // Set the user's birth date
        _birthday = LocalDate.of(birthYear, birthMonth, birthDay);
    }

    // This method is responsible for setting the user's birth month
    private static void SetBirthMonth()
    {
        // Validate the user's birth month
        switch (_userInputBirthMonth)
        {
            case "JANUARY" :
                _userBirthMonth = Month.JANUARY;
                break;
            case "FEBRUARY" :
                _userBirthMonth = Month.FEBRUARY;
                break;
            case "MARCH" :
                _userBirthMonth = Month.MARCH;
                break;
            case "APRIL" :
                _userBirthMonth = Month.APRIL;
                break;
            case "MAY" :
                _userBirthMonth = Month.MAY;
                break;
            case "JUNE" :
                _userBirthMonth = Month.JUNE;
                break;
            case "JULY" :
                _userBirthMonth = Month.JULY;
                break;
            case "AUGUST" :
                _userBirthMonth = Month.AUGUST;
                break;
            case "SEPTEMBER" :
                _userBirthMonth = Month.SEPTEMBER;
                break;
            case "OCTOBER" :
                _userBirthMonth = Month.OCTOBER;
                break;
            case "NOVEMBER" :
                _userBirthMonth = Month.NOVEMBER;
                break;
            case "DECEMBER" :
                _userBirthMonth = Month.DECEMBER;
                break;

                // Catch the user's input in case their input is out of bounds
            default:
                System.out.println("My psychic powers seems like it isn't registering what you've just typed.");
                System.out.println("If you could use proper English and spelling that'd be great!");
                ProcessBirthMonth();
        }
    }

    /**
     *
     * OUTPUT/RESULT:
     *
     * "C:\Users\my pc\.jdks\openjdk-15\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2020.1.3\lib\idea_rt.jar=3837:C:\Program Files\JetBrains\IntelliJ IDEA 2020.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\my pc\Documents\MEGA\Projects\Java\JavaActivityOutputs\out\production\Java" activity.output.ProgramCreation4.AgeWizard
     * Greetings stranger! Welcome to the Age Wizard!
     * Lem'me guess your age 50 years from now...
     * What's yo' name, li'l fella?
     * Enter your name: matthew
     * What a beautiful name! How old are you, Matthew?
     * Enter your age: 18
     * Don't worry, my dear! Age is just a word.
     * So, Matthew. When is your birthday?
     * Enter your birth month (e.x: JANUARY, FEBRUARY, MARCH...): februaey
     * My psychic powers seems like it isn't registering what you've just typed.
     * If you could use proper English and spelling that'd be great!
     * Enter your birth month (e.x: JANUARY, FEBRUARY, MARCH...): february
     * Enter your birth day: 40
     * Your birthday seems out of 'da world, my dear!
     * Kindly input a valid day, please?
     * Enter your birth day: 18
     * Enter your birth year: 9000
     * I'm pretty sure you aren't a caveman living in the paleolithic age...
     * And probably not a time traveler that came from the future.
     * My psychic powers is fool proof, my dear!
     * Enter your birth year: 2002
     * Hold your breath, Matthew! I'm going to read your mind...
     * Alakazam! Alakazum!! Abrakadabra!!!
     * My psychic powers tells me that you will be 68 in 2052-02-18, Matthew!
     * Retry?
     * ENTER YES TO START A NEW SESSION: nope
     *
     * Process finished with exit code 0
     *
     */
}
