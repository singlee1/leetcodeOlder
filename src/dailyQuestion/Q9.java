package dailyQuestion;

/**
 * @author singlee
 * @create 2021-03-05-22:37
 *反转链表 II
 */
public class Q9 {
    ListNode tmp=null;
    public ListNode reverseBetween(ListNode head, int left, int right) {
        //base case
        if(left==1){
            return reverse(head,right);
        }
        //前进
        head.next=reverseBetween(head.next,left-1,right-1);
        return head;
    }

    public ListNode reverse(ListNode head,int m){

        if(m==1){
            tmp=head.next;
            return head;
        }
        ListNode last=reverse(head.next,m-1);
        head.next.next=head;
        head.next=tmp;

        return last;
    }

}
