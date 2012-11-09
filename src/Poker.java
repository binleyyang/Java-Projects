import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Poker {
	
	public static void main (String[] args) {
		
		Scanner input =  new Scanner(System.in);
		String userInput = "";
		
		while (!userInput.equals("Q")) {
			System.out.println("Enter -t1 or -test1 to generate and then shuffle a deck\nEnter -t2 or -test2 to deal some hands\nEnter -t3 or -test3 to classify some hands\nEnter -t4 or -test4 to compare two hands\nEnter Q to quit: ");
			userInput = input.next();
			
			if (userInput.equals("-t1") || userInput.equals("-test1")) {
				
				//printing an unshuffled deck
				System.out.println("An unshuffled deck:\n ");
				String[] unshuffledDeck = deck();
				printer(unshuffledDeck);
				
				//shuffling a deck
				System.out.println("Now a shuffled deck:\n ");
				String[] shuffledDeck = shuffler(unshuffledDeck);
				printer(shuffledDeck);
			}
			
			if (userInput.equals("-t2") || userInput.equals("-test2")) {
							
				//printing an unshuffled deck
				System.out.println("An unshuffled deck:\n ");
				String[] unshuffledDeck = deck();
				printer(unshuffledDeck);
							
				//shuffling a deck
				System.out.println("Now a shuffled deck:\n ");
				String[] shuffledDeck = shuffler(unshuffledDeck);
				printer(shuffledDeck);
				
				//dealing two hands and printing the remainder of the deck
				String[][] dealDeck = dealer(shuffledDeck);
				System.out.println("Here are the two hands and the remainder of the deck: ");

				System.out.println("The first hand is:\n ");	
				printer(dealDeck[0]);
				System.out.println("The second hand is:\n ");
				printer(dealDeck[1]);
				System.out.println("The rest of the deck is:\n ");
				printer(dealDeck[2]);
			}
			
			if(userInput.equals("-t3") || userInput.equals("-test3")) 
				checker(); 
						
			if(userInput.equals("-t4") || userInput.equals("-test4")) {
				Scanner input2 = new Scanner(System.in);
				
				System.out.println("Please enter the first hand to be evaluated: ");
				String hand1 = input2.next();
				System.out.println("Please enter the second hand to be evaluated: ");
				String hand2 = input2.next();
				
				String eval1 = classify(hand1);
				String eval2 = classify(hand2);
				int score1 = calculate(eval1);
				int score2 = calculate(eval2);
				int score3 = determine(hand1);
				int score4 = determine(hand2);
				
				if (score1 > score2) 
					System.out.println("The first hand " + hand1 + " is a " + classify(hand1) + " and is stronger than the second hand " + hand2 + " which is a " + classify(hand2) + ".");
				else if (score1 < score2)
					System.out.println("The second hand " + hand2 + " is a " + classify(hand2) + " and is stronger than the first hand " + hand1 + " which is a " + classify(hand1) + ".");
				else {
					if (score3 > score4)
						System.out.println("The first hand " + hand1 + " is a " + classify(hand1) + " and is stronger than the second hand " + hand2 + " which is a " + classify(hand2) + ".");
					else if (score3 < score4)
						System.out.println("The second hand " + hand2 + " is a " + classify(hand2) + " and is stronger than the first hand " + hand1 + " which is a " + classify(hand1) + ".");
					else {
						System.out.println("The two hands are of equal strength, they are " + classify(hand1) + "s.");
					}
				}
			}
		}
	}
	
	// -t1 or -test1 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static String[] deck() { //method to generate a deck of 52 cards
		String[] suit = {"Clubs", "Hearts", "Diamonds", "Spades"};
		String[] value = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		
		String[][] deck = new String[suit.length][value.length];
		String[] fullDeck = new String[52];
		int cardCount = 0;
		for (int i = 0; i < suit.length; i++) {
			for (int j = 0; j < value.length; j++) {
				deck[i][j] = value[j] + " of " + suit[i];
				fullDeck[cardCount] = deck[i][j];
				cardCount++;
			}
		} return fullDeck;		
	}
	
	// -t2 or -test2 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static String[] shuffler (String[]a) { //method to shuffle a deck of cards
		Random generator = new Random();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				swapper(a, generator.nextInt(a.length-1), generator.nextInt(a.length-1));
			}
		} return a;
	}
	
	public static void swapper(String[] a, int b, int c){ //swapper method used in the shuffler method to shuffle a deck of cards
		String x = a[b];
		String y = a[c];
		a[b] = y;
		a[c] = x;
	}
	
	public static String[][] dealer(String[] a) { //method to deal two hands and print the remainder of the deck
		String[] hand1 = new String[5];
		String[] hand2 = new String[5];
		String[] remainder = new String[42];
		int k = 0;
		for (int i = 0; i < 10; i+=2) {
				hand1[k] = a[i];
				hand2[k] = a[i+1];
				k++;
		}
		for (int i = 0; i < 42; i++) {
			remainder[i] = a[i+10];
		}
		String newDeck[][] = {hand1, hand2, remainder};
		return newDeck;
	}
	
	public static void printer(String[] a) { //method to print a 1D array
		for (int row = 0; row < a.length; row++) {
			System.out.print("[");
			System.out.print(a[row]);
			System.out.println("]");
		}
		System.out.println();
	}

	public static void printer(char[] a) { //method to print a 1D char array
		System.out.println(Arrays.toString(a));
	}
	
	public static void printer(String[][] a) { //method to print a 2D array
		for (int row = 0; row < a.length; row++) {
			System.out.print("[");
			for (int column = 0; column < a[row].length; column++) {
				System.out.print(a[row][column]);
				if (column != a[row].length-1)
				System.out.print(", ");
				}
				System.out.print("]");
				System.out.println();
			}
		}
	
	// -t3 or -test3 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void checker() { //method to classify a given hand
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your hand: ");
		String result = classify(input.next());
		System.out.println("This hand has a " + result);
		}
	
	public static String classify(String hands) { //determine what the hand is

		char[] breakDown = new char[hands.length()];
			
		for (int i = 0; i < hands.length(); i++) { //separates the string into an array
			breakDown[i] = Character.toLowerCase(hands.charAt(i));
		} //printer(breakDown);
			
		double checker = 0; 
		int z = 0;
			for (int i = 0; i < 10; i+=2) {
				for(int j = 0; j < 10; j+=2) {
					if (breakDown[j] == breakDown[i])
						z++;
				}
			}
				
			switch(z) {
			case 7: //1 pair
				checker += 4;
				break;
			case 9: //2 pair
				checker += 5;
				break;
			case 11: //3 of a Kind
				checker += 6;
				break;
			case 13:  //Full House
				checker += 11;
				break;
			case 17: //4 of a Kind
				checker +=8;
				break;
			}

			String[] breakDown2 = new String[breakDown.length]; //converting t and face cards to strings
			for (int i = 0; i < breakDown2.length; i++) {
				breakDown2[i] = Character.toString(breakDown[i]);
				if (breakDown2[i].equals("a"))
					breakDown2[i] = "14";
				if (breakDown2[i].equals("k"))
					breakDown2[i] = "13";
				if (breakDown2[i].equals("q"))
					breakDown2[i] = "12";
				if (breakDown2[i].equals("j"))
					breakDown2[i] = "11";
				if (breakDown2[i].equals("t"))
					breakDown2[i] = "10";
			}
				
			int x = 0;
			for (int j = 0; j < 10; j+=2){
				for (int i = 0; i < 10; i+=2){
					if (Integer.parseInt(breakDown2[i]) == Integer.parseInt(breakDown2[j])+1){
						x += 1;
					}
				}
			}
			
			for (int i = 0; i < breakDown2.length; i++) {
				if (breakDown2[i].equals("14")) 
					breakDown2[i] = "1";
			}
			
			for (int j = 0; j < 10; j+=2){
				for (int i = 0; i < 10; i+=2){
					if (Integer.parseInt(breakDown2[i]) == Integer.parseInt(breakDown2[j])+1){
						x += 1;
					}
				}
			}
				
			if (x == 4 || x == 7 || x == 8)  
				checker += 10;
				
			if (breakDown[1] == breakDown[3] && breakDown[3] == breakDown[5] && breakDown[5] == breakDown[7] && breakDown[7] == breakDown[9]) //checker for flush
				checker += 9;
				
			String[] handType = {"High Card", "High Card", "High Card", "High Card", "1 Pair", "2 Pair", "3 of a Kind", "High Card", "4 of a Kind", "Flush", "Straight", "Full House", "High Card", "High Card", "High Card", "High Card", "Royal Flush", "High Card", "High Card", "Straight Flush", "High Card", "High Card"};
				
			return handType[(int)checker];
	}
	
	// -t4 or -test4 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static int determine (String a) { //point system to determine which hand is stronger based on the total points of the hand when the two hands are of equal strength
		ArrayList<String> hand = new ArrayList<String>(); //ranks the strength of each character
		hand.add(a);
		
		char[] x = new char[hand.get(0).length()];
		
		for (int count = 0; count < hand.get(0).length(); count++) {
			x[count] = Character.toLowerCase(hand.get(0).charAt(count));
		}
		
		int score = 0;
		
		ArrayList<Character> calc = new ArrayList<Character>();
		calc.add((char) 2);
		calc.add('3');
		calc.add('4');
		calc.add('5');
		calc.add('6');
		calc.add('7');
		calc.add('8');
		calc.add('9');
		calc.add('t');
		calc.add('j');
		calc.add('q');
		calc.add('k');
		calc.add('a');
		
		for (int i = 0; i < x.length; i += 2) {
			score += (calc.indexOf(x[i]) + 1);
		}
		return score;
	}
	
	public static int calculate (String a) { //scores by the types of hand a player has
		ArrayList<String> calc = new ArrayList<String>();
		calc.add("High Card");
		calc.add("1 Pair");
		calc.add("2 Pair");
		calc.add("3 of a Kind");
		calc.add("Straight");
		calc.add("Flush");
		calc.add("Full House");
		calc.add("4 of a Kind");
		calc.add("Straight Flush");
		 
		return calc.indexOf(a) + 1;
	}
}
	
