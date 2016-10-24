package models;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//Question: Would it make more sense to have the deck be a que, that way you can pop off the top card?
public class Deck {
private Card[] deck;
private int deckPosition = -1; //Question: is this okay? In relation to the getNextCard() method, is it okay that i have  
							  //set this to -1 and have "deckPosition++" preface all instances of it being used?
private Card endOfDeck = new Card("end of Deck","end of Deck","end of Deck", 0);

////////////////////////Constructor Methods////////////
public Deck(Card[] tempDeckArray){
	deck = tempDeckArray.clone();
}//Ends Constructor method 

///////////////////////Getter Methods//////////////////
/*
 * This method returners the entire deck
 */
public Card[] getDeck(){
	return deck;
}//Ends getDeck()
/*
 * this method returns the card in the deck at the specified index
 */
public Card getCard(int index) {
	return deck[index];
}//end of getCard()
/*
 * this method returns the card at the logical top of the deck 
 */
public Card getNextCard(){
	if(deckPosition>81)
		deckPosition++;	
	else
		return endOfDeck;
		
	return deck[deckPosition];
	
}//Ends getNextCard()
/*
 * This method returns the next three cards. This matches rules of the game therefore necessary 
 */
public Card[] getNextThreeCards(){
	Card[] threeCards = new Card[3];
	for(int x = 0; x<3;x++){
		if(deckPosition>81){
			deckPosition++;	
			threeCards[x]= deck[deckPosition];
		}
		else
			threeCards[x] = endOfDeck;	
	}//ends for loop
	return threeCards;
}//end getNextThreeCards()

///////////////////////Void Methods////////////////////
/*
 * This method shuffles the deck
 */
public void shuffle(){
	List<Card> toShuffle = Arrays.asList(deck);
	Collections.shuffle(toShuffle);
	deck = (Card[]) toShuffle.toArray();
}//end of shuffle()
}
