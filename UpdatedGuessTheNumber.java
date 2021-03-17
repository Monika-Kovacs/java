/* A more complex update to "GuessTheNumber" where program tells user whether their guess
 * is within a range of 10 or less digits and it allows 3 guesses. If guess is correct
 * it terminates programme. If still not guessed correctly after 3 guesses it also terminates
 * program displaying number correctly.
 */

import java.util.Scanner;
import java.util.Random;

public class UpdatedGuessTheNumber {
	
	// method to generate random computer integer.
	public static int randomNumber() {
		
		// initiates variable "number" and using "Random" java library to return a random int
		// guess by computer between 1 and 100 (inclusive). 
		int number;
		Random computerGuess = new Random();
		return number = computerGuess.nextInt(100) + 1;

	}
	// method to create user guess.
	public static int userNumber() {
		
		// initiates "guess" variable and using "Scanner" java library to return a guess by
		// user to try to guess computer generated random integer between 1 and 100.
		int guess;
		Scanner userGuess = new Scanner(System.in);
		return guess = userGuess.nextInt();

	}
	// main method to try to guess computer generated random number. It allows 3 guesses
	// and tells whether guess is higher or lower than actual number. It returns value
	// at the end.
	public static void main(String[] args) {
		
		// variables initiated for while loop and counter. 
		int computerGuess;
		int userGuess; 
		int i = 0;
		
		// initiates random number generator method for computer guess
		computerGuess = randomNumber();
		System.out.println("I have thought of a number between 1 and 100, take a guess: ");
		
		// initiates user guess response method
		userGuess = userNumber();
		
		// while loop as only 3 guesses are allowed if number has not been guessed yet.
		while (i < 2 && userGuess != computerGuess) {	
					
			if (userGuess < computerGuess) {
				System.out.println("Your guess is lower than my number, please another guess: ");
				userGuess = userNumber();
			} else {
				System.out.println("Your guess is higher than my number, please another guess: ");
				userGuess = userNumber();
			}
						
			i += 1;  // counter for while loop
		}
		
		// condition and instruction if user guessed computer generated random integer correctly
		if (userGuess == computerGuess) {
			System.out.println("You have guessed the number, congratulations " + computerGuess);
		
		// condition for printout message when running out of 3 guesses
		} else {
			System.out.println("You have run out of guesses, the number was " + computerGuess);
		}
	}
}
