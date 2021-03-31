package exploreElementaryAlgorithm.linkedList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author singlee
 * @create 2020-05-02-21:26
 * 环形链表
 */
public class Q6 {

    public boolean hasCycle(ListNode head) {
        Set<ListNode> nodeSet=new HashSet<>();
        while(head!=null){
            if(nodeSet.contains(head)){
                return true;
            }else {
                nodeSet.add(head);

            }
            head=head.next;
        }
        return false;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
