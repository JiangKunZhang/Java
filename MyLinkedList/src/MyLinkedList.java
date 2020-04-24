
/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/24 13:17
 */

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class MyLinkedList {
    //保存头结点的引用
    public Node head = null;

    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        //头为空说明这是空链表
        if (this.head == null) {
            this.head = node;
            return;
        }
        node.next = this.head;
        this.head = node;
    }

    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        //头为空说明这是空链表
        if (this.head == null) {
            this.head = node;
            return;
        }
        //找到最后一个节点
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    //查找index位置的前一个节点
    public Node searchIndex(int index) {
        //对index合法性进行判断
        if (index < 0 || index > this.size()) {
            throw new RuntimeException("index位置非法");
        }
        Node cur = this.head;
        while ((index-1) != 0) {//走index-1次
            cur = cur.next;
            index--;
        }
        return cur;
    }

    //任意位置插入，第一个数据节点为0号下标
    public void addIndex(int index,int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == this.size()) {
            addLast(data);
            return;
        }
        Node node = new Node(data);
        //先找到  index位置的前一个节点的地址
        Node prev = searchIndex(index);
        //开始插入
        node.next = prev.next;
        prev.next = node;
    }

    //链表的长度
    public int size() {
        int count = 0;
        Node cur = this.head;
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }

    //查找是否包含关键字key在单链表中
    public boolean contains(int key) {
        Node cur = this.head;
        while (cur != null) {
            if(cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //查找关键字key的前驱
    public Node findPrev(int key) {
        Node prev = this.head;
        while (prev.next != null) {
            if (prev.next.data == key) {
                return prev;
            }else{
                prev = prev.next;
            }
        }
        return null;
    }

    //删除第一次出现关键字为key的节点
    public void romove(int key) {
        //单链表为空，不用删除了
        if (this.head == null) {
            return ;
        }
        //删除的是不是头节点
        if (this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        //找到先驱节点
        Node prev = findPrev(key);
        if (prev == null) {
            System.out.println("你要删除的节点就不存在！");
            return;
        }
        //开始删除
        Node del = prev.next;//del是要删除的节点
        prev.next = del.next;
    }

    //删除所有节点为key的节点
    public void romoveAllKey(int key) {
        Node prev = this.head;
        Node cur = prev.next;//代表要删除的节点
        //先不考虑头节点是不是要删除的
        while (cur != null) {
            //等于key就删除
            if (cur.data == key) {
                prev.next = cur.next;//删除
                cur = cur.next;//cur后移
            }else {//不等于
                prev = cur;//prev跳到cur这里
                cur = cur.next;//cur后移
            }
        }
        //最后考虑头节点是不是要删除的
        if(this.head.data == key) {
            this.head = this.head.next;
        }
    }

    //打印单链表
    public void display() {
        Node node = this.head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    //释放内存
    public void clear() {
        this.head = null;
    }
}
