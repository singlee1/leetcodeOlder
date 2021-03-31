package exploreElementaryAlgorithm.array;

/**
 * @author singlee
 * @create 2020-04-15-19:36
 *  删除排序数组中的重复项
 */
public class Q1 {


    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }

        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];


            }
        }
        return i+1;
    }
}
