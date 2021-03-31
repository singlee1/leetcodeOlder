package dailyQuestion;


/**
 * @author singlee
 * @create 2021-03-01-19:38
 */
public class RecursionList {
    public static ListNode reverse(ListNode head){
        if(head.next==null) return head;
        ListNode last = reverse(head.next);
        head.next.next=head;
        head.next=null;
        return last;
    }


    public static void main(String[] args) {
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(4);

        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=null;

        System.out.println(reverse(node1));

    }


}
class ListNode{
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    @Override
    public String toString() {
        return "val=" + val;
    }
}