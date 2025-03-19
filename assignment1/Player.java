
public class Player {
    // public variable for player name:
    public String name;

    ///// Write method(s) here
    ///// Declare field variables here
    public int guesscount = 0;

    // increment guess count
    public void incrementGuesscount() {
        guesscount++;
    }

    // printing current guess count
    public int guesscount() {
        return guesscount;
    }

    /***
     * Start of guessing logic for the computer player, do not change any code below
     ***/
    private static class Inner {
        static int lastGuess;
        static int high = 100;
        static int low = 1;
    }

    // Calculate and return the computer player's next guess
    public int computerGuess() {
        int guess = (Inner.high + Inner.low) / 2;
        Inner.lastGuess = guess;
        return guess;
    }

    // Method to tell the computer player about wrong guesses.
    // Parameter value 'true' means the guess was too high,
    // 'false' means the guess was too low.
    public void computerGuessWasWrong(boolean highLow) {
        if (highLow) {
            // The guess was too high
            Inner.high = Inner.lastGuess - 1;
        } else {
            // The guess was too low
            Inner.low = Inner.lastGuess + 1;
        }
    }
} // End of Player class
