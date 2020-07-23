//Joanne Wang

package wangJ;
import java.util.Scanner;
public class PigPlayer {
	Scanner scan=new Scanner(System.in);

	//ints and booleans
	private int playerscore, playertotal, compscore, comptotal;
	boolean yourturn= true;
	PairOfDice dice = new PairOfDice();
	boolean gameover=false;
	//creates the PigPlayer
	public PigPlayer()
	{
		playerscore=0;
		playertotal=0;
		compscore=0;
		comptotal=0;
	}
	// creates the rules for the player and computer scores and totals
	public void play(PairOfDice dice)
	{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		PigPlayer p1 = new PigPlayer();
		PigPlayer cpu = new PigPlayer();
		yourturn=true;
		char again='y';
		char compagain= 'p';
		//plays the game for the user
		System.out.println("The player total is " + playertotal);
		while(again=='y')
		{
			dice.roll();
			System.out.print("You rolled a ");	
			System.out.println(dice.getdie1() +" and a " + dice.getdie2());
			System.out.println("The total is " +dice.getTotal());
			if(dice.getTotal()==2)
			{
				playertotal=0;
				playerscore=0;
				again='a';
				yourturn=false;
				System.out.println("Snake Eyes!");
			}
			else if (dice.oneIsPresent())
			{
				System.out.println("However, there is a one");
				playerscore=0;
				again='n';
				yourturn=false;
			}
			else
			{
				playerscore=playerscore+dice.getTotal();
				System.out.print("Would you like to roll again? (y=yes and n=no): ");
				again=scan.nextLine().toLowerCase().charAt(0);
				if (again=='n')
				{
					yourturn=false;
				}
			}
		}
		playertotal=playerscore+playertotal;
		System.out.println(playerscore +" = player score");
		System.out.println(playertotal +" = player total");
		playerscore=0;

		//plays the game for the computer
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		if (yourturn==false)
		{
			System.out.println("The computer total is " + comptotal);
			while(compscore<20&&compagain=='p')
			{
				dice.roll();
				System.out.println("The computer rolled an " +dice.getdie1() +" and a " + dice.getdie2());
				System.out.println("The total is " +dice.getTotal());
				if(dice.getTotal()==2){
					comptotal=0;
					compscore=0;
					System.out.println("Snake Eyes!");
					yourturn=true;
					compagain='q';
				}
				else if (dice.oneIsPresent()){
					compscore=0;
					yourturn=true;
					System.out.println("However, there is a one");
					compagain='q';


				}
				else{
					compscore=compscore+dice.getTotal();
				}
			}
			comptotal=compscore+comptotal;
			System.out.println(compscore +" = computer score");
			System.out.println(comptotal +" = computer total");
			compscore=0;
			yourturn=true;
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
	}
	// signifies the end of the game
	public boolean gameover()
	{
		if (gameover=true)
		{ 
			System.out.println("The game is over");
		}
		return true;
	}
	//how to tell when the game is over
	public boolean done()
	{
		if (playertotal>=100|| comptotal>=100)
			gameover=true;
		else
			gameover=false;
		return gameover;
	}
}