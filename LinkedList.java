class Node {
    int data;
    Node next;

    // Constructor to create a new node with given data
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    private Node head;

    // Constructor to initialize an empty linked list
    LinkedList() {
        this.head = null;
    }

    // Method to insert a new node at the beginning of the linked list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        System.out.print("Linked list: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert some nodes at the beginning
        list.insertAtBeginning(3);
        list.insertAtBeginning(7);
        list.insertAtBeginning(9);

        // Print the linked list
        list.printList();
    }
}
