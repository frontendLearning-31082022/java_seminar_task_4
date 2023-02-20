// Реализуйте алгоритм Быстрой сортировки,
// Низходящей сортировки слиянием,
// Восходящей сортировки слиянием

import sorts_algs.Merge;
import sorts_algs.MergeBU;
import sorts_algs.Quick;

public class task_3 {

    public static void main(String[] args) {
        Comparable[] array=null;

        array= task_3.getArray();
        Quick.sort(array);

        array= task_3.getArray();
        Merge.sort(array);

        array= task_3.getArray();
        MergeBU.sort(array);

        new String();
    }

    static Comparable[] getArray(){
        return new Comparable[]{2, 5, 9, 1, 3, 8, 3, 6};
    }
}
