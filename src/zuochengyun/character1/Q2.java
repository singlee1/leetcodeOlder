package zuochengyun.character1;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author singlee
 * @create 2021-04-05-21:51
 *  左程云算法初级班第二章1
 */
public class Q2 {
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    //简单划分
    public static void partition1(int[] arr,int l,int r,int num){
        //划分左半区和右半区
        int min=l-1;
        for(int i=l;i<=r;i++){
            if(arr[i]<=num){
                swap(arr,++min,i);
            }
        }
    }

    /**
     * 荷兰国旗问题
     * @param arr   给一个数组
     * @param l     数组左界限
     * @param r         右
     * @param num       基准数，以此为界限划分开
     */
    public static void netherlandFlag(int[] arr,int l,int r,int num){
        int less=l-1;
        int more=r+1;
        while(l<=r){
            if(arr[l]<num){
                swap(arr,++less,l++);
            } else if (arr[l] > num) {
                swap(arr,l,--more);
            }else{
                l++;
            }
        }
    }


    //经典快速排序，以最后一个数为基准值
    public static void quickSort(int[] arr){
        if(arr==null||arr.length<2){
            return;
        }
        quickSort(arr,0,arr.length-1);
    }
    public static void quickSort(int[] arr,int l,int r){
        if(l<r){
            int[] p=partition(arr,l,r);
            quickSort(arr,l,p[0]);
            quickSort(arr,p[1]+1,r);
        }
    }

    //采用最后一个数作为基准,返回最终基准值的下标区域
    public static int[] partition(int[] arr,int l,int r){
        int less=l-1;
        int more=r;
        int p=arr[r];
        while(l<more){
            if(arr[l]<p){
                swap(arr,l++,++less);
            }else if(arr[l]>p){
                swap(arr,l,--more);
            }else {
                l++;
            }
        }
        swap(arr,more,r);
        return new int[]{less+1,more};
    }


    //如何参考荷兰国旗问题来改进快速排序？在数组中随机选一个数和最后一个数交换即可，然后进行经典的快排。
    //swap(arr,R,L+(int)Math.random()*(R-L+1));


    //堆排序
    public static void heapSort(int[] arr){
        if(arr==null||arr.length<2){
            return;
        }
        //初始化堆
        for(int i=0;i<arr.length;i++){
            heapInsert(arr,i);
        }
        int heapSize=arr.length-1;
        while (heapSize>0){
            swap(arr,0,heapSize);
            heapify(arr,0,heapSize--);
        }


    }
    public static void heapInsert(int[] arr,int i){
        while(arr[i]>arr[(i-1)/2]){
            swap(arr,i,(i-1)/2);
            i=(i-1)/2;
        }
    }

    public static void heapify(int[] arr,int index,int heapSize){
        int left=index*2+1;
        while(left<heapSize){
            int large=left+1<heapSize && arr[left+1]>arr[left]?left+1:left;
            large=arr[large]>arr[index]?large:index;
            if(large==index){
                break;
            }
            swap(arr,large,index);
            index=large;
            left=index*2+1;
        }

    }



    @Test
    public void test(){
        int[] arr = {5,6,2,8,1,4,9,0,7};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
