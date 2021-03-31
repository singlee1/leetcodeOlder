package dailyQuestion.DP;

import org.junit.Test;

/**
 * @author singlee
 * @create 2021-03-17-22:55
 * 连续子数组的最大和
 */
public class Q6 {

    public int maxSubArray(int[] nums) {
        //dp[0]就是nums[0],用res比较返回最大值
        int res=nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>0){
                nums[i]+=nums[i-1];
            }
            //每次都判断最大值
            if(nums[i]>res){
                res=nums[i];
            }
        }
        return res;
    }

    //别人写的，好简洁。。。
    public int maxSubArray1(int[] nums) {
        int res = nums[0];
        for(int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            res = Math.max(res, nums[i]);
        }
        return res;
    }

    @Test
    public void Test(){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray(nums);

    }
}
