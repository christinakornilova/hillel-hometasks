package hillel.hometask.ht23;

import java.util.NoSuchElementException;

public class SinglyLinkedList {
    /*
    Реализовать односвязный список (SinglyLinkedList) для типа данных String.
     */
    private Node head;
    private int size;


    public SinglyLinkedList() {
        head = null;
    }

    public SinglyLinkedList(Node head) {
        this.head = head;
        size = 0;
    }


    public SinglyLinkedList(String headData) {
        head = new Node(headData);
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }


    private int checkElementIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.print("Invalid index. ");
            return -1;
        }
        return 0;
    }


    public void add(String data, int index) {

        if (index > size) {
            System.out.println("Index [" + index
                    + "] is bigger than current list size .");
        } else if (index < 0) {
            System.out.println("Index [" + index
                    + "] is smaller than current list first element index.");
        } else {

            Node temp = new Node(data);
            Node current = getNode(index);

            if (index == 0) {
                temp.setNext(head);
                head = temp;

            } else {
                temp.setNext(current.getNext());
                current.setNext(temp);
            }

        }
        size++;
    }

    //search
    private Node getNode(int index) {

        if ( index > size ) {
            System.out.println("Index [" + index + "] is bigger than current size [" + size + "].");
        }
        else {
            Node currentNode = head;
            for (int i = 1; i < index && currentNode.getNext() != null; i++) {
                currentNode = currentNode.getNext();
            }
            return currentNode;
        }
        return null;
    }

    public void add(String data) {
        add(data, size);
    }


    private String removeFirst() {
        if (size == 0)
            return "No such element.";
        else {
            String temp = head.getData();
            head = head.getNext();
            size--;
            return temp;
        }
    }


    private String removeLast() {
        if (size <= 1)
            return removeFirst();
        else {
            Node tmp = head;

            while (tmp.getNext().getNext() != null)
                tmp = tmp.getNext();

            String temp = tmp.getNext().getData();
            tmp.setNext(null);
            size--;
            return temp;
        }
    }

    private void removeFirst(String data) {
        Node tmp = head;

        for (int i = 0; i < size; i++, tmp = tmp.getNext())
            if (tmp.getData().equals(data)) {
                remove(i);
                return;
            }
    }


//    private void removeLast(String data) {
//        int lastOccurrence = -1;
//        Node x = head;
//
//        for (int i = 0; i < size; i++, x = x.getNext())
//            if (x.getData().equals(data))
//                lastOccurrence = i;
//
//        if (lastOccurrence != -1)
//            remove(lastOccurrence);
//    }


    public void remove(int index) {
        if (checkElementIndex(index) == 0) {

            if (index == 0)
                removeFirst();
            else {
                Node tmp = head;
                for (int i = 0; i < index - 1; i++)
                    tmp = tmp.getNext();

                tmp.setNext(tmp.getNext().getNext());
                size--;
            }
        } else System.out.println("Unable to remove.");
    }

    public void remove(String data) {
        removeFirst(data);
    }

    public String remove() {
        return removeLast();
    }

    public void clear() {
        head = null;
        size = 0;
    }


    public void set(int index, String newData) {


        if (checkElementIndex(index) == 0){
            Node tmp = head;

            for (int i = 0; i < index; i++)
            tmp = tmp.getNext();

            tmp.setData(newData);
        } else System.out.println("Invalid index.");
    }


    public boolean contains(String data) {
        for (Node currentNode = head; currentNode != null; currentNode = currentNode.getNext()) {
            if (currentNode.getData().equalsIgnoreCase(data)) {
                return true;
            }
        }
        return false;
    }


    public String toString() {
        StringBuilder builder = new StringBuilder();

        Node current = head;

        if (this.isEmpty()) {
            return "List is empty.";
        }

        while( current != null ) {
            builder.append("[" + current.getData() + "]");
            current = current.getNext();
        }

        return builder.toString();

    }

}

