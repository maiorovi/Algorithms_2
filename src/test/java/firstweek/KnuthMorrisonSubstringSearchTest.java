package firstweek;

import org.junit.Before;
import org.junit.Test;
import substring.KnuthMorrisonSubstringSearch;

import static org.assertj.core.api.Assertions.assertThat;

public class KnuthMorrisonSubstringSearchTest {
    private KnuthMorrisonSubstringSearch search;

    @Before
    public void setUp() {
        search = new KnuthMorrisonSubstringSearch();
    }

    @Test
    public void searchAppearanceOfPatternInGivenString() {
        String text = "fdsdffdsgfdEMPfggdfgdf";
        String pattern = "EMP";

        int result = search.searchPattern(text, pattern,256);

        String s = "";

        for (int i = result; i < pattern.length() + result; i++) {
            s += text.charAt(i);
        }

        assertThat(s).isEqualTo("EMP");

    }

}
