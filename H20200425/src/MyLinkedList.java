import java.util.List;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/4/25 13:05
 */

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MyLinkedList {

    //保存头节点的引用
    public ListNode head;

    //实现头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        //如果头节点是空的，直接让这个节点成为头节点
        if (this.head == null) {
            this.head = node;
            return;
        }
        node.next = this.head;
        this.head = node;
    }

    //实现尾插法
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        //如果头节点是空的，直接让这个节点成为头节点
        if(this.head == null) {
            this.head = node;
            return;
        }
        //找到最后一个节点
        ListNode cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        //插入
        cur.next = node;
    }

    //打印链表
    public void display() {
        ListNode node = this.head;
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    //得到链表的长度
    public int size() {
        int count = 0;
        ListNode node = this.head;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }

    //在index的前驱
    private ListNode searchIndex(int index) {
        //判断index的合法性
        if (index < 0 || index > this.size()) {
            throw new RuntimeException("index非法");
        }

        ListNode node = this.head;
        while ((index - 1) != 0) {
            node = node.next;
            index--;
        }
        return node;
    }

    //在index插入
    public void addIndex(int index,int data) {
        //index=0就是头插
        if (index == 0) {
            this.addFirst(data);
            return;
        }
        //index=size就是尾插
        if (index == this.size()) {
            this.addLast(data);
            return;
        }
        ListNode prev = searchIndex(index);
        ListNode node = new ListNode(data);
        node.next = prev.next;
        prev.next = node;
    }

    //看是否包含key
    public boolean contains(int key) {
        ListNode node = this.head;
        while (node != null) {
            if (node.val == key) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

    //查找要删除的前驱
    private ListNode searchPrev(int key) {
        ListNode prev = this.head;
        while (prev.next != null) {
            if (prev.next.val == key) {
                return prev;
            }
            prev = prev.next;
        }
        return null;
    }

    //删除第一次出现的关键字为key的节点
    public void romove(int key) {
        //判断链表是否为空
        if (this.head == null) {
            throw new RuntimeException("链表为空");
        }
        //判断是不是删除头节点
        if (this.head.val == key) {
            this.head = this.head.next;
            return;
        }
        //找到要删除的节点的前驱
        ListNode prev = searchPrev(key);
        if (prev == null) {
            throw new RuntimeException("要删除的节点不存在");
        }
        //要删除了
        ListNode del = prev.next;//del是要删除的节点
        prev.next = del.next;

    }

    //删除所有关键字为key的节点
    public void romoveAllKey(int key) {
        if (this.head == null) {
            return;
        }
        ListNode prev = this.head;
        ListNode cur = prev.next;
        while (cur != null) {
            if (cur.val == key) {
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }
        if (this.head.val == key) {
            this.head = this.head.next;
        }
    }

    //释放内存
    public void clear() {
        this.head =null;
    }

    //判断链表是否有环
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast ==slow) {
                return true;
            }
        }
        return false;
    }

    //返回链表入环第一个节点
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                break;
            }
        }

        //判断循环结束的原因，如果是fast==null || fast.next==null就不存在环，直接return
        if (fast == null || fast.next == null) {
            return null;
        }

        //slow从头开始走，fast继续走，相遇就是入环点
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    //找到两个链表的第一个公共节点
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //先定义两个节点，假设pL为长的，pS为短的
        ListNode pL = headA;
        ListNode pS = headB;
        int lenA = 0;
        int lenB = 0;
        ListNode cur = pL;//cur用来保存每个头节点
        //计算pL长度
        while (cur != null) {
            lenA++;
            cur = cur.next;
        }
        cur = pS;//cur用来保存每个头节点
        //计算pL长度
        while (cur != null) {
            lenB++;
            cur = cur.next;
        }
        //判断之前假设的长短是否正确，不正确就进行调换
        int len = lenA - lenB;//计算长的长多少
        if (len < 0) {
            len = lenB - lenA;//计算长的长多少
            pL = headB;
            pS = headA;
        }
        //让长的链表先往后走，走到一样长
        while (len != 0) {
            pL = pL.next;
            len--;
        }
        //此时在同一起跑线，一起往后走
        while (pL != pS && pL != null && pS != null) {
            pL = pL.next;
            pS = pS.next;
        }
        //判断上一个循环结束是因为什么，如果两个都不为空，就是说明两个相等，返回;
        if (pL != null && pS != null) {
            return pL;
        }
        //否则就是两个链表不相交
        return null;
    }

    //判断链表是否为回文结构
    public boolean chkPalindrome(ListNode A) {
        // write code here
        //如果链表为空那么不是回文
        if (A == null) {
            return false;
        }
        //如果只有一个节点那么就是回文，头节点后面没有节点就是只有一个
        if (A.next == null) {
            return true;
        }

        //找到中间节点slow
        ListNode fast = A;
        ListNode slow = A;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        //从slow开始进行反转链表
        ListNode cur = slow.next;
        while (cur != null) {
            ListNode curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }

        //从前往后，从后往前走，中间没return就说明都相等
        while (slow != A) {
            //不相等return false
            if (slow.val != A.val) {
                return false;
            }
            //判断偶数情况
            if (A.next == slow) {
                return true;
            }
            //slow往前走，A往后走
            slow =slow.next;
            A = A.next;
        }
        return true;
    }

    //删除链表中等于给定值 val 的所有节点
    public ListNode removeElements(ListNode head, int val) {
        //如果头为空直接就返回空
        if (head == null) {
            return null;
        }
        //定义两个节点先从除了头节点以外的进行删除
        ListNode prev = head;
        ListNode cur = prev.next;//代表要删除的节点
        while (cur != null) {
            if (cur.val == val) {
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }
        //看一下头节点需要删除不
        if (head.val == val) {
            head = head.next;
        }
        return head;
    }

    //分割链表
    public ListNode partition(ListNode pHead, int x) {
        //定义两个线段
        ListNode bs = null;
        ListNode be = null;
        ListNode as = null;
        ListNode ae = null;
        ListNode cur = pHead;//cur遍历整个链表
        while (cur != null) {
            //小于的放在before
            if (cur.val < x) {
                //第一次插
                if (bs == null) {
                    bs = cur;
                    be = cur;
                }else {
                    be.next = cur;
                    be = be.next;
                }
            }else {//否则就在after
                //第一次插
                if (as == null) {
                    as = cur;
                    ae = cur;
                }else {
                    ae.next = cur;
                    ae = ae.next;
                }
            }
            cur = cur.next;
        }
        //before里面没有东西，全在after
        if (bs == null) {
            //也不用把ae.next置为null
            return as;
        }else {
            //否则进行拼接
            be.next = as;
            //如果after里面有东西，即as != null,把ae.next置为null
            if (as != null) {
                ae.next = null;
            }
            //返回拼接后的
            return bs;
        }
    }

    //合并两个有序链表
    public ListNode mergeTwoLists(ListNode headA, ListNode headB) {
        //定义一个虚拟头节点，不动
        ListNode newHead = new ListNode(-1);
        //往后动，相当于尾巴
        ListNode temp = newHead;
        //都不为空就进入循环，插进去
        while (headA != null && headB != null) {
            if (headA.val < headB.val) {
                temp.next = headA;
                headA = headA.next;
                temp = temp.next;
            }else {
                temp.next = headB;
                headB = headB.next;
                temp = temp.next;
            }
        }
        //如果headA空了，把headB剩下的插进来
        if (headA == null) {
            temp.next = headB;
        }
        //如果headB空了，把headA剩下的插进来
        if (headB == null) {
            temp.next = headA;
        }
        //返回虚拟节点的下一个节点
        return newHead.next;
    }

    //输出链表倒数第k个节点
    public ListNode FindKthToTail(ListNode head,int k) {
        //如果头节点为空就直接return
        if (head == null) {
            return null;
        }
        //定义快慢节点
        ListNode fast = head;
        ListNode slow = head;
        //快的走n-1步
        while (k-1 != 0) {
            //还没走n-1步呢，就是空，那就是不存在
            if (fast.next != null) {
                //fast先走k-1步
                fast = fast.next;
                k--;
            }else {
                return  null;//这个节点不存在
            }
        }
        //此时fast和slow一起走，fast.next == null的时候，slow就是倒数第k个节点
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    //返回链表的中间节点
    public ListNode middleNode(ListNode head) {
        //定义快慢节点
        ListNode fast = head;
        ListNode slow = head;
        //如果fast == null || fast.next == null就终止循环
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //返回slow
        return slow;
    }

    //反转链表
    public ListNode reverseList(ListNode head) {
        //定义四个节点，cur不为空的时候再定义curNext
        ListNode prev = null;
        ListNode cur = head;
        ListNode newHead = null;
        while (cur != null) {
            ListNode curNext = cur.next;
            //如果cur.next == null，就是新的头节点，保存下来
            if (cur.next == null) {
                newHead = cur;
            }
            cur.next = prev;//先把cur.next指向先驱
            prev = cur;//先驱挪到后面一个
            cur = curNext;//cur也往后挪一个

        }
         return newHead;
    }

    //删除链表中重复的节点，重复的节点不保留
    public ListNode deleteDuplication(ListNode pHead) {
        ListNode newHead = new ListNode(-1);//定义虚拟节点
        ListNode temp = newHead;//保存尾部
        ListNode cur = pHead;
        //遍历完整个链表
        while (cur != null) {
            //如果重复
            if (cur.next != null &&(cur.val == cur.next.val)) {
                //如果连续重复
                while (cur.next != null &&(cur.val == cur.next.val)) {
                    cur = cur.next;
                }
                //把重复的节点也删掉，重复的节点不保留
                cur = cur.next;//多走一步
            }else {//否则不重复就往temp后面插
                temp.next = cur;
                temp = cur;
                cur = cur.next;
            }
        }
        //手动把最后的尾巴置为空
        temp.next = null;
        //返回头节点
        return newHead.next;
    }
}
