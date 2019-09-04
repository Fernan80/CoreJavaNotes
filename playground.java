import java.util.*;
import static java.lang.Math.*; //static 

public class playground
{
    public static void main(String[] args)
    {
    
        double it = 102.12012;
             /* It will round to the 6th digit because floats are */
        char its = '\u2122';
        System.out.println("HELLO \t Howdy");
        System.out.println(it);
        System.out.print("Gato \\ \r sup \u2122");
        System.out.println(its);
        System.out.println("Howdy");
        

        //We bring out the scanner 
        Scanner in = new Scanner(System.in); 

        System.out.print("What is your name: ");
        String name = in.nextLine();

        System.out.print("What is your age? ");
        int age = in.nextInt();

        System.out.print("Hello " + name + "! You are " + age + " years old!");
        System.out.println();

        double x = 9.999;
        int nx = (int) x;
        System.out.println(nx);

        double y = 9.56;
        double ny = (double) Math.round(y);
        System.out.println(ny);
        
        System.out.println("Apperand examples of coversions: "  + 9 + 2.43);

        
        System.out.println("The square root of pi is " + Math.sqrt(PI));
        
        

        

        

        


    }
}