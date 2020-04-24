/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/20 19:29
 */

class Node {
    int data;
    Node next;
    public Node (int data) {
        this.data = data;
        this.next = null;
    }
}

//不带头节点的单链表
public class MyLinkedList {
    public Node head; //保存单链表的头节点的引用

    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
            return;
        }
        node.next = this.head;
        this.head = node;
    }

    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        Node cur = this.head;
        if(this.head == null) {
            this.head = node;
            return;
        }
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){

        if(index == 0) {
            this.addFirst(data);
            return;
        }
        if(index == this.size()) {
            this.addLast(data);
            return;
        }
        Node node = new Node(data);
        //先找到  index位置的前一个节点的地址
        Node cur = searchIndex(index);
        //进行插入
        node.next = cur.next;
        cur.next = node;
    }

    private Node searchIndex(int index) {
        //1、对index进行合法性检查
        if(index < 0 ||index > this.size()) {
            throw new RuntimeException("index位置不合法！");
        }
        Node cur = this.head;//index-1
        while ((index - 1) != 0) {
            cur = cur.next;
            index--;
        }
        return cur;

    }

    //查找是否包含关键字key是否在单链表中
    public boolean contains (int key) {
        Node cur = this.head;
        while (cur != null) {
            if(key == cur.data) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //查找前驱
    private Node searchPrev(int key) {
        Node prev = this.head;
        while (prev.next != null) {
            if (prev.next.data == key) {
                return prev;
            }else {
                prev = prev.next;
            }
        }
        return null;
    }

    //删除第一次出现关键字为key的节点
    public void romove(int key) {
        //看头结点是不是为空
        if (this.head == null) {
            return;
        }
        //删除的是不是头节点
        if (this.head.data == key) {
            this.head = this.head.next;
        }
        //找到删除节点的前驱
        Node prev = searchPrev(key);
        if (prev == null) {
            System.out.println("根本没有这个节点！");
        }
        //开始删除
        Node del = prev.next;
        prev.next = del.next;
    }

    //删除所有值为key的节点
    public void romoveAllKey(int key) {
        //链表为空就不用删除，直接返回
        if (this.head == null) {
            return;
        }
        //Node prev = searchPrev(key);
        Node prev = this.head;
        Node cur = this.head.next;//代表要删除的节点
        while (cur != null) {
            if (cur.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = cur;
                cur = prev.next;
            }
        }
        if (this.head.data == key) {
            this.head = this.head.next;
        }
    }

    //得到单链表的长度
    public int size() {
        int count = 0;
        Node cur = this.head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    //打印单链表
    public void display(){
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        //System.out.print(cur.data);
    }

    //释放内存
    public void clear(){
        this.head = null;
    }

    //返回中间节点
    public Node middleNode() {
            Node fast = this.head;
            Node slow = this.head;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow;
    }
}
