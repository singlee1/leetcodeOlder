package exploreElementaryAlgorithm.tree;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author singlee
 * @create 2020-05-07-22:49
 * 二叉树的层序遍历
 */
public class Q5 {
    int[] nums;
    public TreeNode sortedArrayToBST(int[] nums) {
        this.nums=nums;
        return helper(0,nums.length-1);
    }
    public TreeNode helper(int l,int r){
        if(l>r) return null;

        int root=(l+r)/2;
        TreeNode t=new TreeNode(nums[root]);
        t.left=helper(l,root-1);
        t.right=helper(root+1,r);
        return t;
    };


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
