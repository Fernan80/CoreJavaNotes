import java.util.*;
import static java.lang.Math.*; //static 

public class playground
{
    public static void main(String[] args)
    {
    
        
             /* It will round to the 6th digit because floats are */
        char its = "\u2122";
        double it = 102.12012;
        System.out.println("HELLO \t Howdy");
        System.out.println(it);
        System.out.print("Gato \\ \r sup \u2122");
        System.out.println(its);
        System.out.println("Howdy");
        

        //We bring out the scanner 
        Scanner in = new Scanner(System.in); //System probably means that it will 
        //take input from the terminal 

        System.out.print("Hello what is your name? ");
        String name = in.nextLine();

        System.out.print("May I ask, what is your age? ");
        int age = in.nextInt();
        in.close();  //you close your in so no more resource leak

        System.out.print("Hello  " + name + "! You are currently " + age +" years old!");
        System.out.println();

        double x = 9.999;
        int nx = (int) x;
        System.out.println(nx);

        double y = 9.56;
        double ny = (double) Math.round(y);
        System.out.println(ny);
        
        System.out.println("Apperand examples of coversions: "  + 9 + 2.43);

        
        System.out.println("The square root of pi is " + sqrt(PI)); 
        //Because of the static import we wouldn't add the Math class anymore for meethod
        //      
        

        

        

        


    }
}