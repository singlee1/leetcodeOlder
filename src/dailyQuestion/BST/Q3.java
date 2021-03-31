package dailyQuestion.BST;

/**
 * @author singlee
 * @create 2021-03-10-16:10
 * BST插入结点
 */
public class Q3 {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        //base case
        if(root==null) return new TreeNode(val);

        if(root.val<val){
            root.right=insertIntoBST(root.right,val);
        }
        if(root.val>val){
            root.left=insertIntoBST(root.left,val);
        }
        return root;
    }


}
