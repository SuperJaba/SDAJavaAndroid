package observer;

/**
 * Created by RENT on 2017-02-25.
 */
public class SortFacade {

    private Observer observer = null;

    public SortFacade() {}

    public SortFacade(Observer observer) {
        this.observer = observer;
    }

    /*public int[] sortThroughFacade(int[] arrayToSort) {
        Sort sort = new InsertSort();
        return sort.sort(arrayToSort);
    }

    public int[] sortUsingCountSort(int[] arrayToSort) {
        Sort sort = new CountSort();
        for (int i = 0; i < arrayToSort.length; i++) {
            if (arrayToSort[i] < 0 && observer != null) {
                int temp = arrayToSort[i];
                    arrayToSort[i] = Math.abs(arrayToSort[i]);
                    observer.react(arrayToSort[i]);
                }
        }
        return sort.sort(arrayToSort);
    }*/
}

