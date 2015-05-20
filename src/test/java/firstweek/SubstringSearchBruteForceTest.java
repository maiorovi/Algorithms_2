package firstweek;

import org.junit.Before;
import org.junit.Test;
import substring.SubstringSearchBruteForce;

import static org.assertj.core.api.Assertions.assertThat;

public class SubstringSearchBruteForceTest {

    private SubstringSearchBruteForce search;

    @Before
    public void setUp() {
        search = new SubstringSearchBruteForce();
    }

    @Test
    public void returnsTheIndexOfTheFindPattern() {
        String pattern = "abs";
        String text = "qwetabs";

        int i = search.searchPattern(text, pattern);

        assertThat(i).isEqualTo(4);
    }

    @Test
    public void returnsTheLengthOfTheTextIfPatternNotFind() {
        String pattern = "ab";
        String text = "afdfg";

        int i = search.searchPattern(text, pattern);

        assertThat(i).isEqualTo(5);
    }

}
