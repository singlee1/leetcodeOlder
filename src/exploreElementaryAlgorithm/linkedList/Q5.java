package exploreElementaryAlgorithm.linkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author singlee
 * @create 2020-05-02-21:26
 * 回文链表
 */
public class Q5 {



    public boolean isPalindrome(ListNode head) {
        List<Integer> list=new ArrayList<>();
        ListNode currentNode=head;
        while (currentNode!=null){
            list.add(currentNode.val);
            currentNode=currentNode.next;
        }
        int i=0,j=list.size()-1;
        while(i<j){
            if(!list.get(i).equals(list.get(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
