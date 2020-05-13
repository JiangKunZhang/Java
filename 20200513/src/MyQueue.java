/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/13 19:34
 */

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class MyQueue {
    public Node front;//头
    public Node rear;//尾
    public int usedSize;

    //入队
    public boolean offer(int val) {
        Node node = new Node(val);
        if (this.front == null) {
            this.front = node;
            this.rear = node;
        }else {
            this.rear.next = node;
            this.rear = this.rear.next;
        }
        this.usedSize++;
        return true;
    }

    public boolean isEmpty() {
        return this.usedSize == 0;
    }

    public int poll() {
        if (this.isEmpty()) {
            throw new RuntimeException("队空！");
        }
        int data = this.front.data;
        this.front = this.front.next;
        return data;
    }

    public int peek() {
        if (this.isEmpty()) {
            throw new RuntimeException("队空！");
        }
        return this.front.data;
    }

    public int size() {
        return this.usedSize;
    }
}
