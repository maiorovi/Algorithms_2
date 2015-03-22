package firstweek;

import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

import static org.assertj.core.api.Assertions.assertThat;

public class BagTest {

    private Bag<Integer> bag;

    @Before
    public void setUp() {
        bag = new Bag<Integer>();
    }


    @Test
    public void shouldReturnSizeOfTheBag() {
        populateBagWithValues();

        assertThat(bag.size()).isEqualTo(5);
    }

    @Test
    public void shouldReturnTrueWhenBagEmpty() {
        assertThat(bag.isEmpty()).isTrue();
    }

    @Test
    public void shouldReturnFalseWhenValuesPutInBag() {
        populateBagWithValues();

        assertThat(bag.isEmpty()).isFalse();
    }

    @Test
    public void returnZeroSizeWhenBagEmpty() {
        assertThat(bag.size()).isEqualTo(0);
    }

    @Test
    public void hasNextReturnsFalseWhenThereIsNoNextElement() {
        populateBagWithValues();

        Iterator<Integer> it = bag.iterator();

        assertThat(it.next()).isEqualTo(0);
        assertThat(it.next()).isEqualTo(1);
        assertThat(it.next()).isEqualTo(2);
        assertThat(it.next()).isEqualTo(3);
        assertThat(it.next()).isEqualTo(4);

        assertThat(it.hasNext()).isFalse();
    }

    @Test
    public void hasNextReturnFalseOnEmptyBag() {
        Iterator<Integer> it = bag.iterator();

        assertThat(it.hasNext()).isFalse();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void removeMethodThrowOperationNotSuportedException() {
        bag.iterator().remove();
    }

    private void populateBagWithValues() {
        for (int i = 0; i < 5; i++) {
            bag.put(i);
        }
    }
}
