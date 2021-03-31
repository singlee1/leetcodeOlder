package exploreElementaryAlgorithm.dynamicProgramming;

/**
 * @author singlee
 * @create 2020-05-28-23:50
 * 最大子序和
 */
public class Q3 {
    public int maxSubArray(int[] nums) {

        int max=nums[0];
        int preMax=0;
        //int now;
        for(int now:nums){
            if(preMax>0){
                preMax+=now;
            }else {
                preMax=now;
            }
            max=Math.max(max,preMax);
        }
        return max;
    }

/*    public static void main(String[] args) {
        Q3 q3=new Q3();
        int[] a={-2,3,-1,1,4};
        int rst=q3.maxSubArray(a);
        System.out.println(rst);
    }*/
}
