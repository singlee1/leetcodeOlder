package dailyQuestion;

/**
 * @author singlee
 * @create 2021-02-28-23:36
 * 有序数组的 Two Sum
 */
public class Q1 {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers==null)   return null;
        int l=0,r=numbers.length-1;
        while(l<r){
            if(numbers[l]+numbers[r]==target){
                return new int[]{l+1,r+1};
            }else if(numbers[l]+numbers[r]<target){
                l++;
            }else {
                r--;
            }

        }
    return null;
    }

}
