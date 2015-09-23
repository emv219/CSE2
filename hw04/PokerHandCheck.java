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

boolean cardbool1q = cardNumber2==1||cardNumber1==14||cardNumber1==27||cardNumber1==40;
boolean cardbool1w = cardNumber1==2||cardNumber1==15||cardNumber1==28||cardNumber1==41;
boolean cardbool1e = cardNumber1==3||cardNumber1==16||cardNumber1==29||cardNumber1==42;
boolean cardbool1r = cardNumber1==4||cardNumber1==17||cardNumber1==30||cardNumber1==43;
boolean cardbool1t = cardNumber1==5||cardNumber1==18||cardNumber1==31||cardNumber1==44;
boolean cardbool1y = cardNumber1==6||cardNumber1==19||cardNumber1==32||cardNumber1==45;
boolean cardbool1u = cardNumber1==7||cardNumber1==20||cardNumber1==33||cardNumber1==46;
boolean cardbool1i = cardNumber1==8||cardNumber1==21||cardNumber1==34||cardNumber1==47;
boolean cardbool1o = cardNumber1==9||cardNumber1==22||cardNumber1==35||cardNumber1==48;
boolean cardbool1p = cardNumber1==10||cardNumber1==23||cardNumber1==36||cardNumber1==49;
boolean cardbool1a = cardNumber1==11||cardNumber1==24||cardNumber1==37||cardNumber1==50;
boolean cardbool1s = cardNumber1==12||cardNumber1==25||cardNumber1==38||cardNumber1==51;
boolean cardbool1d = cardNumber1==13||cardNumber1==26||cardNumber1==39||cardNumber1==52;

boolean cardbool2q = cardNumber2==1||cardNumber2==14||cardNumber2==27||cardNumber2==40;
boolean cardbool2w = cardNumber2==2||cardNumber2==15||cardNumber2==28||cardNumber2==41;
boolean cardbool2e = cardNumber2==3||cardNumber2==16||cardNumber2==29||cardNumber2==42;
boolean cardbool2r = cardNumber2==4||cardNumber2==17||cardNumber2==30||cardNumber2==43;
boolean cardbool2t = cardNumber2==5||cardNumber2==18||cardNumber2==31||cardNumber2==44;
boolean cardbool2y = cardNumber2==6||cardNumber2==19||cardNumber2==32||cardNumber2==45;
boolean cardbool2o = cardNumber2==7||cardNumber2==20||cardNumber2==33||cardNumber2==46;
boolean cardbool2u = cardNumber2==8||cardNumber2==21||cardNumber2==34||cardNumber2==47;
boolean cardbool2i = cardNumber2==9||cardNumber2==22||cardNumber2==35||cardNumber2==48;
boolean cardbool2p = cardNumber2==10||cardNumber2==23||cardNumber2==36||cardNumber2==49;
boolean cardbool2a = cardNumber2==11||cardNumber2==24||cardNumber2==37||cardNumber2==50;
boolean cardbool2s = cardNumber2==12||cardNumber2==25||cardNumber2==38||cardNumber2==51;
boolean cardbool2d = cardNumber2==13||cardNumber2==26||cardNumber2==39||cardNumber2==52;

boolean cardbool3a = cardNumber3==1||cardNumber3==14||cardNumber3==27||cardNumber3==40;
boolean cardbool3w= cardNumber3==2||cardNumber3==15||cardNumber3==28||cardNumber3==41;
boolean cardbool3e = cardNumber3==3||cardNumber3==16||cardNumber3==29||cardNumber3==42;
boolean cardbool3r = cardNumber3==4||cardNumber3==17||cardNumber3==30||cardNumber3==43;
boolean cardbool3t = cardNumber3==5||cardNumber3==18||cardNumber3==31||cardNumber3==44;
boolean cardbool3y = cardNumber3==6||cardNumber3==19||cardNumber3==32||cardNumber3==45;
boolean cardbool3z = cardNumber3==7||cardNumber3==20||cardNumber3==33||cardNumber3==46;
boolean cardbool3x = cardNumber3==8||cardNumber3==21||cardNumber3==34||cardNumber3==47;
boolean cardbool3c = cardNumber3==9||cardNumber3==22||cardNumber3==35||cardNumber3==48;
boolean cardbool3v = cardNumber3==10||cardNumber3==23||cardNumber3==36||cardNumber3==49;
boolean cardbool3b = cardNumber3==11||cardNumber3==24||cardNumber3==37||cardNumber3==50;
boolean cardbool3n = cardNumber3==12||cardNumber3==25||cardNumber3==38||cardNumber3==51;
boolean cardbool3f = cardNumber3==13||cardNumber3==26||cardNumber3==39||cardNumber3==52;

