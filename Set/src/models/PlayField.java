package models;

import java.util.ArrayList;

public class PlayField {
Card[] playingField;
ArrayList <Card[]> history = new ArrayList<Card[]>();
////////////////////////Constructor Methods////////////
public PlayField(Card[] tempPlayingField){
	playingField = tempPlayingField.clone();
}//end Constructor
public PlayField(){
	
}//Blank Cunstrouctor
////////////////////////Public Methods/////////////////
public void newField(Card[] tempPlayingField){
	history.add(playingField);
	playingField = tempPlayingField.clone();
}//ends newField
public Card[] getField(){
	return playingField;
}//ends getField
public ArrayList <Card[]> getHistory(){
	return history;
}
/*
 * Precondition: while this method is coded such that it is dynamic. This method should only be passed an array 
 * 					that is 4 rows and 3 columns.
 * Precondition: Board is assumed to not have any matches (or negative) until proven otherwise
 */
public boolean analyzeField(){
	boolean result = false; 
	Match tempMatch;
	try{
		for(int x = 0; x< playingField.length -3 ;x++){
			for(int y = x+1; y< playingField.length -2;y++){
				for(int z = y+1;y <playingField.length -1; z++){
					Card [] set = {playingField[x], playingField[y], playingField[z]};
					tempMatch = new Match(set);
					result = tempMatch.isAMatch();
				}//3rd Card = z
			}//2nd Card = y
		}//1st card  = x 
		return result;
	}//End Try
	catch(NullPointerException np){
		System.err.println("No Playing Field");
		return false;
	}//End NullPointerCatch
	catch(Exception e){
		System.err.println("Other Error");
		System.err.println(e.getMessage()+ "\n"+ e.getStackTrace());
		return false;
	}//End of GenCatchStatement
}//Ends analyzeField()
public ArrayList <Card[]> getMatches() { 
	ArrayList <Card[]> matchList = new ArrayList<Card[]>();
	Match tempMatch;
	try{
		for(int x = 0; x< playingField.length -3 ;x++){
			for(int y = x+1; y< playingField.length -2;y++){
				for(int z = y+1;y <playingField.length -1; z++){
					Card [] set = {playingField[x], playingField[y], playingField[z]};
					tempMatch = new Match(set);
					if(tempMatch.isAMatch()){
						matchList.add(set);
					}//Ends If
				}//3rd Card = z
			}//2nd Card = y
		}//1st card  = x 
		return matchList;
	}//End Try
	catch(NullPointerException np){
		System.err.println("No Playing Field");
		return null;
	}//End NullPointerCatch
	catch(Exception e){
		System.err.println("Other Error");
		System.err.println(e.getMessage()+ "\n"+ e.getStackTrace());
		return null;
	}//End of GenCatchStatement
}//End getMatches()

}//End Class
