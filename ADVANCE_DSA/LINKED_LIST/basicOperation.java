package DSA2.ADVANCE_DSA.LINKED_LIST;

// Insertion at the end
public class basicOperation {
    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    Node head;

    public void insertAtBeginning(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;

    }

    public void insertAtEnding(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
    }

    // 3. Insertion at a specific position
    public void insertAtPosition(int value, int position) {
        if (position < 1) {
            System.out.println("Invalid index");
            return;
        }

        Node newNode = new Node(value);
        if (position == 1) {
            // insert at begining
            newNode.next = head;
            head = newNode;
            return;
        }
        // initial list: 36 -> 9 -> 17 -> 3 -> 24 -> 67 -> null
        // after insertion: 36 -> 9 -> 17 -> 3 -> 24 -> 100 -> 67 -> null, position = 6
        Node current = head;
        for (int i = 1; i < position - 1; i++) {
            current = current.next;
        }
        // System.out.println("current:" + current.value);
        newNode.next = current.next;
        current.next = newNode;

    }

    // 4. Deletion from the beginning
    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        head = head.next;
    }

    // 5. Deletion from the end
    public void deleteFromEnding() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    // 36 -> 9 -> 17 -> 3 -> 24 -> 100 -> null, position = 3
    // 6. Deletion of a specific element
    public void deleteFromPosition(int position) {
        Node current = head;
        for (int i = 1; i < position - 1; i++) {
            current = current.next;
        }

        Node frontNext = current.next.next;
        current.next = frontNext;

    }

    // 7. Searching for an element
    public void search(int value) {
        boolean isPresent = false;
        Node current = head;
        while (current != null) {
            if (current.value == value) {
                isPresent = true;
                System.out.println("true");
                return;
            }

            current = current.next;
        }
        if (!isPresent) {
            System.out.println("false");
        }

    }

    // 8. priniting the list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.print("null");
    }

    // 9. Get the size of the list
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        System.out.println("size of list is " + count);
        return count;
    }

    // 10. Reverse the list
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }

        head = prev;
    }

    // prev temp front
    public void reverse2() {
        Node prev = null;
        Node temp = head;
        while (temp != null) {
            Node front = temp.next;
            temp.next = prev;

            // update
            prev = temp;
            temp = front;

        }

        head = prev;
    }

    public static void main(String[] args) {
        basicOperation list = new basicOperation();
        list.insertAtBeginning(24);
        list.insertAtBeginning(3);
        list.insertAtBeginning(17);
        list.insertAtBeginning(9);
        list.insertAtBeginning(36);
        list.insertAtEnding(67);
        list.insertAtPosition(100, 6);
        // list.deleteFromBeginning();
        // list.deleteFromEnding();
        list.deleteFromPosition(3);
        // list.search(17);
        list.size();
        list.printList();
        System.out.println();
        // list.reverse2();

        list.printList();
        System.out.println();
    }

}
