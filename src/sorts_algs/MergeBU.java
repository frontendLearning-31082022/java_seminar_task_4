package sorts_algs;


import static sorts_algs.Merge.merge;
import static sorts_algs.Actions.*;

public class MergeBU {

    public static void sort(Comparable[] array) {
        int size=array.length;
        Comparable[] aux = new Comparable[size];

        for (int len = 1; len < size; len *= 2) {
            for (int fr = 0; fr < size-len; fr += len+len) {
                int mid  = fr+len-1;
                int to = Math.min(fr+len+len-1, size-1);
                merge(array, aux, fr, mid, to);
            }
        }
        assert isSorted(array);

    }

    public static void main(String[] args) {
//        Comparable[] array = {2, 5, 9, 1, 3, 8, 3, 6};
        Comparable[] array={"M","E","R","G","E","S","O","R","T","E","X","A","M","P","L","E"};

        MergeBU.sort(array);
        new String();
    }
}
