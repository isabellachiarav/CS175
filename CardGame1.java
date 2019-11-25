import java.util.Arrays;
import java.util.Random;

public class CardGame1 {

	public static void main(String[] args) {

		Random generator = new Random();

		int countH = 0, countD = 0, countC = 0, countS = 0, countDraw = 0;
		String mySuit = null;
		String yourSuit = null;
		int[] myHand = new int[5];
		int[] yourHand = new int[5];
		boolean winner = false;

		//assigns card values to both hands and determines suit
		for (int i = 0; i < myHand.length; i++) {
			myHand[i] = generator.nextInt(52) + 1;
			if (myHand[i] >= 1 && myHand[i] <= 13) {
				countH++;
			}
			else if (myHand[i] >= 14 && myHand[i] <= 26) {
				countD++;
			}
			else if (myHand[i] >= 27 && myHand[i] <= 39) {
				countC++;
			}
			else if (myHand[i] >= 40 && myHand[i] <= 52) {
				countS++;
			}
			if (countH >= countD && countH >= countC && countH >= countS) {
				mySuit = "Hearts";
			}
			else if (countD >= countH && countD >= countC && countD >= countS) {
				mySuit = "Diamonds";
			}
			else if (countC >= countH && countC >= countD && countC >= countS) {
				mySuit = "Clubs";
			}
			else if (countS >= countH && countS >= countC && countS >= countD) {
				mySuit = "Spades";
			}
		}
		for (int i = 0; i < yourHand.length; i++) {
			yourHand[i] = generator.nextInt(52) + 1;
			if (yourHand[i] >= 1 && yourHand[i] <= 13) {
				countH++;
			}
			else if (yourHand[i] >= 14 && yourHand[i] <= 26) {
				countD++;
			}
			else if (yourHand[i] >= 27 && yourHand[i] <= 39) {
				countC++;
			}
			else if (yourHand[i] >= 40 && yourHand[i] <= 52) {
				countS++;
			}
			if (countH >= countD && countH >= countC && countH >= countS) {
				yourSuit = "Hearts";
			}
			else if (countD >= countH && countD >= countC && countD >= countS) {
				yourSuit = "Diamonds";
			}
			else if (countC >= countH && countC >= countD && countC >= countS) {
				yourSuit = "Clubs";
			}
			else if (countS >= countH && countS >= countC && countS >= countD) {
				yourSuit = "Spades";
			}
		}
		System.out.println("My hand has five cards: " + Arrays.toString(myHand));
		System.out.println("Your hand has five cards: " + Arrays.toString(yourHand));
		System.out.println("My suit is " + mySuit + ".");
		System.out.println("Your suit is " + yourSuit + ".");

		//repeats card draw until winner
		while (!winner) {
			if (myHand[0] == myHand[1] && myHand[1] == myHand[2] && myHand[2] == myHand[3] && myHand[3] == myHand[4]) {
				winner = true;
				System.out.println("I am the winner.");
			}
			if (yourHand[0] == yourHand[1] && yourHand[1] == yourHand[2] && yourHand[2] == yourHand[3] && yourHand[3] == yourHand[4]) {
				winner = true;
				System.out.println("You are the winner.");
			}
			for (int i = 0; i < myHand.length; i++) {
				if (mySuit.equals("Hearts")) {
					if (myHand[i] > 13) {
						myHand[i] = generator.nextInt(52) + 1;
					}
				}
				else if (mySuit.equals("Diamonds")) {
					if (myHand[i] < 14 && myHand[i] > 26) {
						myHand[i] = generator.nextInt(52) + 1;
					}
				}
				else if (mySuit.equals("Clubs")) {
					if (myHand[i] < 27 && myHand[i] > 39) {
						myHand[i] = generator.nextInt(52) + 1;
					}
				}
				else if (mySuit.equals("Spades")) {
					if (myHand[i] < 40) {
						myHand[i] = generator.nextInt(52) + 1;
					}
				}
				countDraw++;
				System.out.println("Draw " + countDraw + ": Your new hand is " + Arrays.toString(myHand));
				if (yourSuit.equals("Hearts")) {
					if (yourHand[i] > 13) {
						yourHand[i] = generator.nextInt(52) + 1;
					}
				}
				else if (yourSuit.equals("Diamonds")) {
					if (yourHand[i] < 14 && yourHand[i] > 26) {
						yourHand[i] = generator.nextInt(52) + 1;
					}
				}
				else if (yourSuit.equals("Clubs")) {
					if (yourHand[i] < 27 && yourHand[i] > 39) {
						yourHand[i] = generator.nextInt(52) + 1;
					}
				}
				else if (yourSuit.equals("Spades")) {
					if (yourHand[i] < 40) {
						yourHand[i] = generator.nextInt(52) + 1;
					}
				}
				System.out.println("Draw " + countDraw + ": Your new hand is " + Arrays.toString(yourHand));
			}
		}


		System.out.println("The game is over.");




	}

}