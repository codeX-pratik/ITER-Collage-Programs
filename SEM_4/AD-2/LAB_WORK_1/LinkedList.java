public class LinkedList {
    
    private static class Node {
        int val;
        Node next;

        private Node(int v) {
            val = v;
            next = null;
        }
    }

    private Node head;
    @SuppressWarnings("unused")
    private int size = 0;

    LinkedList() {
        head = null;
        size = 0;
    }

    public void addHead(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public void addTail(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void print() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    public void deleteKth(int target) {
        if (target <= 0) {
            System.out.println("Invalid Position");
            return;
        } else if (target == 1) {
            head = head.next;
        }
        Node firstNode = head;
        Node secondNode = head.next;
        int c = 1;
        while (secondNode != null) {
            if (target == ++c) {
                break;
            }
            firstNode = firstNode.next;
            secondNode = secondNode.next;
        }
        firstNode.next = secondNode.next;
    }

    public Node sumTwoList(Node l1, Node l2) {
        LinkedList list = new LinkedList();
        while (l1 != null || l2 != null) {
            int ans = 0;
            if (l1 != null) {
                ans += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                ans += l2.val;
                l2 = l2.next;
            }
            list.addTail(ans);
        }
        return list.head;
    }



    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.addTail(10);
        l1.addTail(20);
        l1.addTail(30);
        l1.addTail(40);
        l1.addTail(50);
        l1.addTail(60);
        System.out.print("List 1 : ");
        l1.print();
        System.out.println();

        LinkedList l2 = new LinkedList();
        l2.addTail(10);
        l2.addTail(20);
        l2.addTail(30);
        l2.addTail(200);
        l2.addTail(40);
        l2.addTail(50);
        l2.addTail(60);
        l2.addTail(70);
        l2.addTail(80);
        System.out.print("List 2 : ");
        l2.print();
        System.out.println();


        // For deleting the target Node in linked list
        l2.deleteKth(4);
        System.out.print("After deleting target element\nList 2 : ");
        l2.print();
        System.out.println();
        

        // sum of two list
        LinkedList l3 = new LinkedList();
        l3.head = l3.sumTwoList(l1.head, l2.head);
        System.out.print("List 3 : ");
        l3.print();
    }
}
