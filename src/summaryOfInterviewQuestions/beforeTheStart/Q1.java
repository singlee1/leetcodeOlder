package summaryOfInterviewQuestions.beforeTheStart;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author singlee
 * @create 2020-09-16-20:21
 * 只出现一次的数字
 *
 */
public class Q1 {

    public int singleNumber(int[] nums) {
        Set set=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }else {
                set.add(nums[i]);
            }
        }

        return (int)set.toArray()[0];
    }

    public int singleNumber1(int[] nums) {
        int single=0;

        for(int num1:nums){
            single^=num1;
        }
        return single;
    }
}
