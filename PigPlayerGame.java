//Joanne Wang

package wangJ;

import java.util.Scanner;

public class PigPlayerGame {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		PairOfDicee dice = new PairOfDicee();
		System.out.print("Please enter player one's name: ");
		String s = kb.nextLine();
		System.out.println("  ");
		System.out.print("Please enter player two's name: ");
		String s1 = kb.nextLine();
		Pigplayer1 p1 = new Pigplayer1(s);
		Pigplayer1 p2 = new Pigplayer1(s1);
		while (p1.done() == false && p2.done() == false){
			p1.play(dice);
			if (p1.done() == false)
				p2.play(dice);
		}
		if (p1.done() == true)
			System.out.println("\n" + s + " has won player");
		else
			System.out.println("\n" + s1 + " has won pig player!");
	}

}