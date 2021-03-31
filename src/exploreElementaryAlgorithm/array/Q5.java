package exploreElementaryAlgorithm.array;

import com.sun.org.apache.xalan.internal.xsltc.dom.SingleNodeCounter;

import java.util.HashSet;
import java.util.Set;

/**
 * @author singlee
 * @create 2020-04-13-21:00
 *      只出现一次的数字
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 */
public class Q5 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,4,3,2};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i])){
                set.remove(nums[i]);
            }

        }

        return set.iterator().next();
    }

}
