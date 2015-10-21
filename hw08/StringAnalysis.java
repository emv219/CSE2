//evan vail 
//CSE2
import java.util.Scanner;
public class StringAnalysis
{
    public static void main (String[]args)
    {
        Scanner input = new Scanner(System.in);
        int numberOfChars = 0;
        System.out.println("enter your string ");
        String userString = input.nextLine();
        System.out.println("Do you want to process the entire string (type no) or just some of it (type yes) ");
        String decision = input.nextLine();
        int length = userString.length();
        if (decision.equals("no"))
        {
            for (int i = 0; i<length; i++)
            {
                boolean letter = analyze(userString.charAt(i));
                if (letter == true)
                {
                System.out.println("This character is a letter");
                }
                else 
                {
                    System.out.println("This character is not a letter");
                }
            }
            
            
           
        }
        
        
        

        
        else if (decision.equals("yes"))
        {
             
            System.out.println("How many characters do you want to analyze? ");
            while(!input.hasNextInt())
            {
                System.out.println("That is not a valid input, please enter a number");
            }
                 numberOfChars = input.nextInt();
                if (numberOfChars>length)
                {
                    numberOfChars = length;
                }
            for (int j = 0; j<numberOfChars; j++)
                {
                    
                    boolean letter = analyze(userString.charAt(j));
                    if (letter == true)
                    {
                        System.out.println("This character is a letter");
                    }
                    else 
                    {
                        System.out.println("This character is not a letter");
                    }
           
                }
        }
    }
    
    
    
    
    
    public static boolean analyze(char userString)
    {
      
        if(Character.isLetter(userString))
        {
             return true;
        }
        
        return false;
        
    }
    
}