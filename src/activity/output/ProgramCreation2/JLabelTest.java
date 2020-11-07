package activity.output.ProgramCreation2;

import javax.swing.*;

/**
 *
 * <h1> JFrameTest </h1>
 *
 * <h2>
 * A form application in java with the following features:
 * 1.The window title must be your name in uppercase.
 * 2.Window size is 300 pixels wide and 300 pixels height
 * 3.Must be able to automatically terminate the program when closing the window.
 * 4.Must have a label with your name on it in lowercase
 * </h2>
 *
 * @author Matthew Johannes C. Balubar
 * @version 2020.12.0a1
 * @since 2020-7-10
 *
 * @moduleNumber Module #6
 * @moduleWeek Week-6
 * @activityNumber Part #1
 *
 * <Pseudocode>
 *
 *     TODO: Instantiate JFrame (https://www.javatpoint.com/java-jframe)
 *     TODO: Instantiate JLabel (https://www.geeksforgeeks.org/jlabel-java-swing/)
 *     TODO: Use the JFrame to display a GUI window with a size of 300x300
 *     TODO: Use the JLabel to display a label/text inside the GUI Window
 *     TODO: The window label must be the same as my name
 *     TODO: Create a method that will terminate the program after closing the window.
 *     TODO: Refactor Code
 *
 * </Pseudocode>
 *
 */

public class JLabelTest
{

    // Configuration Parameters
    private static boolean isVisible = true; // specifies whether the window is visible or not

    private static String myName = "Matthew Johannes C. Balubar"; // student's name

    // Cached Components

    // JFrame class is a type of container which inherits the java. awt.
    // Frame class. JFrame works like the main window where components like labels, buttons, text fields
    // are added to create a GUI. Unlike Frame, JFrame has the option to hide or close the window with the
    // help of setDefaultCloseOperation(int) method.
    private static JFrame jFrame;

    // JLabel is a class of java Swing. JLabel is used to display a short string or an image icon.
    // JLabel can display text, image or both. JLabel is only a display of text or image and it cannot get focus.
    // JLabel is inactive to input events such a mouse focus or keyboard focus.
    private static JLabel jLabel;

    /**
     * Main method is called on the frame when the program is enabled just before any of the methods are called the first time.
     * @param args - accepts a single argument of type String array
     */
    public static void main(String[] args)
    {
        // Initialize cached components

        // Create a new JFrame object and set its title to my name
        jFrame = new JFrame(myName);

        // Create a new JLabel object and display myName in lowercase inside the GUI Window
        jLabel = new JLabel(myName.toLowerCase());

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
        jFrame.setSize(300, 300);

        // Specifies what happens when the user closes the frame. The EXIT_ON_CLOSE operation exits the program when
        // the user closes the frame. This behavior is appropriate for this program because the program has only one
        // frame, and closing the frame makes the program useless.
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add the JLabel object to the GUI window
        jFrame.add(jLabel);
    }

    /**
     *
     * OUTPUT/RESULT:
     *
     * CONSOLE MESSAGE AT THE START OF THE PROGRAM:
     * "C:\Users\my pc\.jdks\openjdk-15\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2020.1.3\lib\idea_rt.jar=5987:C:\Program Files\JetBrains\IntelliJ IDEA 2020.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\my pc\Documents\MEGA\Projects\Java\JavaActivityOutputs\out\production\Java" activity.output.ProgramCreation2.JLabelTest
     *
     * THE GUI WINDOW: See application at https://imgur.com/a/KUfSzzP
     *
     * CONSOLE MESSAGE AFTER CLOSING THE PROGRAM:
     * "C:\Users\my pc\.jdks\openjdk-15\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2020.1.3\lib\idea_rt.jar=5987:C:\Program Files\JetBrains\IntelliJ IDEA 2020.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\my pc\Documents\MEGA\Projects\Java\JavaActivityOutputs\out\production\Java" activity.output.ProgramCreation2.JLabelTest
     *
     * Process finished with exit code 0
     *
     */
}
