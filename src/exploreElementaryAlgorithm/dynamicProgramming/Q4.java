package exploreElementaryAlgorithm.dynamicProgramming;

/**
 * @author singlee
 * @create 2020-06-20-21:30
 *
 * 2020年7月17日22点07分
 * 打家劫舍
 *
 */
public class Q4 {


    public static void main(String[] args) {


    }

    public int rob(int[] nums) {
        //如果nums为空
        if(nums==null||nums.length==0){
            return 0;
        }
        //如果nums长度为1
        int length=nums.length;
        if(length==1){
            return nums[0];
        }

        //动态规划+滚动数组
        int first=nums[0];
        int second=Math.max(nums[0],nums[1]);

        for(int i=2;i<length;i++){
            int temp=second;
            second=Math.max(first+nums[i],second);
            first=temp;
        }

        return second;
    }
}
