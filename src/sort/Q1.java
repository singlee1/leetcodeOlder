package sort;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author singlee
 * @create 2021-04-01-22:34
 * 最小的 k 个数
 */
public class Q1 {
    //用大顶堆解决
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] rst=new int[k];
        if(k==0){
            return rst;
        }

        //大顶堆可以用优先级队列表示，然后自定义排序规则
        PriorityQueue<Integer> heap=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        for(int i=0;i<k;i++){
            heap.add(arr[i]);
        }
        for(int i=k;i<arr.length;i++){
            if(heap.peek()>arr[i]){
                heap.poll();
                heap.add(arr[i]);
            }
        }
        for (int i = 0; i < k; i++) {
            rst[i]=heap.poll();
        }

    return rst;
    }
}
