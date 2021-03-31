package exploreElementaryAlgorithm.tree;


/**
 * @author singlee
 * @create 2020-05-07-22:49
 * 对称二叉树
 */
public class Q3 {

    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    public boolean isMirror(TreeNode t1, TreeNode t2) {
        //递归终止条件
        //两个节点都是空
        if (t1 == null && t2 == null) return true;
        //一个是空
        if (t1 == null || t2 == null) return false;
        return (t1.val == t2.val)
                && isMirror(t1.left,t2.right) && isMirror(t1.right,t2.left);

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
