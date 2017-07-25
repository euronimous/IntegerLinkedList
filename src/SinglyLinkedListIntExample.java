public class SinglyLinkedListIntExample {
    public static void main(String[] args) {
        IntegerLinkedList intLinkedList = new IntegerLinkedList();
        intLinkedList.append(33);
        intLinkedList.append(11);
        intLinkedList.append(15);
        intLinkedList.append(21);
        intLinkedList.append(17);
        intLinkedList.append(18);
        intLinkedList.append(20);
        intLinkedList.append(22);
        intLinkedList.displayLinkedList();

        intLinkedList.removeNodeGreaterThanValue(25);
        intLinkedList.displayLinkedList();

        intLinkedList.removeTail();

        intLinkedList.displayLinkedList();

        intLinkedList.removeNodeGreaterThanValue(18);

        intLinkedList.displayLinkedList();
//
//        intLinkedList.removeFromIndexToTail(1);
//
//        intLinkedList.displayLinkedList();

    }
}
