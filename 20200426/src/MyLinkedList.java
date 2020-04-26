/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/26 18:48
 */

class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node(int data) {
        this.data = data;
    }
}
public class MyLinkedList {
    Node head = null;
    Node tail = null;

    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        }else {
            node.next = this.head;
            this.head.prev = node;
            head = node;
        }
    }

    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        }else {
            this.tail.next = node;
            node.prev = this.tail;
            this.tail = node;
        }
    }

    //查看是否包含关键字key
    public boolean contains(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //index合法性判断
    private void checkIndex(int index) {
        if(index < 0 || index > size()) {
            throw new RuntimeException("index不合法");
        }
    }

    //查找index
    private Node searchIndex(int index) {
        Node cur = this.head;
        while (index != 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }

    //在任意位置插入
    public void addIndex(int index,int data) {
        //合法性判断
        checkIndex(index);
        //是否是头插
        if (index == 0) {
            addFirst(data);
            return;
        }
        //是否是尾插
        if (index == this.size()) {
            addLast(data);
            return;
        }

        Node cur = searchIndex(index);
        Node node = new Node(data);
        //开始插入
        node.next = cur;
        node.prev = cur.prev;
        cur.prev.next = node;
        cur.prev = node;

    }

    //删除第一次出现的key
    public int remove(int key){
        Node cur = this.head;
        while (cur != null) {
            if(cur.data == key) {
                int oldData = cur.data;
                //删除头节点
                if(cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                }else {//不是头节点
                    cur.prev.next = cur.next;
                    //如果cur.next != null 那就不是尾节点
                    if (cur.next != null) {
                        cur.next.prev = cur.prev;
                    }else {//否则是尾节点，把尾节点前移
                        this.tail = cur.prev;
                    }
                }
                return oldData;
            }
            cur = cur.next;
        }
        return -1;
    }

    //删除所有key
    public int removeAllKey(int key){
        Node cur = this.head;
        while (cur != null) {
            if(cur.data == key) {
                //删除头节点
                if(cur == this.head) {
                    this.head = this.head.next;
                    if (this.head != null) {
                        this.head.prev = null;
                    }
                }else {//不是头节点
                    cur.prev.next = cur.next;
                    //如果cur.next != null 那就不是尾节点
                    if (cur.next != null) {
                        cur.next.prev = cur.prev;
                    }else {//否则是尾节点，把尾节点前移
                        this.tail = cur.prev;
                    }
                }
            }
            cur = cur.next;
        }
        return -1;
    }
    //计算长度
    public int size() {
        Node cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    //打印双向链表
    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    /**
     * 一个一个节点进行释放了
     */
    public void clear(){
        //this.head = null;
        while(this.head != null) {
            Node cur = this.head.next;
            this.head.prev = null;
            this.head.next = null;
            this.head = cur;
        }
        this.tail = null;
    }
}
