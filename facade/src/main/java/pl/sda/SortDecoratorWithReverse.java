package pl.sda;

import pl.sda.sort.Sort;

/**
 * Created by RENT on 2017-02-27.
 */
public class SortDecoratorWithReverse implements Sort {
    private Sort sort;

    public SortDecoratorWithReverse(Sort sort) {
        this.sort = sort;
    }

    @Override
    public int[] sort(int[] arrayToSort) {
        int[] result = sort.sort(arrayToSort);
        int[] reversedResult = new int[arrayToSort.length];
        for (int i = 0; i < arrayToSort.length; i++) {
            reversedResult[i] = result[arrayToSort.length - i - 1];
        }
        return reversedResult;
    }
}
