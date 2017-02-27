package pl.sda.decorator;

import org.junit.Assert;
import org.junit.Test;
import pl.sda.SortDecoratorWithReverse;
import pl.sda.sort.impl.BubbleSort;

/**
 * Created by RENT on 2017-02-27.
 */
public class DecoratorTest {

    @Test
    public void testDecorator() {

    //given
    int[] arrayToSort = new int[] {55, 33, 77,1, -33,0,-222,5,-111};
    SortDecoratorWithReverse decoratedSort = new SortDecoratorWithReverse(new BubbleSort());

    //when
    int[] result = decoratedSort.sort(arrayToSort);

    //then
    Assert.assertEquals(77, result[0]);
    Assert.assertEquals(-222, result[result.length-1]);
}
}
