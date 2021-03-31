package dailyQuestion.BST;

/**
 * @author singlee
 * @create 2021-03-10-15:03
 *  二叉搜索树中的搜索
 */
public class Q2 {
    public TreeNode searchBST(TreeNode root, int val) {

        //base case
        if(root==null) return null;
        if(root.val==val){
            return root;
        }

        if(root.val<val){
            return searchBST(root.right,val);
        }
        if(root.val>val){
            return searchBST(root.left,val);
        }
        return null;
    }


}
