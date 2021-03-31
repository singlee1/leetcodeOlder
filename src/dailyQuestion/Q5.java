package dailyQuestion;


/**
 * @author singlee
 * @create 2021-03-04-23:34
 * 翻转二叉树
 */
public class Q5 {

    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        TreeNode temp;

        temp=root.left;
        root.left=root.right;
        root.right=temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}


/*class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}*/
