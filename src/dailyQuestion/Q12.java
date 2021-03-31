package dailyQuestion;

import java.util.List;

/**
 * @author singlee
 * @create 2021-03-30-15:56
 * 反转链表
 */
public class Q12 {
    /*
    * 如果用递归的方式解决
    *   1.对传入参数head做简单判断
    *   2.base case
    *   3.进行递归
    *   4.每层都返回新的头结点
    * */
    public ListNode reverseList(ListNode head) {
        //base case
        if(head==null||head.next==null){
            return head;
        }

        ListNode last=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return last;

    }

    //用迭代的方法
    public ListNode reverseList1(ListNode head) {
        ListNode pre=null;
        ListNode cur=head;
        while (cur!=null){
            ListNode nxt=cur.next;
            cur.next=pre;
            pre=cur;
            cur=nxt;
        }
        return pre;
    }

}