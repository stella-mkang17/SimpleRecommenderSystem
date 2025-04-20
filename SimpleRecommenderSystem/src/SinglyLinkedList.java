
public class SinglyLinkedList<T> {
    private Node<T> head;
    private int size;

    public SinglyLinkedList() {
        // FIXME
    }


    public void add(T data) {

    }


    public boolean remove(T data) {
        return false; // FIXME
    }


    public T get(int index) {
        return null;
    }


    public int size() {
        return 0;
    }


    public boolean isEmpty() {
        return false;
    }


    public Object[] toArray() {
        return null;
    }

    private class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {

        }
    }
}
