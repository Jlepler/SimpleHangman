import java.util.*;


public class SimpleHangman {
    public static void main(String[] args){

        Scanner key = new Scanner(System.in);
        Random rnd = new Random();

        //Initializes word array list
        ArrayList<String> wordList = new ArrayList<>();
        List<String> list = Arrays.asList("tree","rain","bear","encourage","promise","soup","chess","insurance","pancakes","stream");
        wordList.addAll(list);


        //Program chooses a word at random for the user to guess
        int secretIndex = rnd.nextInt((10));
        String secretWord = (wordList.get(secretIndex));
        System.out.println(wordList.get(secretIndex));
        System.out.println(secretIndex);

                                //Prints underscore line according to number of characters in randomly chosen word
                                /**********************/
                        //        ArrayList<String> underScores = new ArrayList<>(wordList.size());
                        //        for (int i = 0; i < wordList.size(); i++){
                        //            underScores.add("_");
                        //        }
                        //        int v = 0;
                        //        for (String var : underScores) {
                        //            System.out.print(underScores.get(v) + " ");
                        //            v++;
                        //        }
                                /*********************/

        boolean continueGame = true;
        do {
            System.out.println("Welcome, let's play hangman!\n\n");
            System.out.print("Here is the word I am thinking of: ");
            ArrayList<String> underScores = new ArrayList<>(wordList.size());

            for (int i = 0; i < secretWord.length(); i++){
                underScores.add("_");
            }
            int v = 0;
            for (String var : underScores) {
                System.out.print(underScores.get(v) + " ");
                v++;
            }


            String guessedCharacter;
            for (int guesses = 0; guesses < 6; guesses++) {        //User enters guess
                System.out.print("\nEnter your guess: ");
                guessedCharacter = key.next();
                int indexOfGsChar = 0;

                for (int i = 0; i < secretWord.length(); i++) {          //This for loop
                    System.out.println(secretWord.charAt(i));
                    String character = (secretWord.substring(i, (i + 1)));
                    System.out.println(character);
                    if (character.equalsIgnoreCase(guessedCharacter)) {
                        underScores.add(i, guessedCharacter);
                        System.out.println("Here");
                    } else
                        break;
                    System.out.println(underScores);
                }{

//                    for (String var : underScores)
//                        if (secretWord.contains(guessedCharacter)) {
//                            underScores.add(indexOfGsChar, guessedCharacter);
//                            indexOfGsChar++;
//                        }
//                        else

                }


                }
                System.out.println(underScores);


            continueGame = false;
        } while(continueGame);


    }
}
