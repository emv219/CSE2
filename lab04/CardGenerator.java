//Evan Vail
//CSE2
/*This program will select a random "card" out of a deck of 52
it will take the random number and assign it a suit and name 
based on that number and display the suit and rank of the card*/
//compile the program "CardGenerator.java"
//run the program "CardGenerator"

public class CardGenerator{
    public static void main(String[]args){
        
int cardNumber = (int)(Math.random() * 50 + 1);
String card =""; //define card 
//switch statement to assign a card number to any given card number
switch(cardNumber){
case 1: case 14: case 27: case 40: 
card = "One";
    break;
case 2: case 15: case 28: case 41:
card = "Two";
    break;
case 3: case 16: case 29: case 42:
card = "Three";
    break;
case 4: case 17: case 30: case 43:
card = "Four";
    break;
case 5: case 18: case 31: case 44:
card = "Five";
    break;
case 6: case 19: case 32: case 45:
card = "Six";
    break;
case 7: case 20: case 33: case 46:
card = "Seven";
    break;
case 8: case 21: case 34: case 47: 
card = "Eight";
    break;
case 9: case 22: case 35: case 48:
card = "Nine";
    break;
case 10: case 23: case 36: case 49:
card = "Ten";
    break;
case 11: case 24: case 37: case 50:
card = "Jack";
    break;
case 12: case 25: case 38: case 51:
card = "Queen";
    break;
case 13: case 26: case 39: case 52:
card = "King";
    break;
} //end of switch
//assign a suit to each possible card and print out the result
if (1 <= cardNumber && cardNumber <= 13){
    System.out.println(card + " of Clubs");
}
else if (14<=cardNumber && cardNumber <= 26){
    System.out.println(card + " of Diamonds");
}
else if (27<=cardNumber && cardNumber <=39){
    System.out.println(card + " of Hearts");
}
else if (40<=cardNumber && cardNumber <=52){
    System.out.println(card + " of Spades");
} //end of if statements
} //end of main method
} //end of class