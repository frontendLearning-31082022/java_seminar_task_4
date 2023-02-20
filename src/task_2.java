//Создать очередь с помощью LinkedList и реализовать следующие методы:
//        enqueue() - помещает элемент в конец очереди,
//        dequeue() - возвращает первый элемент из очереди и удаляет его,
//        first() - возвращает первый элемент из очереди, не удаляя.
//        Вызвать полученные методы и убедиться в их работоспособности.

import java.util.LinkedList;

public class task_2 {

    public static void main(String[] args) {

        MyLinkedList<Integer> myLinkedList = new MyLinkedList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int first = myLinkedList.first();
        myLinkedList.enqueue(20);
        int deletedFirst = myLinkedList.dequeue();

        new String();


    }

    private static class MyLinkedList<T> extends LinkedList {
        MyLinkedList(Object... elements) {
            super();
            for (Object element : elements) {
                this.add(element);
            }
        }

        public <T> T first() {
            return (T) this.getFirst();
        }


        public void enqueue(T elem) {
            this.add(elem);
        }

        public T dequeue() {
            return (T) this.removeFirst();
        }
    }

}
