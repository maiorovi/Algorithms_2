package firstweek;

import mst.BoyerMoureSubstringSearch;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BoyerMoureSubstringSearchTest {

    private BoyerMoureSubstringSearch search;
    private String text = "qwertyu";
    private String pattern = "qwe";

    @Before
    public void setUp() {
        search = new BoyerMoureSubstringSearch(pattern);
    }

    @Test
    public void findFirstApperanceOfThePatternInTheSubstring() {
        int startIndex = search.search(text);

        assertThat(buildSubstringFromGivenIndex(text, startIndex)).isEqualTo(pattern);
    }

    @Test
    public void findAppearanceInTheBeginningOfTheString() {
        int startIndex = search.search(text);

        assertThat(buildSubstringFromGivenIndex(text, startIndex)).isEqualTo(pattern);
    }


    private String buildSubstringFromGivenIndex(String text, int index) {
        String s = "";
        int patternEndIndex = pattern.length() + index;

        for(int i = index; i < patternEndIndex; i++) {
            s += text.charAt(i);
        }

        return s;
    }
}
