package exploreElementaryAlgorithm.array;

import java.util.HashSet;
import java.util.Set;

/**
 * @author singlee
 * @create 2020-04-16-19:46
 * 存在重复元素
 */
public class Q4 {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);

        }


        return false;
    }
}
