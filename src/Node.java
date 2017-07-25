public class Node {
    Node next;
    int data;

    public Node(int data) {
        this(data, null);
    }

    public Node(int data, Node next) {
        this.next = next;
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node next() {
        return this.next;
    }
    public void printNode(){
        System.out.print( data + " ");
    }
}
