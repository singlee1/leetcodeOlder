package exploreElementaryAlgorithm.sortAndSearch;

import java.util.Arrays;

/**
 * @author singlee
 * @create 2020-05-17-23:04
 *  合并两个有序数组
 */
public class Q1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i<n;i++){
            nums1[m+i]=nums2[i];
        }
        Arrays.sort(nums1);

    }

}
