package sorts_algs;

import static sorts_algs.Actions.*;

public class Quick {

    public static void sort(Comparable[] array) {
        int size = array.length;
        shuffle(array);
        sort_recur(array, 0, size - 1);
        assert isSorted(array);
    }

    private static void sort_recur(Comparable[] array, int from, int to) {
        if (to <= from) return;
//        showIteration(array,from,to,"sort_recur() вход");

        int dot = partition(array, from, to);
        sort_recur(array, from, dot - 1);
        sort_recur(array, dot + 1, to);
        assert isSorted(array);
    }

    private static int partition(Comparable[] array, int from, int to) {
        int fr = from;
        int t = to+1;
        Comparable elem = array[from];
//        showIteration(array,from,to,fr,t,"partition() вход");
        while (true) {
            while (less(array[++fr], elem))if (fr == to) break;
//            showIteration(array,fr,fr,"fr дошел до "+fr);
            while (less(elem, array[--t]))if (t == from) break;
//            showIteration(array,t,t,"t дошел до "+t);
            if (fr>=t)break;
            exch(array,fr,t);
//            showIteration(array,fr,t,"замена ");
        }
        exch(array,from,t);
//        showIteration(array,from,t,"нулевой элем меняем с точной раздела "+t);
        return t;
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
    static void showIteration(Comparable[] array, int el_i, int el_j,int el_sec_i,int el_sec_j, String comment){
//        return;

//        if (el_i==el_j)return;

        int sizeNew=array.length;
        sizeNew=(el_sec_j>sizeNew-1)?el_sec_j+1:sizeNew;


        String[] array_in=new String[sizeNew];
        for (int i = 0; i < array.length; i++) {
            array_in[i]=array[i].toString();
        }

        array_in[el_i]="{"+array_in[el_i]+"}";
        array_in[el_j]="{"+array_in[el_j]+"}";

        array_in[el_sec_i]="["+array_in[el_sec_i]+"]";
        array_in[el_sec_j]="["+array_in[el_sec_j]+"]";

        String print_res=String.join("\t",array_in);
        System.out.println(comment+"||||\t"+ print_res);
    }


    public static void main(String[] args) {
        Comparable[] array = {2, 5, 9, 1, 3, 8, 3, 6};

        Quick.sort(array);
        new String();
    }

}
