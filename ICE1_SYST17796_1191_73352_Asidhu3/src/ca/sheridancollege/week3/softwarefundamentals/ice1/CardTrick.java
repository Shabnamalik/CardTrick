/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author 
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for(int i=0; i<magicHand.length; i++){
            Card c = new Card();
            c.setValue((int)(Math.random()*7+1));
            c.setSuit(Card.SUITS[(int)(Math.random()*3+1)]);
            magicHand[i]=c;
            
            }
        Card useru = new Card();
        int suit = 0;
        Scanner Cardu = new Scanner(System.in);
        boolean upublic;
        
        
        
        do{
            System.out.print("Please enter the suit value="+Cardu);
            suit = Cardu.nextInt();
            Cardu.nextLine();
            switch(suit){
                case 1 :
                    useru.setSuit("Hearts");
                    break;
                case 2 :
                    useru.setSuit("Spade");
                    break;
                case 3 :
                    useru.setSuit("Diamond");
                    break;
                case 4 :
                    useru.setSuit("Club");
                    break;  
            }
        }while(suit<1||suit>4);
        boolean result = false;
            for (Card magicHand1 : magicHand) {
                if (magicHand1.getValue() == useru.getValue()) {
                    result = true;
                } else {
                    result = false;
                }
            }
        if(result==true){
            System.out.println("Bravo! There is a match");
        }
        else
            System.out.println("Sorry! There is a no match");
        }  
  
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    
    
}