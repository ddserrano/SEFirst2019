
/**
 * Write a description of class MyProgram here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyProgram
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class MyProgram
     */
    public static void main(String[] args)
    {
        rec(3, 5);
    }  
    
    public static void rec(int x, int y)
    {
        System.out.println(x);
        if (x < 500)
        {
            rec(x+y, y);
        }
    }

}
