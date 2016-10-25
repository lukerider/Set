package models;
/*
 * Class Precondition, The cardSet array should only ever contain three cards.
 */
public class Match {
private boolean isMatch;
private Card[] cardSet;
////////////////////////Constructor Methods////////////
public Match (Card[] tempCardArray){
	cardSet = tempCardArray.clone();

}
////////////////////////Public Methods/////////////////
/*
 * precondition: there are only 3 cards in the cardSet array.
 */
public boolean isAMatch(){
	if(compairFill() && compairColor() && compairShape() && compairNumber()){
		isMatch = true;
	}
	else{
		isMatch = false;
	}
	return isMatch;
}//End isAMatch
public void newCards(Card[] newCardSet){
	cardSet = newCardSet.clone();
}
////////////////////////Private Methods////////////////
/*
 * precondition: there are only 3 cards in the cardSet array.
 * this method compares the Fill attribute among 3 Cards
 */
private boolean compairFill(){
	boolean result;
	if(cardSet[0].getFill().equals(cardSet[1].getFill()) && cardSet[1].getFill().equals(cardSet[2].getFill())){
		result = true;
	}
	else if(!cardSet[0].getFill().equals(cardSet[1].getFill()) && !cardSet[1].getFill().equals(cardSet[2].getFill()) &&
			!cardSet[0].getFill().equals(cardSet[2].getFill())){
		result = true;
	}
	else{
		result = false;
	}
	return result;
}//end CompairFill()

/*
 * precondition: there are only 3 cards in the cardSet array.
 * this method compares the Color attribute among 3 Cards
 */
private boolean compairColor(){
	boolean result;
	if(cardSet[0].getColor().equals(cardSet[1].getColor()) && cardSet[1].getColor().equals(cardSet[2].getColor())){
		result = true;
	}
	else if(!cardSet[0].getColor().equals(cardSet[1].getColor()) && !cardSet[1].getColor().equals(cardSet[2].getColor()) &&
			!cardSet[0].getColor().equals(cardSet[2].getColor())){
		result = true;
	}
	else{
		result = false;
	}
	return result;
	
}//end compairColor()

/*
 * precondition: there are only 3 cards in the cardSet array.
 * this method compares the Shape attribute among 3 Cards
 */
private boolean compairShape(){
	boolean result;
	if(cardSet[0].getShape().equals(cardSet[1].getColor()) && cardSet[1].getShape().equals(cardSet[2].getShape())){
		result = true;
	}
	else if(!cardSet[0].getShape().equals(cardSet[1].getShape()) && !cardSet[1].getShape().equals(cardSet[2].getShape()) &&
			!cardSet[0].getShape().equals(cardSet[2].getShape())){
		result = true;
	}
	else{
		result = false;
	}
	return result;
	
}//end compairShape()

/*
 * precondition: there are only 3 cards in the cardSet array.
 * this method compares the Number attribute among 3 Cards
 */
private boolean compairNumber(){
	boolean result;
	if(cardSet[1].getNumber() == cardSet[0].getNumber() && cardSet[0].getNumber() ==cardSet[2].getNumber()){
		result = true;
	}
	else if(cardSet[0].getNumber() != cardSet[1].getNumber() && cardSet[1].getNumber() != cardSet[2].getNumber() &&
			cardSet[0].getNumber() != cardSet[2].getNumber()){
		result = true;
	}
	else {
		result = false;
	}
	return result;
}//end compare Number
}
