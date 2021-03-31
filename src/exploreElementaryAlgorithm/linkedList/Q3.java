package exploreElementaryAlgorithm.linkedList;

/**
 * @author singlee
 * @create 2020-04-28-21:40
 * 反转链表
 */



public class Q3 {
    public ListNode reverseList(ListNode head) {

        ListNode c=head;
        ListNode pre=null;
        while (c!=null){
            ListNode nc=c.next;
            c.next=pre;
            pre=c;
            c=nc;
        }

        return pre;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
