package GuessTheWord;


import java.util.Scanner;

public class Wordguess {
    // instance variables go here




    // set up a list (array) of strings of words players could guess
     String[] words={"cat","dog","bog","cut"};

    public void runGame() {

/*        pseudo-code
        choose a random word from a list

        while (you want to play) { //outer loop
            start the game
            set word guessed to false
            while (the word isn't guessed) { //inner loop
            print the current game state
            ask for a guess (a single letter)

            check the letter against the word
            using the two character arrays discussed above
            increment the number of guesses

            if the word is guessed
            player won, congrats

            if too many guesses
            player lost, too bad, quit game
        }
        ask if player wants to play again
    }
    display game over*/


    }


    //words <- { "cat", "dog", "bog", "cut"}
    //print out the characters array a with a space between each letter. You'll need a for loop to print each character and a space right after.
    public String printArray(char[] a){
        return;
    }


    //prints a welcome
    public String announce_game(){

        return "Let's Play Wordguess.";
    }

    //sets up char[] for secret word and guesses
    public String initialize_game_state(){
        return;
    }

    //returns a char from player input
    public char get_next_guess(char input){
        Scanner scanner = new Scanner(System.in);

        scanner.close();
        return;
    }

    //return boolean
    public boolean is_word_guessed(){
        return;
    }

    //returns boolean
    public boolean ask_to_play_again(){
        return;
    }

    //use print Array to show player where they are at
    public String print_current_state(){
        return;
    }

    // loops thru the word array, looking for the inputed guess, and replaces the "_" with the guesses char if found
    public char process(){
        return;
    }

    //print won message
    public String playerWon(){
        return;
    }

    //print lose message
    public String playerLost(){
        return;
    }

    //prints "game over"
    public String game_over(){
        return;
    }

}
