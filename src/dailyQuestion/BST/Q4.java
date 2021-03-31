package dailyQuestion.BST;

/**
 * @author singlee
 * @create 2021-03-10-23:21
 * 删除二叉搜索树中的节点
 */
public class Q4 {

    /*
    *   先找到该节点
    *   分三种情况：
    *   1.是叶子节点
    *   2.有一个子节点
    *   3.有俩子节点
    * */
    TreeNode deleteNode(TreeNode root, int key) {
        //base case
        if(root==null) return null;
        if(root.val==key){
            //找到了节点
            //如何操作？ 分三种情况
            //1.
            if(root.left==null && root.right==null){
                return null;
            }
            //2.
            if(root.left==null){
                return root.right;
            }
            if(root.right==null){
                return root.left;
            }

            //3.   用其左子树的最大节点或者右子树的最小节点代替【这里我们采用后者】
            TreeNode min=getMin(root.right);
            //这里我们简单的用最小值替换掉即可，然后删除右子树的最小节点
            root.val=min.val;
            root.right=deleteNode(root.right,min.val);


        }else if(root.val>key){
            root.left=deleteNode(root.left,key);
        }else {
            root.right=deleteNode(root.right,key);
        }
        return root;
    }

    //BST的最小节点就是最左节点
    TreeNode getMin(TreeNode root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }

}

