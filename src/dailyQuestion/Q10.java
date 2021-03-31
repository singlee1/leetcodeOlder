package dailyQuestion;

/**
 * @author singlee
 * @create 2021-03-07-10:55
 *  K 个一组翻转链表
 */
public class Q10 {


    /*
    *   在翻转m到n区间的链表的基础上进行
    * */
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null) return null;
        //整个链表的区间用 a,b表示
        ListNode a=head,b=head;
        for(int i=0;i<k;i++){
            if(b==null) return head;
            b=b.next;
        }

        //反转前K个元素
        ListNode newHead=reverse(a,b);


        a.next=reverseKGroup(b,k);
        return newHead;

    }


    //翻转一个链表的m到n间的部分【采用迭代实现】
    public ListNode reverse(ListNode a,ListNode b){
        ListNode pre=null,cur=a,nxt=a;

        while(cur!=b){
            nxt=cur.next;
            cur.next=pre;
            pre=cur;
            cur=nxt;
        }
        return pre;
    }

}
