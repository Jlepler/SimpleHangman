import java.util.*;

public class SimpleHangmanPart1 {
    public statis void main (String[] args){

        Random rnd = new Random();                  //Initializes random class
        Scanner key = new Scanner(System.in);       //Initializes scanner class

        List<String> preWordList = Arrays.asList("tree","rain","bear","encourage","promise","soup","chess","insurance","pancakes","stream");



        ArrayList<String> wordList = new ArrayList<>();     //Creates array list for list of words and inputs from list collection
        wordList.addAll(wordList);

        System.out.println(wordList);
        int randomIndex = rnd.nextInt();                //Generates a random number



        System.out.println("Please enter a number");
        String guess = key.nextLine();                      //User inputs guess
        String secretWord = wordList[randomIndex];

        ArrayList<String> underScore = new ArrayList<>();



        for (String var = wordList){                    //
            if (guess.equalsIgnoreCase(var){

            }
        }

    }


}
