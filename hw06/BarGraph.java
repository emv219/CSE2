//Evan Vail
//CSE2 
/*This program will take input from a user for how much money they spent each day 
and will visually represent spending as a bar graph using **s for the bar graph */

import java.util.Scanner; //import Scanner code for user input

public class BarGraph{  
public static void main (String[]args){  //method for all java programs
    Scanner myScanner = new Scanner(System.in);  //define scanner for user input
    //prompt user for what they spent on each day
System.out.println("What did you spend on Monday?"); 
double monSpent = myScanner.nextDouble();
System.out.println("What did you spend on Tuesday?");
double tuesSpent = myScanner.nextDouble();
System.out.println("What did you spend on Wednesday?");
double wedSpent = myScanner.nextDouble();
System.out.println("What did you spend on Thursday?");
double thurSpent = myScanner.nextDouble();
System.out.println("What did you spend on Friday?");
double friSpent = myScanner.nextDouble();
System.out.println("What did you spend on Saturday?");
double satSpent = myScanner.nextDouble();
System.out.println("What did you spend on Sunday?");
double sunSpent = myScanner.nextDouble();

//use a for loop to print out what spent each day as a bar graph using *s
System.out.print("Monday:    ");
for(int i=0; i<monSpent; i++){
System.out.print("*");
}
System.out.println();
System.out.print("Tuesday:   ");
for(int i=0; i<tuesSpent; i++){ 
System.out.print("*");
}
System.out.println();
System.out.print("Wednesday: ");
for(int i=0; i<wedSpent; i++){
System.out.print("*");
}
System.out.println();
System.out.print("Thursday:  ");
for(int i=0; i<thurSpent; i++){
System.out.print("*");
}
System.out.println();
System.out.print("Friday:    ");
for(int i=0; i<friSpent; i++){
System.out.print("*");
}
System.out.println();
System.out.print("Saturday:  ");
for(int i=0; i<satSpent; i++){
System.out.print("*");
}
System.out.println();
System.out.print("Sunday:   ");
for(int i=0; i<sunSpent; i++){
System.out.print("*");
}
System.out.println();
//initialize all variables to be used in the for loop
double spendFlux = 0;
int upDown = 0;
double sum = 0.0;
double spendFluxPercent = 0.0;
double spendAvg = 0.0;
double weekSpending = 0.0;
//for loop to calculate the average money spent and spending over a year
for(int i=1; i<52; i++){
    spendFlux = (int)(Math.random() * 20);
    upDown = (int)(Math.random() * 1);
    if(upDown > 0){
        spendFlux = (-1)*(spendFlux);  //positice or negative change of <=20%
    }
    spendFluxPercent = ((double)spendFlux/100);
    spendAvg = (monSpent + tuesSpent +wedSpent+thurSpent+friSpent+satSpent+sunSpent)/7;
    weekSpending = (spendAvg * spendFluxPercent) + spendAvg;
    sum += weekSpending; //sum all the calculations for projected spending in a year
        }
System.out.println("Your average weekly spending is " + spendAvg);  //print out average weekly spending
System.out.println ("Your estimated spending over 4 years is " + sum*4); //pring out projected spending over 4 years

}  //end of main method
}  //end of class