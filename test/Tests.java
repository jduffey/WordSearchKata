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
        assertEquals("CHIPS", wordList.getWord(0));
    }

    @Test
    public void shouldReturnSecondWordFromWordList() {
        WordList wordList = new WordList();
        wordList.setWords("BONES,KHAN,KIRK,SCOTTY,SPOCK,SULU,UHURA");
        assertEquals("KHAN", wordList.getWord(1));
    }

    @Test
    public void shouldReturnLastWordFromWordList() {
        WordList wordList = new WordList();
        wordList.setWords("BONES,KHAN,KIRK,SCOTTY,SPOCK,SULU,UHURA");
        assertEquals("UHURA", wordList.getWord(6));
    }

    @Test
    public void shouldReturnFirstLetterFromSearchSquare() {
        SearchSquare searchSquare = new SearchSquare();
        String line00 = "U,M,K,H,U,L,K,I,N,V,J,O,C,W,E";
        String line01 = "L,L,S,H,K,Z,Z,W,Z,C,G,J,U,Y,G";
        String line02 = "H,S,U,P,J,P,R,J,D,H,S,B,X,T,G";
        String line03 = "B,R,J,S,O,E,Q,E,T,I,K,K,G,L,E";
        String line04 = "A,Y,O,A,G,C,I,R,D,Q,H,R,T,C,D";
        String line05 = "S,C,O,T,T,Y,K,Z,R,E,P,P,X,P,F";
        String line06 = "B,L,Q,S,L,N,E,E,E,V,U,L,F,M,Z";
        String line07 = "O,K,R,I,K,A,M,M,R,M,F,B,A,P,P";
        String line08 = "N,U,I,I,Y,H,Q,M,E,M,Q,R,Y,F,S";
        String line09 = "E,Y,Z,Y,G,K,Q,J,P,C,Q,W,Y,A,K";
        String line10 = "S,J,F,Z,M,Q,I,B,D,B,E,M,K,W,D";
        String line11 = "T,G,L,B,H,C,B,E,C,H,T,O,Y,I,K";
        String line12 = "O,J,Y,E,U,L,N,C,C,L,Y,B,Z,U,H";
        String line13 = "W,Z,M,I,S,U,K,U,R,B,I,D,U,X,S";
        String line14 = "K,Y,L,B,Q,Q,P,M,D,F,C,K,E,A,B";

        searchSquare.setLetters(line00);
        assertEquals("U",searchSquare.getLetter(0,0));
    }


}
