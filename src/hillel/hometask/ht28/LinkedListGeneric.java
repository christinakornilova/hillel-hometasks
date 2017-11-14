package hillel.hometask.ht28;

/*
28*. Реализовать односвязный список (SingleLinkedList) для типа данных <Generic>.
(В качестве отправной точки можно взять выполненное задание №23)
 */

public class LinkedListGeneric<T>{
    private Node<T> head = null;
    private int size = 0;

    public LinkedListGeneric() {
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null && size == 0;
    }

    private int checkElementIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index. ");
            return -1;
        }
        return 0;
    }

    private Node getNode(int index) {
        if ( index > size ) {
            System.out.println("Index [" + index + "] is bigger than current size [" + size + "].");
        }
        else {
            Node<T> currentNode = head;
            for (int i = 1; i < index && currentNode.getNext() != null; i++) {
                currentNode = currentNode.getNext();
            }
            return currentNode;
        }
        return null;
    }

    public void add(T data, int index) {
        if (index > size) {
            System.out.println("Index [" + index
                    + "] is bigger than current list size.");
        } else if (index < 0) {
            System.out.println("Index [" + index
                    + "] is smaller than current list first element index.");
        } else {

            Node<T> temp = new Node(data);
            Node<T> current = getNode(index);

            if (index == 0) {
                temp.setNext(head);
                head = temp;
                size++;
            } else {
                temp.setNext(current.getNext());
                current.setNext(temp);
                size++;
            }
        }
    }

    public void add(T data) {
        add(data, size);
    }

    public T removeFirst() {
        if (size == 0)
            return (T) "No such element.";
        else {
            T temp = head.getData();
            head = head.getNext();
            size--;
            return temp;
        }
    }

    public T removeLast() {
        if (size <= 1)
            return removeFirst();
        else {
            Node<T> tmp = head;
            while (tmp.getNext().getNext() != null)
                tmp = tmp.getNext();
            T temp = tmp.getNext().getData();
            tmp.setNext(null);
            size--;
            return temp;
        }
    }

    private void removeFirst(T data) {
        Node<T> tmp = head;
        for (int i = 0; i < size; i++, tmp = tmp.getNext())
            if (tmp.getData().equals(data)) {
                remove(i);
                return;
            }
    }


    public T remove(int index){
        try {
            if (checkElementIndex(index) == 0) {
                if (index == 0)
                    removeFirst();
                else {
                    Node<T> tmp = head;
                    for (int i = 0; i < index - 1; i++)
                        tmp = tmp.getNext();
                    tmp.setNext(tmp.getNext().getNext());
                    size--;
                }
            }
        } catch (Exception e) {
            System.out.println("Unable to remove.");
        }
        return null;
    }

    public void remove(T data) {
        try{
            removeFirst(data);
        }catch(Exception e){
            System.out.println("Unable to remove.");
        }
    }

    public T remove() {
        return removeLast();
    }

    public void clear() {
        head = null;
        size = 0;
    }


    public void set(int index, T newData) {
        if (checkElementIndex(index) == 0){
            Node<T> tmp = head;
            for (int i = 0; i < index; i++)
                tmp = tmp.getNext();
            tmp.setData(newData);
        } else System.out.println("Invalid index.");
    }


    public boolean contains(T data) {
        for (Node<T> currentNode = head; currentNode != null; currentNode = currentNode.getNext()) {
            if (currentNode.getData().equals(data)) {
                return true;
            }
        }
        return false;
    }

    public LinkedListGeneric<T> fillList(T t[], LinkedListGeneric<T> list){
        for (int i = 0; i < t.length; i++) {
            list.add(t[i]);
        }
        return list;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();

        Node<T> current = head;

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


class Node<T>{
    private T data;
    private Node<T> next;

    public Node(T value) {
        this.data = value;
    }

    public Node() {
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getNext() {
        return next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}