package dailyQuestion.BST;

/**
 * @author singlee
 * @create 2021-03-09-23:34
 * 验证二叉搜索树
 *
 */
public class Q1 {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root,null,null);
    }

    public boolean isValidBST(TreeNode root,TreeNode min,TreeNode max){
        //base case
        if(root==null) return true;

        //judge
        if(min!=null && root.val<=min.val) return false;
        if(max!=null && root.val>=max.val) return false;

        //recursion
        return isValidBST(root.left,min,root) && isValidBST(root.right,root,max);


    }


}


 class TreeNode {
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
 }
