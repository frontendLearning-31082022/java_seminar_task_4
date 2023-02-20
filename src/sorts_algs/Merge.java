package sorts_algs;

import static sorts_algs.Actions.*;

public class Merge {

    public static void sort(Comparable[] array) {
        Comparable[] tempArray = new Comparable[array.length];
        sort_recur(array, tempArray, 0, array.length - 1);
        assert isSorted(array);
    }

    private static void sort_recur(Comparable[] array, Comparable[] tempArray, int from, int to) {
        if (to <= from) return;
//        showIteration(array,from,to,"рекурсия ");

        int mid = from + (to - from) / 2;
        sort_recur(array, tempArray, from, mid);
        sort_recur(array, tempArray, mid + 1, to);
        merge(array, tempArray, from, mid, to);
    }

    public static void merge(Comparable[] array, Comparable[] tempArray, int from, int mid, int to) {
        assert isSorted(array, from, mid);
        assert isSorted(array, mid + 1, to);

        for (int i = from; i <= to; i++) tempArray[i] = array[i];

        int fr = from;
        int t = mid + 1;
        for (int i = from; i <= to; i++) {
            if (fr > mid)array[i] = tempArray[t++];
            else if(t > to)array[i]=tempArray[fr++];
            else if(less(tempArray[t],tempArray[fr]))array[i]=tempArray[t++];
            else array[i]=tempArray[fr++];
        }
        assert isSorted(array,from,to);
    }

    static void showIteration(Comparable[] array, int el_i, int el_j, String comment){
//        return;

//        if (el_i==el_j)return;

        String[] array_in=new String[array.length];
        for (int i = 0; i < array.length; i++) {
            array_in[i]=array[i].toString();
        }

        array_in[el_i]="{"+array_in[el_i]+"}";
        array_in[el_j]="{"+array_in[el_j]+"}";

        String print_res=String.join("\t",array_in);
        System.out.println(comment+"||||\t"+ print_res);
    }

    public static void main(String[] args) {
        Comparable[] array = {2, 5, 9, 1, 3, 8, 3, 6};

        Merge.sort(array);
        new String();
    }

}
