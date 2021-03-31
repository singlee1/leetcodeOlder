package dailyQuestion;

/**
 * @author singlee
 * @create 2021-03-05-19:55
 * 将二叉树展开为链表
 */


public class Q7 {

    /*
    *  1.把左右子树都向右拉平
    *   2.把根节点的左指针置空，右指针指向左子树，原来的右子树接到现在的右子树的下面
    * */
    public void flatten(TreeNode root) {
        //base case
        if(root==null){
            return;
        }
        //开始递归
        flatten(root.left);
        flatten(root.right);

        //把根节点的左右节点先存一下，接下来开始转换
        TreeNode left=root.left;
        TreeNode right=root.right;

        //将root的左指针置空，
        root.left=null;
        root.right=left;

        //把root的右子树接到左子树的上面
        //找到根的右子树最后边
        TreeNode tmp=root;
        while(tmp.right!=null){
            tmp=tmp.right;
        }
        tmp.right=right;

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
