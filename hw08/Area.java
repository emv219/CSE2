//Evan Vail
//CSE2
/* this program will calculate the area of either a rectangle,
triangle, or circle depending on the input from the user. */

import java.util.Scanner;  //call the scanner source code for user input
public class Area
{ 
    Scanner input = new Scanner(System.in); //define a scanner
    public static void main (String[] args)  //main method
    { 
        Scanner input = new Scanner(System.in);  //define scanner again
        System.out.println("What shape do you want to compute the area of?");  //prompt user for what shape they want
        String response = input.nextLine();  //define the response as a string 
        whatShape(response);  //call the identification method
        
    }
    
    public static void whatShape(String response)  //method to identify what shape the user input and give them the area
    {
        Scanner input = new Scanner(System.in);  //define scanner in this method
    for (int i = 0;i<2; i++)  //loop to prompt the user until they give one of the three shapes 
        {
        if (response.equals("circle"))  //if the user inputs circle
        {
            i = 2;  //breaks the loop 
            System.out.println("What is the radius of the circle? ");  //prompts user for radius
            while (!input.hasNextDouble())  //prohibits the user from entering anything that is not a number
            {
                System.out.println("That is not a valid input");
                response = input.nextLine();
            }
            double radius = input.nextDouble();  //defines the input as the radius 
            double pi = Math.PI;  //defines pi using a method built into java
            double circArea = circleArea(radius, pi);  // creates a variable for the area and calls upon the method to calculate the area
            System.out.println("The area of your circle is " + circArea);  //outputs the area for the shape
        }
        else if (response.equals("rectangle")) // if the user inputs rectangle
        {
            i = 2;  //breaks the loop
            System.out.println("what is the length of the rectangle? ");  //prompts user for the length of the rectangle
            while (!input.hasNextDouble()) //user must input a number
            {
                System.out.println("that is not a valid input, please enter a number "); 
                response = input.nextLine();
            }
            double length = input.nextDouble();  // define length as a variable 
            System.out.println("What is the width of the rectangle? ");  //same process for width as length
            while (!input.hasNextDouble())
            {
                System.out.println("that is not a valid input, please enter a number");
                response = input.nextLine();
            }
            double width = input.nextDouble();
            double rectArea = (rectangleArea(length, width)); //creates variable for area and calls on the calculation method for the rectangle
            System.out.println("The area of your rectangle is " + rectArea);
        }    
        else if (response.equals("triangle"))  //what the triangle code is identical to the statements for rectangle and circle, 
        {                                      //just changes variable names and calls the triangle calculation method as opposed to the other shapes
            i = 2;                             //calling their respective methods
            System.out.println("What is the base of the triangle? ");
            while (!input.hasNextDouble())
            {
                System.out.println("that is not a valid input, please enter a number");
                response = input.nextLine();
            }
            double base = input.nextDouble();
            System.out.println("What is the height of your triangle?");
            while (!input.hasNextDouble())
            {
                System.out.println("that is not a valid input please enter a number");
                response = input.nextLine();
            }
            double height = input.nextDouble();
            double triArea = (triangleArea(base, height));
            System.out.println("the area of your triangle is " + triArea);
        }
       else  //if the user does not enter one of the three shapes
        {
            i = 0;  //maintains the loop
            System.out.println("error: please enter one of the three shapes");  //tells user this is an error
             response = input.nextLine();  //redefines the response
        }
        }
    }
    
    public static double circleArea(double radius, double pi)  //method that calculates the area for a circle
    {
        return(pi*radius*radius);
    }
    public static double rectangleArea(double length, double width)  //calculates the area for a rectangle
    {
    return(length * width);
    }
    public static double triangleArea(double base, double height) //calculates the area of a triangle 
    {
        return(.5*base*height);
    }
    
} // end of class 
 