import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jedduffey on 9/2/17.
 */
public class Tests {

    @Test
    public void shouldReturnFirstWordFromWordList() {
        WordList wordList = new WordList();
        wordList.setWords("BONES,KHAN,KIRK,SCOTTY,SPOCK,SULU,UHURA");
        assertEquals("BONES", wordList.getWord(0));
        wordList.setWords("CHIPS,FUZZBALL,SANDY,WINKY,MERLIN");
        assertEquals("CHIPS",wordList.getWord(0));
    }

    @Test
    public void shouldReturnSecondWordFromWordList(){
        WordList wordList = new WordList();
        wordList.setWords("BONES,KHAN,KIRK,SCOTTY,SPOCK,SULU,UHURA");
        assertEquals("KHAN",wordList.getWord(1));
    }

}
