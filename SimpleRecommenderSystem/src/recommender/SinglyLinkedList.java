package recommender;

/**
 * This class represents a basic singly linked list.
 * It allows adding, removing, getting, and converting to an array.
 * 
 * 이 클래스는 기본적인 단일 연결 리스트입니다.
 * 항목 추가, 제거, 인덱스 접근, 배열 변환을 지원합니다.
 * 
 * @param <T>
 *            the type of elements in the list
 * @author Stella Kang (mkang17)
 * @version April 20, 2025
 */
public class SinglyLinkedList<T> {
    private Node<T> head;
    private int size;

    /**
     * Creates an empty linked list.
     * 빈 리스트를 생성합니다.
     */
    public SinglyLinkedList() {
        head = null;
        size = 0;
    }


    /**
     * Adds a new item to the end of the list.
     * 리스트의 끝에 항목을 추가합니다.
     *
     * @param data
     *            the item to add (추가할 항목)
     */
    public void add(T data) {
        if (data == null) {
            return;
        }

        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        }
        else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }


    /**
     * Removes the first occurrence of the given item from the list.
     * 해당 항목을 처음 발견한 위치에서 삭제합니다.
     *
     * @param data
     *            the item to remove (삭제할 항목)
     * @return true if the item was removed, false otherwise
     */
    public boolean remove(T data) {
        if (head == null || data == null) {
            return false;
        }

        if (head.data.equals(data)) {
            head = head.next;
            size--;
            return true;
        }

        Node<T> current = head;
        while (current.next != null && !current.next.data.equals(data)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            size--;
            return true;
        }

        return false;
    }


    /**
     * Gets the item at the specified index.
     * 지정한 인덱스의 항목을 반환합니다.
     *
     * @param index
     *            the index (0-based) (인덱스, 0부터 시작)
     * @return the item at the index
     * @throws IndexOutOfBoundsException
     *             if index is invalid
     */
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }


    /**
     * Returns the number of elements in the list.
     * 리스트에 있는 항목의 개수를 반환합니다.
     *
     * @return the size of the list (리스트 크기)
     */
    public int size() {
        return size;
    }


    /**
     * Checks if the list is empty.
     * 리스트가 비어 있는지 확인합니다.
     *
     * @return true if empty, false otherwise
     */
    public boolean isEmpty() {
        return size == 0;
    }


    /**
     * Converts the list to an array.
     * 리스트를 배열로 변환합니다.
     *
     * @return an Object array containing all elements in order
     */
    public Object[] toArray() {
        Object[] result = new Object[size];
        Node<T> current = head;

        for (int i = 0; i < size; i++) {
            result[i] = current.data;
            current = current.next;
        }

        return result;
    }

    /**
     * Inner class representing a node in the linked list.
     * 연결 리스트에서 한 노드를 나타냅니다.
     */
    private class Node<E> {
        private E data;
        private Node<E> next;

        /**
         * Creates a node with given data.
         *
         * @param data
         *            the data to store (저장할 데이터)
         */
        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }
}
