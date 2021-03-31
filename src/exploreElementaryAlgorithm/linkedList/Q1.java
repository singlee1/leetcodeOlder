package exploreElementaryAlgorithm.linkedList;

/**
 * @author singlee
 * @create 2020-04-25-20:53
 * 删除链表中的节点
 */
public class Q1 {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;


    }

    public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
    }
}
