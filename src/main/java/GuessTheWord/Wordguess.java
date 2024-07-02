package GuessTheWord;


import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


public class Wordguess {
    // instance variables go here




    // set up a list (array) of strings of words players could guess
    String[] words={"cat","dog","bog","cut"};
    int counter = 4;
    //boolean status=true;
    public void runGame() {


        announce_game();
//        char[] word_result=initialize_game_state(words);
//        char[] player_guess=new char[word_result.length];
//
//        for(int i=0;i<player_guess.length;i++){
//            player_guess[i]='_';
//        }


        //test/////////////////////////
        //System.out.println(word_result[0]);
        //printArray(word_result);
        //printArray(player_guess);
        //pseudo-code
        //choose a random word from a list

/*      **********same with initialize_game_state**********
        Random random=new Random();
        int ranwords=random.nextInt(4);
        char[] words_result = words[ranwords].toCharArray();
        System.out.println(words_result[0]);
        printArray(words_result);
        ***************************************************
        */


//        while (you want to play) { //outer loop
        while(true) {
            char[] word_result=initialize_game_state(words);
            char[] player_guess=new char[word_result.length];
            System.out.println("");//print a new line


            for(int i=0;i<player_guess.length;i++){
                player_guess[i]='_';
            }
            initialize_game_state(words);
            while (counter!=0){
                System.out.println("");
                System.out.println("Current Guess: ");

                printArray(print_current_state(player_guess));
                System.out.println("");
                print_current_state(player_guess);
                System.out.println("you have "+counter+"tries left.\nEnter a character:\n");
                Scanner scanner = new Scanner(System.in);
                char guess = scanner.next().charAt(0);
                get_next_guess(guess);
                System.out.println("guess is "+guess);
                process(guess,word_result,player_guess);
                //printArray(print_current_state(player_guess));
                if (is_word_guessed(word_result,player_guess)){
                    counter--;
                    break;
                }
                counter--;
            }
//            System.out.println("Current Guess:");
//            initialize_game_state(words);
//            printArray(print_current_state(player_guess));
//            print_current_state(player_guess);
//            Scanner scanner = new Scanner(System.in);
//            char guess= scanner.next().charAt(0);
//            get_next_guess(guess);
//
//            System.out.println("guess is "+guess);
//            process(guess,word_result,player_guess);
//            printArray(print_current_state(player_guess));
//
//            guess = scanner.next().charAt(0);
//            get_next_guess(guess);
//            System.out.println("guess is "+guess);//need to remove
//            process(guess,word_result,player_guess);
//            printArray(print_current_state(player_guess));
//
//            guess = scanner.next().charAt(0);
//            get_next_guess(guess);
//            System.out.println("guess is "+guess);//need to remove
//            process(guess,word_result,player_guess);
//            printArray(print_current_state(player_guess));
//            counter=counter-3;
            printArray(print_current_state(player_guess));
            if(is_word_guessed(word_result,player_guess)){
                System.out.println("\n"+playerWon());
            }else if(counter==0&&!is_word_guessed(word_result,player_guess)){
                System.out.println("\n"+playerLost());
            }

/*           start the game
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
            if(ask_to_play_again()!=true){
                break;
            }
//            Scanner again = new Scanner(System.in);
//            String askagain= again.next();
//            if(askagain.toUpperCase()=="N"){
//                break;
//            }
            runGame();
            counter=4;
        }
        System.out.println(game_over());
    }


    //words <- { "cat", "dog", "bog", "cut"}
    //print out the characters array a with a space between each letter. You'll need a for loop to print each character and a space right after.
    public void printArray(char[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(" "+a[i]+" ");
        }
    }


    //prints a welcome
    public void announce_game(){
        System.out.print("Let's Play Wordguess.\n");
    }

    //sets up char[] for secret word and guesses
    public char[] initialize_game_state(String[] wordlist){
        Random random=new Random();
        int ranwords=random.nextInt(4);
        char[] words_result = wordlist[ranwords].toCharArray();

        return words_result;
    }

    //returns a char from player input
    public char get_next_guess(char input){
//        Scanner scanner = new Scanner(System.in);
//        String guess= scanner.next();

        //scanner.close();
        return input;
    }

    //return boolean
    public boolean is_word_guessed(char[] result, char[] guessed){

        if(Arrays.equals(guessed, result)){
            return true;
        }else{
            return false;
        }
    }

    //returns boolean
    public boolean ask_to_play_again(){
        Scanner newscanner = new Scanner(System.in);
        System.out.println("\nDo you want to play again? (Y/N)");
        String again=newscanner.next();
        if(again.equals("Y")){
            //newscanner.close();
            return true;
        } else {
            //newscanner.close();
            return false;
        }


    }

    //use print Array to show player where they are at
    public char[] print_current_state(char[] playerguess){
        char[] curr= new char[playerguess.length];
        for(int i=0;i<playerguess.length;i++){
            curr[i]=playerguess[i];
        }
        return curr;
    }

    // loops thru the word array, looking for the inputed guess,
    // and replaces the "_" with the guesses char if found
    public char[] process(char userInput, char[] wordResult,char[] userGuess){
        for(int i=0;i<wordResult.length;i++){
            if(userInput==wordResult[i]){
                userGuess[i]=userInput;
            }
        }
        return userGuess;
    }

    //print won message
    public String playerWon(){
        return "Congratulations, You Won!\n";
    }

    //print lose message
    public String playerLost(){
        return "You Lost! You ran out of guesses.\n";
    }

    //prints "game over"
    public String game_over(){
        return "Game Over.\n";
    }

}
