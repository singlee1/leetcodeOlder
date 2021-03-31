package exploreElementaryAlgorithm.tree;


import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author singlee
 * @create 2020-05-07-22:49
 * 二叉树的层序遍历
 */
public class Q4 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> rsl = new LinkedList<>();
        if (root == null) return rsl;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            //实时获取队列长度
            int size = q.size();
            List<Integer> l = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode t = q.poll();
                if (t != null) {
                    l.add(t.val);
                    if (t.left != null) {
                        q.add(t.left);
                    }
                    if (t.right != null) {
                        q.add(t.right);
                    }

                }
            }
            rsl.add(l);


        }
        return rsl;

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
