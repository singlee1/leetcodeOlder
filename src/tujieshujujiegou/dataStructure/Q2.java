package tujieshujujiegou.dataStructure;

import java.util.LinkedList;

/**
 * @author singlee
 * @create 2020-11-22-21:27
 * 从尾到头打印链表
 */

public class Q2 {

    public int[] reversePrint(ListNode head) {
        LinkedList<Integer> list=new LinkedList<>();
        ListNode temp=head;
        while(temp!=null){
            list.addFirst(temp.val);
            temp=temp.next;
        }
        int[] rst=new int[list.size()];
        for(int i=0;i<list.size();i++){
            rst[i]=list.get(i);
        }
        return rst;
    }


}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}