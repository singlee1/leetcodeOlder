package divideAndConquer;

import org.junit.Test;

/**
 * @author singlee
 * @create 2021-04-01-21:38
 * 二分查找
 */
public class Q1 {
    public int binarySearchLeft(int[] nums, int target) {
        // 搜索区间为 [left, right]
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                // 搜索区间变为 [mid+1, right]
                left = mid + 1;
            }
            if (nums[mid] > target) {
                // 搜索区间变为 [left, mid-1]
                right = mid - 1;
            }
            if (nums[mid] == target) {
                // 收缩右边界
                right = mid - 1;
            }
        }
        // 检查是否越界
        if (left >= nums.length || nums[left] != target)
            return -1;
        return left;
    }


    @Test
    public void test(){
        int[] arr={1,2,3,3,3,3,3,3,4,5,6,7};
        System.out.println(binarySearchLeft(arr,3));
    }
}
