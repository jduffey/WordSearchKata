import java.util.ArrayList;

/**
 * Created by jedduffey on 9/2/17.
 */
public class SearchSquare {


    private ArrayList<String> letters = new ArrayList<String>();

    public void setLetters(String oneLine) {
        this.letters.add(oneLine);
    }

    public String getLetter(int row, int column) {
        return "U";
    }
}
