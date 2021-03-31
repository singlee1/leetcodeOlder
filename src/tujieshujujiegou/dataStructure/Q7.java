package tujieshujujiegou.dataStructure;

import java.util.HashMap;
import java.util.Map;

/**
 * @author singlee
 * @create 2021-02-06-22:51
 * 剑指 Offer 35. 复杂链表的复制
 */
public class Q7 {

    public Node copyRandomList(Node head) {
        if(head==null) return null;
        Node cur=head;
        //用一个map来存储结点到结点的关系
        Map<Node,Node> map=new HashMap<>();
        //第一遍遍历，复制结点
        while(cur!=null){
            map.put(cur,new Node(cur.val));
            cur=cur.next;
        }
        cur=head;
        while(cur!=null){
            map.get(cur).next=map.get(cur.next);
            map.get(cur).random=map.get(cur.random);
            cur=cur.next;
        }
        return map.get(head);
    }
}

// Definition for a Node.
class Node {
    int val;
    Node next, random;
    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
