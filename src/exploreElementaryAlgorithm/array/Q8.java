package exploreElementaryAlgorithm.array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author singlee
 * @create 2020-04-16-21:03
 * 移动零
 */
public class Q8 {

    public void moveZeroes(int[] nums) {
        int point=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[point++]=nums[i];
            }
        }
        while (point<nums.length){
            nums[point++]=0;

        }

    }

}
