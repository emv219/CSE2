//evan vail 
//CSE2
/*i could not figure out how to create this program with the exact specifications that were given,
but i did manage to git it to work exactly as intended with a similar use of methods*/ 
import java.util.Scanner; //call a scanner 
public class StringAnalysis  // class 
{
    public static void main (String[]args)  //main method 
    {
        Scanner input = new Scanner(System.in);  //define a scanner
        int numberOfChars = 0;  //define a variable for future use
        System.out.println("enter your string ");  //prompt user for their string 
        String userString = input.nextLine();  //define user input as a string
        System.out.println("Do you want to process the entire string (type no) or just some of it (type yes) ");  //prompt whether they want to analyze the entire string or jsut some of it
        String decision = input.nextLine(); //define their decision as a string
        int length = userString.length();  //define the length of the string for future use
        if (decision.equals("no"))  //statement for what the program should do if the user wants the entire string analyzed
        {
            for (int i = 0; i<length; i++)  //loops the call of the method for every character in the string
            {
                boolean letter = analyze(userString.charAt(i));  //define the otuput of the called method as a boolean 
                if (letter == true)  //if statement for the system output depending on the analysis of the method
                {
                System.out.println("This character is a letter"); 
                }
                else 
                {
                    System.out.println("This character is not a letter");
                }
            }
            
            
           
        }
        
        else if (decision.equals("yes"))  //this does the same thing as the previous if statement but if the user wants only some of the string analyzed
        {
             
            System.out.println("How many characters do you want to analyze? ");  //prompts the user for how many characters they want analyzed
            while(!input.hasNextInt())  //makes sure the input is valid
            {
                System.out.println("That is not a valid input, please enter a number");
            }
                 numberOfChars = input.nextInt();
                if (numberOfChars>length)  //if the user says to analyze more characters than are present this makes the user input equal to the number of chars in their string
                {
                    numberOfChars = length;  
                }
            for (int j = 0; j<numberOfChars; j++)  //same as for the previous loop 
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
    }//end of method
    public static boolean analyze(char userString)  //method that determines if the input is a letter or not
    {
      
        if(Character.isLetter(userString)) //true of it is a letter
        {
             return true;
        }
        
        return false;  //false if it is something else
        
    }  //end of method 
}  //end of class