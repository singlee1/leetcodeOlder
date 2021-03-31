package dailyQuestion;

/**
 * @author singlee
 * @create 2021-03-08-21:24
 * 回文链表
 */
public class Q11 {
    ListNode l;
    public boolean isPalindrome(ListNode head) {
        l=head;
        return reverse(head);
    }

    //模拟链表的倒序遍历
    public boolean reverse(ListNode right){
        //base case
        if(right == null){
            return true;
        }

        Boolean rst = reverse(right.next);

        rst=rst&&(right.val==l.val);
        l=l.next;
        return rst;
    }


}
