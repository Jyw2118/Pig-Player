//Joanne Wang

package wangJ;

public class PairOfDice {

	private Die die1,die2;
	private int value1, value2,total;
	// creates two die classes defaulted to a face value of 1
	public PairOfDice(){
		die1= new Die();
		die2= new Die();
	}
	// calls upon the roll method in the die class to set two random values
	//corresponding to the number of sides of the dice
	public int roll(){
		value1 = die1.roll();
		value2 = die2.roll();
		total= value1+value2;
		return total;
	}
	//prints the total sum of the two die values
	public int getTotal(){
		return total;
	}
	// prints the face value of die 1
	public int getdie1(){
		return value1;
	}
	//prints the face value of die 2
	public int getdie2(){
		return value2;
	}
	public boolean oneIsPresent()
	{
		if(die1.getFaceValue()==1||die2.getFaceValue()==1)
			return true;
		else
			return false;
	}
}