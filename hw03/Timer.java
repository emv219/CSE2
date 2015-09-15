//Evan Vail
//CSE2
//Timer program 
//this program will prompt the user for the current time
//and what time they are going to dinner and give them the amount of time remaining before dinner

import java.util.Scanner; //import data from the user

public class Timer{
//main method of every java program
public static void main (String[]args){
    
Scanner myScanner = new Scanner (System.in);  //define scanner

//prompt user for the current time
System.out.println("What is the current time in terms 0000-2400? ");
int currentTime = myScanner.nextInt(); //define the current time as an input variable
System.out.println("What time are you going to dinner in terms of 0000-2400?"); //prompt user for time they are going to dinner
int dinnerTime = myScanner.nextInt(); //define dinner time as an input variable
//calculate the difference between the current time and dinner time
int timeRemaining = dinnerTime - currentTime; //calculate the time remaining
int hoursRemaining = timeRemaining /100; //get the time in hours, automatically truncates for just hours remaining
int minutesRemaining = timeRemaining - (100*hoursRemaining);  //get the time in minutes

System.out.println("There are " + hoursRemaining + " hour(s) and " + minutesRemaining + " minutes until dinner");  //print out result
    } //end of main method
} //end of class
