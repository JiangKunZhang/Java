/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/30 10:06
 */
public class HashBuck {
    static class Node {
        public int key;
        public int val;
        public Node next;
        public Node (int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    public Node[] array = new Node[10];
    public int usedSize = 0;

    public void put(int key, int val) {
        int index = key % this.array.length;
        Node cur = this.array[index];
        //看看存不存在更换（相同的key）
        while (cur != null) {
            if (cur.key == key) {
                cur.val = val;
                return;
            }
            cur = cur.next;
        }
        //尾插法
        Node node = new Node(key,val);
        if (this.array[index] == null) {
            this.array[index] = node;
            this.usedSize++;
            return;
        }
        Node tmp = this.array[index];
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = node;
        this.usedSize++;
        //看负载因子需不需要扩容
        if (loadFactor() > 0.75) {
            resize();
        }
    }

    public double loadFactor() {
        return (this.usedSize * 1.0) / this.array.length;
    }

    public void resize() {
        Node[] newArray = new Node[this.array.length * 2];
        for (int i = 0; i < this.array.length; i++) {
            Node cur = this.array[i];
            while (cur != null) {
                int newIndex = cur.key % newArray.length;
                if (newArray[newIndex] == null) {
                    newArray[newIndex] = cur;
                }else {
                    Node tmp = newArray[newIndex];
                    while (tmp.next != null) {
                        tmp = tmp.next;
                    }
                    tmp.next = cur;
                }
                cur = cur.next;
            }
        }
        this.array = newArray;
    }

    public int get(int key) {
        int index = key % this.array.length;
        Node cur = this.array[index];
        while (cur != null) {
            if (cur.key == key) {
                return cur.val;
            }
            cur = cur.next;
        }
        return -1;
    }

    public static void main(String[] args) {
        HashBuck hashBuck = new HashBuck();
        for (int i = 1; i < 8; i++) {
            hashBuck.put(i,i);
        }
        hashBuck.put(11,101);
        hashBuck.put(12,102);
        System.out.println(hashBuck.get(11));
    }

}
