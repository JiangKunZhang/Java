/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/13 23:45
 */
class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}
public class MyLinkedList {
    Node head = null;
    public MyLinkedList() {
        this.head = null;
    }

    private Node findPrev(int index) {
        Node node = this.head;
        while (index - 1 != 0) {
            node = node.next;
            index--;
        }
        return node;
    }

    private int size() {
        int size = 0;
        Node cur = this.head;
        while (cur != null) {
            cur = cur.next;
            size++;
        }
        return size;
    }

    public int get(int index) {
        if (index < 0 || index >= size()) {
            return -1;
        }
        Node node = this.head;
        while (index != 0) {
            node = node.next;
            index--;
        }
        return node.data;
    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        if (this.head == null) {
            this.head = node;
            return;
        }
        node.next = this.head;
        this.head = node;
    }

    public void addAtTail(int val) {
        Node node = new Node(val);
        if (this.head == null) {
            this.head = node;
            return;
        }
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > this.size()) {
            return;
        }
        if (index == 0) {
            addAtHead(val);
            return;
        }
        if (index == this.size()) {
            addAtTail(val);
            return;
        }
        Node prev = findPrev(index);
        Node node = new Node(val);
        node.next = prev.next;
        prev.next = node;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= this.size()) {
            return;
        }
        if (index == 0) {
            this.head = this.head.next;
            return;
        }
        Node prev = findPrev(index);
        prev.next = prev.next.next;
    }

    public void removeAllKey(int key) {
        Node prev = this.head;
        Node cur = prev.next;
        while (cur != null) {
            if (cur.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }
        if (this.head.data == key) {
            this.head = this.head.next;
        }
    }

    private Node searchPrev(int val) {
        Node prev = this.head;
        while (prev.next != null) {
            if (prev.next.data == val) {
                return prev;
            }
            prev = prev.next;
        }
        return null;
    }

    public void removeFirst(int val) {
        if (this.head == null) {
            return;
        }
        if (this.head.data == val) {
            this.head = this.head.next;
            return;
        }
        if (searchPrev(val) == null) {
            return;
        }
        Node prev = searchPrev(val);
        prev.next = prev.next.next;

    }

    public void clear() {
        this.head = null;
    }
}