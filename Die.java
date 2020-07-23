//Joanne Wang
//represents one die with faces showing values between 1 and the number of faces on the die
package wangJ;
import java.util.Random;
public class Die {
	private final int MIN_FACES = 4;
	private static Random generator = new Random ();
	//number of sides on the die
	private int numFaces;
	//current value showing on the die
	private int faceValue;
	//defaults to a six-sided die, initial face value is q
	public Die()
	{
		numFaces= 6;
		faceValue=1;
	}
	//explicitly sets the size of the die. defaults to a size of six if the parameter is invalid, initial face value is 1
	public Die(int faces)
	{
		if (faces<MIN_FACES)
			numFaces=6;
		else numFaces= faces;
		faceValue=1;
	}
	//rolls the die and returns the result
	public int roll()
	{
		faceValue= (int) (Math.random()*(numFaces)+1);
		return faceValue;
	}
	//returns the current die value
	public int getFaceValue()
	{
		return faceValue;
	}
}

