//Evan Vail
//9-2-15
//CSE2
//Section 110
//Arithmetic Calculations program

//Compile the program
    //javac Arithmetic.java
//Run the program
    //java Arithmetic

//Define a class
public class Arithmetic{
    
    //add main method 
    public static void main(String[] args){
        
//define variables and values

//number of pair of socks
    int nSocks=3;
//cost per pair 
//('$' is part of the variable name)
    double sockCost$=2.58;
    
//Number of drinking glasses
    int nGlasses=6;
//cost per glass
    double glassCost$=2.29;

//Number of boxes of envelopes 
    int nEnvelope=1;
//cost per box on envelopes 
    double envelopeCost$=3.25;
    double taxPercent=0.06;
    
//total cost of socks
    double totalSockCost$;

//total cost of drinking glasses 
    double totalGlassesCost$;

//total cost of envelopes
    double totalEnvelopeCost$;
    
//tax on socks
    double sockTax$;
    
//tax on drinking glasses 
    double glassesTax$;
    
//tax on envelopes 
    double envelopeTax$;
    
//total taxes payed
//change double tax to integer tax to have 2 decimal places on the print out
    double totalRawTax$;
    int totalTax1$;
    double totalTax$;
    
//price before taxes
    double totalPrice$;
    
//total transaction cost 
    double totalofPurchase$;
    
//dollar sign for printed output
char var1 = '$';
    
//calculations
    //item totals
    totalSockCost$ = nSocks * sockCost$;
    totalGlassesCost$ = nGlasses * glassCost$;
    totalEnvelopeCost$ = nEnvelope * envelopeCost$;
    
    //cost before taxes
    totalPrice$ = totalSockCost$ + totalGlassesCost$ + totalEnvelopeCost$;
    
    //item taxes
    sockTax$ = totalSockCost$ * taxPercent;
    glassesTax$ = totalGlassesCost$ * taxPercent;
    envelopeTax$ = totalEnvelopeCost$ * taxPercent;
    
    //Total Tax
    totalRawTax$ = (sockTax$ + glassesTax$ + envelopeTax$) * 100;
    totalTax1$ = (int)totalRawTax$;
    totalTax$ = ((double)totalTax1$) / 100;
    

    //Total payment
    totalofPurchase$ = totalPrice$ + totalTax$;
    
//print the cost statements
    System.out.println("Number of socks:" + " " + nSocks);
    System.out.println("Price per sock:" + " " + sockCost$ + "" + var1);
    System.out.println("Total cost of socks:" + " " + totalSockCost$ + "" + var1);
    System.out.println("Number of drinking glasses:" + " " + nGlasses);
    System.out.println("Price per drinking glass:" + " " + glassCost$ + "" + var1);
    System.out.println("Total cost of drinking glasses:" + " " + totalGlassesCost$ + "" + var1);
    System.out.println("Number of envelopes:" + " " + nEnvelope );
    System.out.println("Price per envolope:" + " " + envelopeCost$ + "" + var1);
    System.out.println("Total cost of envelopes" + " " + totalEnvelopeCost$ + "" + var1);
    System.out.println("Total before taxes:" + " " + totalPrice$ + "" + var1);
    System.out.println("Total sales tax:" + " " + totalTax$ + "" + var1);
    System.out.println("Total cost of purchase" + " " + totalofPurchase$ + "" + var1);
    System.out.println("Thank you for shopping at Wal-Mart, Have a nice day");
    }
}