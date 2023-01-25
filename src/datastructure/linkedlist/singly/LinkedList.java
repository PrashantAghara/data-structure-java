package datastructure.linkedlist.singly;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    public void insert(T data, int index) {
        if (index < 1) {
            throw new IllegalArgumentException("Invalid Index");
        }
        if (index == 1) {
            Node<T> node = new Node<>(data);
            node.next = head;
            head = node;
        } else {
            Node<T> current = head;
            Node<T> prev = null;
            while (index != 1) {
                prev = current;
                current = prev.next;
                if (current == null) {
                    break;
                }
                index--;
            }
            Node<T> node = new Node<>(data);
            node.next = current;
            prev.next = node;
        }
    }

    public void insert(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
    }

    public void display() {
        Node<T> current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public T first() {
        return head.data;
    }

    public void delete() {
        if (tail == head) {
            head = null;
            tail = null;
        } else {
            Node<T> current = head;
            while (current.next != tail) {
                current = current.next;
            }
            tail = current;
            tail.next = null;
        }
    }

    public void delete(int index) {
        if (index < 1) {
            throw new IllegalArgumentException("Invalid Index");
        }
        if (index == 1) {
            head = head.next;
        } else {
            Node<T> current = head;
            Node<T> prev = null;
            while (index != 1) {
                prev = current;
                current = prev.next;
                if (current == null) {
                    break;
                }
                index--;
            }
            if (current == null) {
                return;
            }
            prev.next = current.next;
            current.next = null;
        }
    }

    public int size() {
        int size = 0;
        Node<T> current = head;
        if (head == null) {
            return size;
        }
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public T last() {
        return tail.data;
    }
}