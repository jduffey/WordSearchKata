import java.util.ArrayList;

/**
 * Created by jedduffey on 9/2/17.
 */
public class WordList {

    private static String words;

    public void setWords(String words) {
        this.words = words;
    }

    public String getWord(int i) {
        return words.substring(0,words.indexOf(","));
    }

}
