package exploreElementaryAlgorithm.tree;


import java.util.TreeMap;

/**
 * @author singlee
 * @create 2020-05-07-22:49
 * 验证二叉搜索树
 */
public class Q2 {

    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);

    }

    public boolean helper(TreeNode root, Integer lower, Integer upper) {
        //如果传入的跟节点为Null,则直接返回true
        if (root == null) return true;
        //如果传入的节点不满足条件，直接返回false
        int val = root.val;
        if (lower != null && val <= lower) return false;
        if (upper != null && val>=upper) return false;
        //递归左右节点

        if(!helper(root.left,lower,val)) return false;
        if(!helper(root.right,val,upper)) return false;
        return true;
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
