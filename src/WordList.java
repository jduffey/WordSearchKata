import java.util.ArrayList;

/**
 * Created by jedduffey on 9/2/17.
 */
public class WordList {

    private static String words;

    public void setWords(String words) {
        this.words = words;
    }

    public String getWord(int whichWord) {

        String wordToGet = "";
        String wordsToEat = words;

        for (int i = 0; i <= whichWord; i++) {
            wordToGet = wordsToEat.substring(0, wordsToEat.indexOf(","));
            wordsToEat = wordsToEat.substring(wordsToEat.indexOf(",") + 1, wordsToEat.length());
        }

        return wordToGet;
    }

}
