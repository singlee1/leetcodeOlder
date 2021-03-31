package dailyQuestion;

import org.junit.Test;

/**
 * @author singlee
 * @create 2021-03-05-17:09
 *  填充每个节点的下一个右侧节点指针
 */
public class Q6 {
    public Node connect(Node root) {
        if(root==null){
            return null;
        }
        connectTwoNode(root.left,root.right);
        return root;
    }

    //连接传入的2个节点
    public void connectTwoNode(Node node1,Node node2){
        if(node1==null||node2==null){
            return;
        }

        //连接
        node1.next=node2;

        //递归
        connectTwoNode(node1.left,node1.right);
        connectTwoNode(node2.left,node2.right);
        connectTwoNode(node1.right,node2.left);

    }

    @Test
    public void test(){

        Node node4=new Node(4);
        Node node5=new Node(5);
        Node node6=new Node(6);
        Node node7=new Node(7);
        Node node3=new Node(3,node6,node7);
        Node node2=new Node(2,node4,node5);
        Node root=new Node(1,node2,node3);

        Node rst=connect(root);

        System.out.println();
    }


}

// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }

    public Node(int val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
