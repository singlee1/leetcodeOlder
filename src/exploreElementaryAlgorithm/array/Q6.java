package exploreElementaryAlgorithm.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author singlee
 * @create 2020-04-14-20:43
 *
 * 两个数组的交集 II
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 *
 *      思路：用HashMap完成，把数组A中的元素及其对应个数存到Map中，然后用另一个数组去碰瓷
 *
 */
public class Q6 {
    public static void main(String[] args) {
        int[] nums1={1,2,3};
        int[] nums2={1,2,3,5,4};
        int[] nums=intersect(nums1,nums2);
        for(int n:nums){
            System.out.println(n);
        }

    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            return intersect(nums2,nums1);
        }

        Map<Integer,Integer> map=new HashMap<>();
        for(int n:nums1){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int k=0;
        for(int n:nums2){
            int cnt=map.getOrDefault(n,0);
            if(cnt>0){
                nums1[k++]=n;
                map.put(n,map.get(n)-1);
            }

        }





        return Arrays.copyOfRange(nums1,0,k);
    }

}