boolean cardbool4z = cardNumber4==1||cardNumber4==14||cardNumber4==27||cardNumber4==40;
boolean cardbool4x = cardNumber4==2||cardNumber4==15||cardNumber4==28||cardNumber4==41;
boolean cardbool4c = cardNumber4==3||cardNumber4==16||cardNumber4==29||cardNumber4==42;
boolean cardbool4v = cardNumber4==4||cardNumber4==17||cardNumber4==30||cardNumber4==43;
boolean cardbool4b = cardNumber4==5||cardNumber4==18||cardNumber4==31||cardNumber4==44;
boolean cardbool4n = cardNumber4==6||cardNumber4==19||cardNumber4==32||cardNumber4==45;
boolean cardbool4m = cardNumber4==7||cardNumber4==20||cardNumber4==33||cardNumber4==46;
boolean cardbool4q = cardNumber4==8||cardNumber4==21||cardNumber4==34||cardNumber4==47;
boolean cardbool4w = cardNumber4==9||cardNumber4==22||cardNumber4==35||cardNumber4==48;
boolean cardbool4e = cardNumber4==10||cardNumber4==23||cardNumber4==36||cardNumber4==49;
boolean cardbool4r = cardNumber4==11||cardNumber4==24||cardNumber4==37||cardNumber4==50;
boolean cardbool4t = cardNumber4==12||cardNumber4==25||cardNumber4==38||cardNumber4==51;
boolean cardbool4g = cardNumber4==13||cardNumber4==26||cardNumber4==39||cardNumber4==52;

boolean cardbool5 = cardNumber5==1||cardNumber5==14||cardNumber5==27||cardNumber5==40;
boolean cardbool5a = cardNumber5==2||cardNumber5==15||cardNumber5==28||cardNumber5==41;
boolean cardbool5b = cardNumber5==3||cardNumber5==16||cardNumber5==29||cardNumber5==42;
boolean cardbool5c = cardNumber5==4||cardNumber5==17||cardNumber5==30||cardNumber5==43;
boolean cardbool5d = cardNumber5==5||cardNumber5==18||cardNumber5==31||cardNumber5==44;
boolean cardbool5e = cardNumber5==6||cardNumber5==19||cardNumber5==32||cardNumber5==45;
boolean cardbool5f = cardNumber5==7||cardNumber5==20||cardNumber5==33||cardNumber5==46;
boolean cardbool5g = cardNumber5==8||cardNumber5==21||cardNumber5==34||cardNumber5==47;
boolean cardbool5h = cardNumber5==9||cardNumber5==22||cardNumber5==35||cardNumber5==48;
boolean cardbool5j = cardNumber5==10||cardNumber5==23||cardNumber5==36||cardNumber5==49;
boolean cardbool5k= cardNumber5==11||cardNumber5==24||cardNumber5==37||cardNumber5==50;
boolean cardbool5l = cardNumber5==12||cardNumber5==25||cardNumber5==38||cardNumber5==51;
boolean cardbool5z = cardNumber5==13||cardNumber5==26||cardNumber5==39||cardNumber5==52;


if ((cardNumber1 == cardNumber2) || (cardNumber1 == cardNumber3) || (cardNumber1 == cardNumber4) ||(cardNumber1 == cardNumber5) ||
(cardNumber2 == cardNumber3) || (cardNumber2 == cardNumber4) || (cardNumber2 == cardNumber5) || (cardNumber3 == cardNumber4) ||
(cardNumber4 == cardNumber5)){
System.out.println("You have two pair");
}
else if ((cardNumber1 == cardNumber2&cardNumber1 == cardNumber3&cardNumber2==cardNumber3) ||
(cardNumber1 == cardNumber2&cardNumber1 == cardNumber4&cardNumber2==cardNumber4) || 
(cardNumber1 == cardNumber2&cardNumber1 == cardNumber5&cardNumber2==cardNumber5) ||
(cardNumber1 == cardNumber3&cardNumber1 == cardNumber4&cardNumber3==cardNumber4) ||
(cardNumber1 == cardNumber3&cardNumber1 == cardNumber5&cardNumber3==cardNumber5) || 
(cardNumber1 == cardNumber4&cardNumber1 == cardNumber5&cardNumber4==cardNumber5)){
System.out.println("You have three pair");
}
else{
System.out.println("You have a high card hand");
}
} //end of main method
} //end of class