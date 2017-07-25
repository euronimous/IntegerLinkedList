public class IntegerLinkedList{
    private Node head;
    private Node tail;
    private int size;

    public IntegerLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insert(int data, int index) {
        if (index > size) {
            throw new IndexOutOfBoundsException("index " + index + " is greater then current size");
        } else {
            Node temp = new Node(data);
            if (index == 0) {
                temp.setNext(head);
                head = temp;
            } else {
                Node current = getNode(index);
                temp.setNext(current.next());
                current.setNext(temp);
            }
            if ( index == size - 1 ) {
                tail.setNext(temp);
                tail = temp;
            }
        }
        size ++;
    }

    public void append(int data) {
        insert(data, size);
    }

    public void removeTail() {
        remove(size);
    }

    public void removeFromIndexToTail(int index) {
        this.size = index;
        this.tail = getNode(index);
        this.tail.setNext(null);
    }

    public void removeNodeGreaterThanValue(int data){
        Node current = head;
        int i = 1;
        while (current != null){
            if (current.data > data){
                remove(i);
            }else{
                i++;
            }
            current = current.next();
        }
    }

    public void remove(int index) {
        if ((index > size) || (index < 0)){
            throw new IndexOutOfBoundsException("index " + index + " is greater then current size");
        }
        if (index == 1) {
            Node q = head;
            head = q.next();
        } else if ( index == size ) {
           getNode(index - 1).setNext(null);
        } else{
            getNode(index - 1).setNext(getNode(index).next());
        }

        this.size--;

    }

    public Node getNode(int index) {
        if (index > size) {
            throw new IndexOutOfBoundsException("index " + index + " is greater then current size");
        }
        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.next();
        }

        return current;
    }

    public void displayLinkedList() {
        System.out.print(" LinkedList [first--->last]: ");
        Node tempDisplay = head; // start at the beginning of linkedList
        while (tempDisplay != null){ // Executes until we don't find end of list.
            tempDisplay.printNode();
            tempDisplay = tempDisplay.next; // move to next Node
        }
        System.out.println();

    }
}
