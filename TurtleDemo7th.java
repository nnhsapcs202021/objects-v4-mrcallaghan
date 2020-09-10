/**
 * Every Java program contains one or more classes (e.g., HelloPrinter).
 * 
 * In general, every source file (e.g., HelloPrinter.java) contains one class (e.g., HelloPrinter).
 * 
 * The source file name must match the class name.
 * 
 * By convention, class names start with an uppercase letter.
 *
 * @author mcallaghan
 * @version 09 September 2020
 */
import java.awt.Color;

public class TurtleDemo7th
{
    
    /*
     * A class contains methods.
     * 
     * Most Java programs contain a class with a main method.
     * 
     * The main method is executed when the program starts.
     */
    public static void main(String[] args)
    {
        World ocean = new World();  // create a new World; a canvas on which Turtle objects can draw
        Turtle crush = new Turtle(ocean); // create a new Turtle object from the Turtle class, referenced by the variable 'crush'
        crush.setPenColor(Color.ORANGE);  // run methods on the turtle object
        crush.penDown();
        crush.forward(50);
        
        /*
         * A method contains statements.
         * 
         * Statements may invoke other methods (e.g., forward).
         * 
         * In general, methods are invoked on objects (e.g., crush).
         * 
         * When invoking a method, arguments are passed in parentheses (e.g., 50).
         */
        crush.forward(50);    // move crush forward 50 pixels
        
        // this is a single-line comment (like # python)
        
        /*
         * Identifiers are any combination of:
         *  letters
         *  digits (but not as first character)
         *  underscores (_)
         *  dollar signs  ($)
         *  
         *  These are the various identifiers;
         */
        
        int y, x2, x_y, x$;
        
        // This is not a valid identifier:
        //int 2y;
        
        /*
         * Identifiers are case sensitive (case matters).
         * 
         * These are different:
         */
        Turtle squirt, SQUIRT, sQUirT;
        
        /*
         * By convention, constant values are all uppercase. Use an underscore between words.
         */
        int SPEED_OF_LIGHT = 300000000; // meters/second
        
        /*
         * By convention, most identifiers start with a lowercase letter.
         *  Subsequent words start with an uppercase letter (CamalCase)
         */
        World pacificOcean;
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
}