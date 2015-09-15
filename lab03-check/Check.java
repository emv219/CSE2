//Evan Vail
//9-11-15
//Check program
//this program will calculate the total cost of a dinner for each person from the input of the bill, number of people and desired tip

import java.util.Scanner; //import data in the program run

public class Check{
//main method of every java program
public static void main(String[]args) {
    
    Scanner myScanner = new Scanner (System.in);
    
System.out.print("Enter the original cost of the check in the form xx.xx: ");
double checkCost = myScanner.nextDouble();

//prompt user for the tip percentage they would like to give
System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form of xx)");
double tipPercent = myScanner.nextDouble();
tipPercent /= 100; //percentage to decimal

//prompt user for the number of people that are in the group
System.out.print("Enter the number of people who went out to dinner: ");
int numPeople = myScanner.nextInt();
double totalCost, costPerPerson;
int dollars, //dollar amount of cost
dimes, //tens place of cost
pennies;// ones place of cost
totalCost = checkCost * (1+tipPercent);
costPerPerson = totalCost / numPeople;
//drop decimal fraction of cost
dollars=(int)costPerPerson;
//get tens place value
dimes=(int)(costPerPerson*10)%10;
//get ones place value
pennies=(int)(costPerPerson*100)%100;
//print out cost for each individual
System.out.println("Each person in the group owes: $" + dollars + "." + dimes + pennies);
    }//end of main method
}//end of class