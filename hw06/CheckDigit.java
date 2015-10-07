//Evan Vail
//CSE2


import java.util.Scanner; //import Scanner code for user input

public class CheckDigit{
public static void main (String[]args){
    Scanner myScanner = new Scanner(System.in);
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
double spendFlux = 0;
int upDown = 0;
double sum = 0.0;
double spendFluxPercent = 0.0;
double spendAvg = 0.0;
double weekSpending = 0.0;
for(int i=1; i<52; i++){
    spendFlux = (int)(Math.random() * 20);
    upDown = (int)(Math.random() * 1);
    if(upDown > 0){
        spendFlux = (-1)*(spendFlux);
    }
    spendFluxPercent = ((double)spendFlux/100);
    spendAvg = (monSpent + tuesSpent +wedSpent+thurSpent+friSpent+satSpent+sunSpent)/7;
    weekSpending = (spendAvg * spendFluxPercent) + spendAvg;
    sum += weekSpending;
        }
System.out.println("Your average weekly spending is " + spendAvg);
System.out.println("Your average weekly spending is " + weekSpending);
System.out.println ("Your estimated spending over 4 years is " + sum*4);
    }
}