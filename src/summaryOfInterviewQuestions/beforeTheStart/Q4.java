package summaryOfInterviewQuestions.beforeTheStart;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author singlee
 * @create 2020-10-19-22:50
 */
public class Q4 {


    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=m-1;
        int p2=n-1;
        int p=m+n-1;
        while(p1>=0&&p2>=0){
            nums1[p--]=(nums1[p1]>nums2[p2])?nums1[p1--]:nums2[p2--];

        }
        System.arraycopy(nums2,0,nums1,0,p2+1);
    }


    @Test
    public void test1(){
        int[] nums1 = {}; int m = 0;
        int[] nums2 = {1};       int n = 1;
        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }
}
