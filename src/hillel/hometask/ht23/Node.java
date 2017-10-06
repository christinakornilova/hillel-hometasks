package hillel.hometask.ht23;

public class Node {
    private String data;
    private Node next;

    public Node(String data) {
        this(data, null);
    }

    public Node(String data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node() {
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return this.data;
    }

    public Node getNext() {
        return this.next;
    }


}
