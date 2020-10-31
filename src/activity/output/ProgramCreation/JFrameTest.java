package activity.output.ProgramCreation;

import javax.swing.*;

/**
 *
 * <h1> JFrameTest </h1>
 *
 * <h2>
 * A form application in java with the following features:
 * 1.) Must display a window with your name as the title.
 * 2.) Window size is 600 pixels wide and 400 pixels height
 * 3.) Must be able to automatically terminate the program when closing the window.
 * </h2>
 *
 * @author Matthew Johannes C. Balubar
 * @version 2020.11.0a1
 * @since 2020-31-10
 *
 * @moduleNumber Module #5
 * @moduleWeek Week-5
 * @activityNumber Part #1
 *
 * <Pseudocode>
 *
 *     TODO: Instantiate JFrame (https://www.javatpoint.com/java-jframe)
 *     TODO: Use the JFrame to display a GUI window with a size of 600x400
 *     TODO: The window title must be the same as my name
 *     TODO: Create a method that will terminate the program after closing the window.
 *     TODO: Refactor Code
 *
 * </Pseudocode>
 *
 */

public class JFrameTest
{

    // Configuration Parameters
    private static boolean isVisible = true; // specifies whether the window is visible or not

    // Cached Components

    // JFrame class is a type of container which inherits the java. awt.
    // Frame class. JFrame works like the main window where components like labels, buttons, text fields
    // are added to create a GUI. Unlike Frame, JFrame has the option to hide or close the window with the
    // help of setDefaultCloseOperation(int) method.
    private static JFrame jFrame;

    /**
     * Main method is called on the frame when the program is enabled just before any of the methods are called the first time.
     * @param args - accepts a single argument of type String array
     */
    public static void main(String[] args)
    {
        // Initialize cached components
        jFrame = new JFrame("Matthew Johannes C. Balubar"); // Create a new JFrame object and set its title to my name

        // Setup the window
        Setup();

        // Open the window
        OpenWindow();
    }

    private static void OpenWindow()
    {
        // Show the window
        jFrame.setVisible(isVisible);
    }

    private static void Setup()
    {
        // Set the size of our window
        jFrame.setSize(600, 400);

        // Specifies what happens when the user closes the frame. The EXIT_ON_CLOSE operation exits the program when
        // the user closes the frame. This behavior is appropriate for this program because the program has only one
        // frame, and closing the frame makes the program useless.
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     *
     * OUTPUT/RESULT:
     *
     * CONSOLE MESSAGE AT THE START OF THE PROGRAM:
     * "C:\Users\my pc\.jdks\openjdk-15\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2020.1.3\lib\idea_rt.jar=5651:C:\Program Files\JetBrains\IntelliJ IDEA 2020.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\my pc\Documents\MEGA\Projects\Java\JavaActivityOutputs\out\production\Java" activity.output.ProgramCreation.JFrameTest
     *
     * THE GUI WINDOW: See application at https://imgur.com/a/KUfSzzP
     *
     * CONSOLE MESSAGE AFTER CLOSING THE PROGRAM:
     * "C:\Users\my pc\.jdks\openjdk-15\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2020.1.3\lib\idea_rt.jar=5651:C:\Program Files\JetBrains\IntelliJ IDEA 2020.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\my pc\Documents\MEGA\Projects\Java\JavaActivityOutputs\out\production\Java" activity.output.ProgramCreation.JFrameTest
     *
     * Process finished with exit code 0
     *
     */
}
