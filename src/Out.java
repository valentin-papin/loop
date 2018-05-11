import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;

public class Out {

    public static void print(String message, Color color){
        System.out.print(ansi().fg(color));
        System.out.print(message);
        System.out.print(ansi().fg(DEFAULT));
    }

    /**
     * Prints a String with a color and then terminate the line.
     * @param message The String to be printed
     * @param color The color to use
     */
    public static void println(String message, Color color){
        System.out.print(ansi().saveCursorPosition());
        System.out.print(ansi().scrollUp(1));
        System.out.print(System.lineSeparator());
        System.out.print(ansi().newline());
        print(message, color);
        //System.out.print(ansi().restoreCursorPosition());
        //System.out.print(ansi().cursorDownLine());
    }

    public static void error(Exception e){
        Out.println("ERROR: " + e.getMessage(), RED);
    }
}
