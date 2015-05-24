package firstweek;

import org.junit.Before;
import org.junit.Test;
import substring.RabinKarpSearch;

import static org.assertj.core.api.Assertions.assertThat;

public class RabinKarpSearchTest {
    private RabinKarpSearch search;
    private String text;
    private String pattern;

    @Before
    public void setUp() {
        text = "qwertyuabc";
        pattern ="abc";
        search = new RabinKarpSearch(pattern);
    }

    @Test
    public void test1() {
        int ind = search.search(text);

        assertThat(buildSubstringFromGivenIndex(text, ind)).isEqualTo(pattern);
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

