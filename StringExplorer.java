
/**
 * Exploring the String class and its methods.
 *
 * @author mrcallaghan
 * @version 22sep2020
 */
public class StringExplorer
{
    public static void main(String[] args)
    {
        String river = new String("Mississippi");
        String river2 = "Mississippi"; // string literal
        river.replace("i", "x");
        System.out.println(river);
        
        /*
         * The replace method returns a reference to a new String object.
         *   It does not change the String object on which it is invoked.
         * The String class has no mutator methods.  It is not possible to change a String object.
         * 
         * Strings are immutable.
         */
        
        String riverX = river.replace("i", "x");
        System.out.println(riverX);
    }
}
