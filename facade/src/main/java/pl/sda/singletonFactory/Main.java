package pl.sda.singletonFactory;

import pl.sda.sort.Sort;
import pl.sda.sort.factory.SortTypeEnum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SingletonSortFactory factory = SingletonSortFactory.getInstance();

        Sort sort = factory.produce(SortTypeEnum.BUBBLE);

        int[] sortedArray = sort.sort(new int[] {4234,65654,13214,634,123,8867});

        System.out.println(Arrays.toString(sortedArray));

    }
}
