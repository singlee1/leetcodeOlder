package dailyQuestion;

/**
 * @author singlee
 * @create 2021-03-05-21:30
 * 构造最大二叉树
 */
public class Q8 {

    /*
    *   对于每个根节点，只需要找到当前 nums 中的最大值和对应的索引，然后递归调用左右数组构造左右子树即可。
    *   步骤：
    *   1.找到数组最大值和下标，创建节点
    *   2.递归左边，右边
    *
    * */
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums,0,nums.length-1);
    }
    public TreeNode build(int[] nums,int low, int high){

        if(low>high){
            return null;
        }

        //找到区间最大值和下标，创建节点
        int idx=-1;
        int max=Integer.MIN_VALUE;
        for(int i=low;i<=high;i++){
            if(nums[i]>max){
                max=nums[i];
                idx=i;
            }
        }
        //创建节点
        TreeNode root=new TreeNode(max);
        root.left=build(nums,low,idx-1);
        root.right=build(nums,idx+1,high);


        return root;
    }

}
