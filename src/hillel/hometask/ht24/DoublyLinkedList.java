package hillel.hometask.ht24;

/*
Реализовать структуру данных очередь для данных типа String и методы этой структуры
(poll, add, peek) на основе двусвязного списка(doubleLinkedList).
 */

import java.util.NoSuchElementException;

public class DoublyLinkedList {
    private DoublyLinkedNode head;
    private DoublyLinkedNode tail;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    private class DoublyLinkedNode {

        private String data;
        private DoublyLinkedNode next;
        private DoublyLinkedNode prev;

        public DoublyLinkedNode(String data, DoublyLinkedNode next, DoublyLinkedNode prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public int size() { return size; }

    public boolean isEmpty() { return size == 0; }

    //add: offerLast and offerFirst
    public void addFirst(String data){
        DoublyLinkedNode tmp = new DoublyLinkedNode(data, head, null);
        addFirst(tmp);
    }

    public void addFirst(DoublyLinkedNode node) {
        if(head != null ) {head.prev = node;}
        head = node;
        if(tail == null) { tail = node;}
        size++;
        System.out.println("Adding: "+node.data);
    }


    public void addLast(String data){
        DoublyLinkedNode tmp = new DoublyLinkedNode(data,null,tail);
        addLast(tmp);
    }

    public void addLast(DoublyLinkedNode node){
        if(tail != null) {tail.next = node;}
        tail = node;
        if(head == null) { head = node;}
        size++;
        System.out.println("Adding: "+node.data);
    }

    //poll: pollLast and pollFirst
    public DoublyLinkedNode removeFirst() {
        if (size == 0) throw new NoSuchElementException();
        DoublyLinkedNode tmp = head;
        head = head.next;
        head.prev = null;
        size--;
        System.out.println("Deleted: "+tmp.data);
        return tmp;
    }

    public DoublyLinkedNode removeLast() {
        if (size == 0) throw new NoSuchElementException();
        DoublyLinkedNode tmp = tail;
        tail = tail.prev;
        tail.next = null;
        size--;
        System.out.println("Deleted: "+tmp.data);
        return tmp;
    }




    //peek: peekLast and peekFirst
    public void iterateForward(){
        DoublyLinkedNode tmp = head;
        while(tmp != null){
            System.out.print(" ["+tmp.data+"] ");
            tmp = tmp.next;
        }
    }

    public void iterateBackward(){
        DoublyLinkedNode tmp = tail;
        while(tmp != null){
            System.out.print(" ["+tmp.data+"] ");
            tmp = tmp.prev;
        }
    }



}
