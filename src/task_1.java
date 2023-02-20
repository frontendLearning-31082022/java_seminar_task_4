import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

//Создать LinkedList целых чисел (заполнить случайными числами).
//
//       Реализуйте метод, который вернет “перевернутый” список.
public class task_1 {
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList(1,2,3,4,5,6,7,8,9,10);

        MyLinkedList getCopyReversed= myLinkedList.getReverse();
    }
   private static class MyLinkedList extends LinkedList {

        MyLinkedList(Object ... elements){
            super();
            for (Object element : elements) {
                this.add(element);
            }
        }

        public MyLinkedList getReverse() {
            MyLinkedList reverse= (MyLinkedList) this.clone();
            Collections.reverse(reverse);
            return reverse;
        }
    }
}


