package exploreElementaryAlgorithm.array;

import java.util.Arrays;

/**
 * @author singlee
 * @create 2020-04-17-15:22
 * 两数之和
 */
public class Q9 {


    public int[] twoSum(int[] nums, int target) {
        int[] rst=new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    rst[0]=i;
                    rst[1]=j;
                    return rst;
                }
            }
        }


        return null;
    }
}
