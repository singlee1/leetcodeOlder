package tencent.arrayAndString;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author singlee
 * @create 2020-08-27-22:19
 * 两数之和
 */
public class Q1 {
    public static void main(String[] args) {
        int[] nums={3,2,4};
        Q1 q1=new Q1();
        System.out.println(Arrays.toString(q1.twoSum(nums,6)));
    }

    public int[] twoSum(int[] nums, int target) {
        int[] rst=new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    rst[0]=i;
                    rst[1]=j;
                }
            }
        }
        return rst;
    }


    public int[] twoSum1(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int difference=target-nums[i];
            if(map.containsKey(difference)){
                return new int[]{map.get(difference),i};
            }
            map.put(nums[i],i);
        }
        throw  new IllegalArgumentException("No");
    }
}
