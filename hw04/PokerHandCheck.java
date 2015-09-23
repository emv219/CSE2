//Evan Vail
//CSE2
/*this program will simulate a 5 card draw hand and 
give a simplay analysis on the type of hand that you have */
public class PokerHandCheck{
    public static void main(String[]args){
        
int cardNumber1 = (int)(Math.random() * 50 + 1);
int cardNumber2 = (int)(Math.random() * 50 + 1);
int cardNumber3 = (int)(Math.random() * 50 + 1);
int cardNumber4 = (int)(Math.random() * 50 + 1);
int cardNumber5 = (int)(Math.random() * 50 + 1);
String card =""; //define card 
//switch statement to assign a card number to any given card number
switch(cardNumber1){
case 1: case 14: case 27: case 40: 
card = "The one";
    break;
case 2: case 15: case 28: case 41:
card = "The Two";
    break;
case 3: case 16: case 29: case 42:
card = "The three";
    break;
case 4: case 17: case 30: case 43:
card = "The four";
    break;
case 5: case 18: case 31: case 44:
card = "The five";
    break;
case 6: case 19: case 32: case 45:
card = "The six";
    break;
case 7: case 20: case 33: case 46:
card = "The seven";
    break;
case 8: case 21: case 34: case 47: 
card = "The eight";
    break;
case 9: case 22: case 35: case 48:
card = "The nine";
    break;
case 10: case 23: case 36: case 49:
card = "The ten";
    break;
case 11: case 24: case 37: case 50:
card = "The jack";
    break;
case 12: case 25: case 38: case 51:
card = "The queen";
    break;
case 13: case 26: case 39: case 52:
card = "The king";
    break;
} //end of switch

if (1 <= cardNumber1 && cardNumber1 <= 13){
    System.out.println(card + " of Clubs");
}
else if (14<=cardNumber1 && cardNumber1 <= 26){
    System.out.println(card + " of Diamonds");
}
else if (27<=cardNumber1 && cardNumber1 <=39){
    System.out.println(card + " of Hearts");
}
else if (40<=cardNumber1 && cardNumber1 <=52){
    System.out.println(card + " of Spades");
} //end of if statements



//switch statement to assign a card number to any given card number
switch(cardNumber2){
case 1: case 14: case 27: case 40: 
card = "The one";
    break;
case 2: case 15: case 28: case 41:
card = "The Two";
    break;
case 3: case 16: case 29: case 42:
card = "The three";
    break;
case 4: case 17: case 30: case 43:
card = "The four";
    break;
case 5: case 18: case 31: case 44:
card = "The five";
    break;
case 6: case 19: case 32: case 45:
card = "The six";
    break;
case 7: case 20: case 33: case 46:
card = "The seven";
    break;
case 8: case 21: case 34: case 47: 
card = "The eight";
    break;
case 9: case 22: case 35: case 48:
card = "The nine";
    break;
case 10: case 23: case 36: case 49:
card = "The ten";
    break;
case 11: case 24: case 37: case 50:
card = "The jack";
    break;
case 12: case 25: case 38: case 51:
card = "The queen";
    break;
case 13: case 26: case 39: case 52:
card = "The king";
    break;
} //end of switch

if (1 <= cardNumber2 && cardNumber2 <= 13){
    System.out.println(card + " of Clubs");
}
else if (14<=cardNumber2 && cardNumber2 <= 26){
    System.out.println(card + " of Diamonds");
}
else if (27<=cardNumber2 && cardNumber2 <=39){
    System.out.println(card + " of Hearts");
}
else if (40<=cardNumber2 && cardNumber2 <=52){
    System.out.println(card + " of Spades");
} //end of if statements


//switch statement to assign a card number to any given card number
switch(cardNumber3){
case 1: case 14: case 27: case 40: 
card = "The one";
    break;
case 2: case 15: case 28: case 41:
card = "The Two";
    break;
case 3: case 16: case 29: case 42:
card = "The three";
    break;
case 4: case 17: case 30: case 43:
card = "The four";
    break;
case 5: case 18: case 31: case 44:
card = "The five";
    break;
case 6: case 19: case 32: case 45:
card = "The six";
    break;
case 7: case 20: case 33: case 46:
card = "The seven";
    break;
case 8: case 21: case 34: case 47: 
card = "The eight";
    break;
case 9: case 22: case 35: case 48:
card = "The nine";
    break;
case 10: case 23: case 36: case 49:
card = "The ten";
    break;
case 11: case 24: case 37: case 50:
card = "The jack";
    break;
case 12: case 25: case 38: case 51:
card = "The queen";
    break;
case 13: case 26: case 39: case 52:
card = "The king";
    break;
} //end of switch

if (1 <= cardNumber3 && cardNumber3 <= 13){
    System.out.println(card + " of Clubs");
}
else if (14<=cardNumber3 && cardNumber3 <= 26){
    System.out.println(card + " of Diamonds");
}
else if (27<=cardNumber3 && cardNumber3 <=39){
    System.out.println(card + " of Hearts");
}
else if (40<=cardNumber3 && cardNumber3 <=52){
    System.out.println(card + " of Spades");
} //end of if statements


//switch statement to assign a card number to any given card number
switch(cardNumber4){
case 1: case 14: case 27: case 40: 
card = "The one";
    break;
case 2: case 15: case 28: case 41:
card = "The Two";
    break;
case 3: case 16: case 29: case 42:
card = "The three";
    break;
case 4: case 17: case 30: case 43:
card = "The four";
    break;
case 5: case 18: case 31: case 44:
card = "The five";
    break;
case 6: case 19: case 32: case 45:
card = "The six";
    break;
case 7: case 20: case 33: case 46:
card = "The seven";
    break;
case 8: case 21: case 34: case 47: 
card = "The eight";
    break;
case 9: case 22: case 35: case 48:
card = "The nine";
    break;
case 10: case 23: case 36: case 49:
card = "The ten";
    break;
case 11: case 24: case 37: case 50:
card = "The jack";
    break;
case 12: case 25: case 38: case 51:
card = "The queen";
    break;
case 13: case 26: case 39: case 52:
card = "The king";
    break;
} //end of switch

if (1 <= cardNumber4 && cardNumber4 <= 13){
    System.out.println(card + " of Clubs");
}
else if (14<=cardNumber4 && cardNumber4 <= 26){
    System.out.println(card + " of Diamonds");
}
else if (27<=cardNumber4 && cardNumber4 <=39){
    System.out.println(card + " of Hearts");
}
else if (40<=cardNumber4 && cardNumber4 <=52){
    System.out.println(card + " of Spades");
} //end of if statements


//switch statement to assign a card number to any given card number
switch(cardNumber5){
case 1: case 14: case 27: case 40: 
card = "The one";
    break;
case 2: case 15: case 28: case 41:
card = "The Two";
    break;
case 3: case 16: case 29: case 42:
card = "The three";
    break;
case 4: case 17: case 30: case 43:
card = "The four";
    break;
case 5: case 18: case 31: case 44:
card = "The five";
    break;
case 6: case 19: case 32: case 45:
card = "The six";
    break;
case 7: case 20: case 33: case 46:
card = "The seven";
    break;
case 8: case 21: case 34: case 47: 
card = "The eight";
    break;
case 9: case 22: case 35: case 48:
card = "The nine";
    break;
case 10: case 23: case 36: case 49:
card = "The ten";
    break;
case 11: case 24: case 37: case 50:
card = "The jack";
    break;
case 12: case 25: case 38: case 51:
card = "The queen";
    break;
case 13: case 26: case 39: case 52:
card = "The king";
    break;
} //end of switch

if (1 <= cardNumber5 && cardNumber5 <= 13){
    System.out.println(card + " of Clubs");
}
else if (14<=cardNumber5 && cardNumber5 <= 26){
    System.out.println(card + " of Diamonds");
}
else if (27<=cardNumber5 && cardNumber5 <=39){
    System.out.println(card + " of Hearts");
}
else if (40<=cardNumber5 && cardNumber5 <=52){
    System.out.println(card + " of Spades");
} //end of if statements

boolean cardbool1 = ((1==14)&(1==27)&(1==40)&(14==27)&(14==40)&(27==40));
boolean cardbool2 = ((2==15)&&(2==28)&(2==41)&(15==28)&(15==41)&(28==41));//realizing i dont need all the parenthesis
boolean cardbool3 = (3==16&3==29&3==42&16==29&16==42&29==41);
boolean cardbool4 = (4==17&4==30&4==43&17==30&17==43&30==43);
boolean cardbool5 = (5==18&5==31&5==44&18==31&18==44&31==44);
boolean cardbool6 = (6==19&6==32&6==45&19==32&19==45&32==45);
boolean cardbool7 = (7==20&7==33&7==46&20==33&20==46&33==46);
boolean cardbool8 = (8==21&8==34&8==47&21==34&21==47&34==47);
boolean cardbool9 = (9==22&9==35&9==48&22==35&22==48&35==48);
boolean cardbool10 = (10==23&10==36&10==49&23==36&23==49&36==49);
boolean cardbool11 = (11==24&11==37&11==50&24==37&24==50&37==50);
boolean cardbool12 = (12==25&12==38&12==51&25==38&25==51&38==51);
boolean cardbool13 = (13==26&13==39&13==52&26==39&26==52&39==52);

boolean cardNumBool1 = (cardNumber1);


if ((cardNumber1 = cardNumber2) || (cardNumber1 = cardNumber3) || (cardNumber1 = cardNumber4) ||(cardNumber1 = cardNumber5) ||
(cardNumber2 = cardNumber3) || (cardNumber2 = cardNumber4) || (cardNumber2 = cardNumber5) || (cardNumber3 = cardNumber4) ||
(cardNumber4 = cardNumber5)){
System.out.println("You have two pair");
}
else if ((cardNumber1 = cardNumber2 = cardNumber3) || (cardNumber1 = cardNumber2 = cardNumber4) || (cardNumber1 = cardNumber2 = cardNumber5) ||
(cardNumber1 = cardNumber3 = cardNumber4) || (cardNumber1 = cardNumber3 = cardNumber5) || (cardNumber1 = cardNumber1 = cardNumber4 = cardNumber5)){
System.out.println("You have three pair");
}
else{
System.out.println("You have a high card hand");
}
} //end of main method
} //end of class