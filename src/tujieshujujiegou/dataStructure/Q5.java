package tujieshujujiegou.dataStructure;

import org.junit.Test;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author singlee
 * @create 2021-01-27-22:12
 * 剑指 Offer 24. 反转链表
 */
public class Q5 {
    public ListNode reverseList(ListNode head) {
        ListNode cur=head,pre=null;
        while(cur!=null){
            ListNode tmp;
            tmp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=tmp;

        }
        return pre;
    }




    ListNode reverseList1(ListNode head) {
        return recur(head, null);    // 调用递归并返回
    }
    private ListNode recur(ListNode cur, ListNode pre) {
        if (cur == null) return pre; // 终止条件
        ListNode res = recur(cur.next, cur);  // 递归后继节点
        cur.next = pre;              // 修改节点引用指向
        return res;                  // 返回反转链表的头节点
    }

    @Test
    public void test(){
        ListNode node0=new ListNode(0);
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(4);
        ListNode head=node0;
        node0.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=null;

        ListNode rst = reverseList1(head);
        System.out.println(rst.val);


    }


}
