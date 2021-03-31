package exploreElementaryAlgorithm.linkedList;

/**
 * @author singlee
 * @create 2020-04-28-21:40
 * 合并两个有序链表
 */



public class Q4 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }else if(l2==null){
            return l1;
        }else if(l1.val<l2.val){
            l1.next= mergeTwoLists(l1.next,l2);
            return l1;

        }else {
            l2.next= mergeTwoLists(l1,l2.next);
            return l2;
        }
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
