package datastructure.drivers;

import datastructure.linkedlist.singly.LinkedList;

public class LinkedListDriver {
    public void linkedListOperations() {
        LinkedList<Integer> list = new LinkedList<>();
        list.insert(2);
        list.insert(1);
        list.insert(3);
        list.insert(4, 2);
        list.display();
        System.out.println("First : " + list.first());
        System.out.println("Size : " + list.size());
        System.out.println("Last : " + list.last());
        list.delete();
        list.display();
        list.insert(3);
        list.display();
        list.delete(3);
        list.display();
    }
}
