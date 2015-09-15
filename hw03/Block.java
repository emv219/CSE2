//Evan Vail 
//CSE2
//Block program
//this program will take the dimensions of a block from a user and calculate
//the volume and surface area of the block

import java.util.Scanner; //import data from the user

public class Block{
public static void main (String[]args){ 
    
Scanner myScanner = new Scanner (System.in);

//prompt user for block dimensions
System.out.println("enter the length of the block:");
double blockLength = myScanner.nextDouble(); //define input as a variable
System.out.println("enter the width of the block:");
double blockWidth = myScanner.nextDouble();
System.out.println("enter the height of the block:");
double blockHeight = myScanner.nextDouble();
//calculate volume of the block
double blockVolume = blockHeight*blockWidth*blockLength;
//calculate surface area of the block
double blockSurfaceArea = (blockLength*blockWidth*2) + (blockLength*blockHeight*2)
+ (blockWidth*blockHeight*2);
//output the values
System.out.println("The volume of the block of dimensions " + blockHeight + " x "
+ blockWidth + " x " + blockLength + " is " + blockVolume);
System.out.println("The surface area of the block is " + blockSurfaceArea);
    } //end of main method 
} //end of class