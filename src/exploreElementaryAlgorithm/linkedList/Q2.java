package exploreElementaryAlgorithm.linkedList;

import java.util.List;

/**
 * @author singlee
 * @create 2020-04-25-21:19
 * 删除链表的倒数第N个节点
 *
 */
public class Q2 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;

        ListNode n1=dummy;
        ListNode n2=dummy;

        int i=0;

        while(n1!=null){
            n1=n1.next;
            i++;
            if(i>=n+1){
                n2=n2.next;
            }


        }
        n2.next=n2.next.next;



        return dummy.next;
    }



    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
