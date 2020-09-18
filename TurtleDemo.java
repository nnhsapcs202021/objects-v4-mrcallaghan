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

public class TurtleDemo
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
         *    letters
         *    digits (but not first character)
         *    underscores
         *    dollar signs
         *    
         *    These are various examples of identifiers
         */
        int y, x2, x_y, x$;

        //This is not valid:
        //int 2y;

        /*
         * Identifiers are case sensitive (case matters).
         * 
         * These are three different identifiers:
         */
        Turtle squirt, SQUIRT, sQUirt;

        /*
         * By convention, constants are all uppercase.  Use an underscore to separate words.
         * 
         */
        int SPEED_OF_LIGHT = 300000000; // m/s

        /*
         * By convention, most other identifiers start with a lowercase letter.
         *   Subsequent words start with an uppercase letter. (CamalCase)
         */
        World pacificOcean;

        // this is a compile-time error (this code does not even compile)  AKA syntax errors.
        //crush.forwrd(50);

        /*
         * run-time error. (this code compiles and runs, but it generates an exception.  
         *    In most cases, the program will crash.
         */
        //crush.forward(1/0);

        /*
         * Another type of run-time error. (code compiles and runs, but doesn't produce the expected output)
         */
        // turn left and move forward, but it turns the wrong way
        crush.turn(90);
        crush.forward(50);

    }

    public static void drawLine()
    {
        /*
         * Objects are entities in a program.
         *  Objects have attributes.
         *  Objects are manipulated by invoking methods.
         *  
         *  ocean and crush are variables that are referencing objects
         *  
         *  Classes describe a collection of objects.
         *      All objects of a class have the came behavior (methods),
         *        and they have the same type of attributes (but the may have different values).
         *        
         *  World and Turtle are classes.
         */
        World ocean = new World();
        
        /*
         * We use the new operator to contruct (create, instantiate) an object.
         * 
         * The class of the object is spectified immediately after the new operator (e.g., Turtle).
         * 
         * If we need to pass additional information to construct the object, arguments are
         *      specified in parentheses after the class (e.g., ocean).
         * 
         */
        Turtle crush = new Turtle(ocean);
        
        /*
         * Variables store value to be used later.
         *  Variables have a type (e.g., int), a name (e.g. width), and a value (e.g. 20).
         */
        int width;  //declaring a variable
        width = 20; // assigning a value to a variable
        
        int width2 = 100;  // declaring and assigning in one statement
        
        /*
         * Java has several primitive data types
         *      boolean holds a value of true or false
         *      int holds an integer number
         *      double holds a real number (floating point)
         *      char holds a single character
         */
        
        // here is a boolean
        boolean isSummer = true;
        
        // here is a double
        double salesTaxRate = 0.075;
        
        // here is a char
        char letter = 'c';
        
        /*
         * When invoking methods, we use the dot operator (i.e., '.') to invoke a method on an object.
         * 
         * Some methods take no arguments, but we still have parentheses (e.g., penDown).
         * 
         * Some methods take one or more arugments (e.g., forward).
         * 
         * Mutator methods modify the state (i.e., values of attributes) of the object.
         *      penDown, forward, setPenColor are all mutator methods.
         * 
         */
        crush.penDown();
        crush.forward(25);
        crush.setPenColor(Color.RED);
        crush.forward(50);
        
        /*
         * Accessor method returns the value of an attribute of the object.
         *      The state of the object does not change.
         *      
         *  getPenWidth is an accessor method.
         */
        int penWidth = crush.getPenWidth();
    
    }

}
