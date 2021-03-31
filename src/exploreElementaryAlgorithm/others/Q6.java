package exploreElementaryAlgorithm.others;

/**
 * @author singlee
 * @create 2020-08-19-22:33
 * 缺失数字
 */
public class Q6 {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }

        int standard=0;
        for(int i=0;i<=nums.length;i++){
            standard+=i;
        }

        return standard-sum;
    }
}
