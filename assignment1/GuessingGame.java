
///// Adding necessary imports here

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        System.out.println("** GUESSING GAME **");

        ///// code to generate the random number to guess here
        Random random = new Random();
        3
        ;// generate number from 1 -100

        ///// Write code to create two Player objects here
        Player humanPlayer = new Player();
        Player computerPlayer = new Player();

        //// Setting player name to my own name
        humanPlayer.name = "Bibek";
        computerPlayer.name = "Computer";

        /// scanner or human input
        Scanner input = new Scanner(System.in);

        while (true) { // Loop until 'break'
            ///// Start of code for human
            System.out.print(humanPlayer.name + ",Please Enter your guess(1-100): ");
            int humanGuess = input.nextInt();
            // incrementing player 1 guess count by calling incrementGuesscount
            humanPlayer.incrementGuesscount();

            /// checking whether human guess is right or wrong;
            if (humanGuess == randomNumber) {
                System.out
                        .println("Congratulations you have guessed number in " + humanPlayer.guesscount() + "guesses");
                break;
            } else if (humanGuess > randomNumber) {
                System.out.println("Your guess is high");
            } else {
                System.out.println("Your guess is low");
            }

            ///// Start of code for computer
            int computerGuess = computerPlayer.computerGuess();
            System.out.println("Computer guess is: " + computerGuess);
            // increment of computer guess count;
            computerPlayer.incrementGuesscount();

            if (computerGuess == randomNumber) {
                System.out
                        .println("You Loose! computer guessed number in " + computerPlayer.guesscount() + " guesses");
                break;
            } else {
                System.out.println("Computer guess was wrong");
            }
            // feedback to algorithm
            if (computerGuess > randomNumber) {
                computerPlayer.computerGuessWasWrong(true);// guess was high
            } else {
                computerPlayer.computerGuessWasWrong(false);// guess was low.
            }

        } // End of 'while' loop
        input.close();

    } // End of main method

} // End of GuessingGame class