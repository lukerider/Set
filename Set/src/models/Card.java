package models;

public class Card {
private String Color, Fill, Shape;
private int Number;
////////////////////////Constructor Methods////////////
public Card(String tempColor,String tempFill,String tempShape, int tempNumber){
	Color = tempColor;
	Fill = tempFill;
	Shape = tempShape;
	Number = tempNumber;
}//Ends Constructor 
///////////////////////Getter Methods//////////////////
public String getColor(){
	return Color;
}//Ends getColor()
public String getFill(){
	return Fill;
}//Ends getFill()
public String getShape(){
	return Shape;
}//Ends getShape()
public int getNumber(){
	return Number;
}//Ends getNumber()
/*
 * Did not create "Setter Methods" because once cards are created its properties should not be changed. 
 */
}
