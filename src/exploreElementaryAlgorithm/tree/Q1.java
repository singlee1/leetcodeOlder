package exploreElementaryAlgorithm.tree;



/**
 * @author singlee
 * @create 2020-05-07-22:49
 * 二叉树的最大深度
 */
public class Q1 {

    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }else {
            int lLength=maxDepth(root.left);
            int rLength=maxDepth(root.right);
            return Math.max(lLength,rLength)+1;
        }

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
