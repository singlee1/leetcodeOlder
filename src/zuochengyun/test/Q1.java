package zuochengyun.test;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author singlee
 * @create 2021-04-09-9:38
 * 排序算法
 */
public class Q1 {
    public static void swap(int[] arr,int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }


    /**
     *      交换排序[冒泡，快速]，
     *      选择排序[简单选择，堆]
     *      插入排序[简单插入，shell]
     *
     * @param arr
     *     属于简单的排序算法[冒泡，插入，选择]之一。
     *      时间复杂度N²,最好情况下为1，空间复杂度1
     *      稳定
     */
    public static void bubbleSort(int[] arr){
        if(arr==null||arr.length<2){
            return;
        }
        for(int i=arr.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }

    /**
     * 插入排序
     * @param arr
     *  时间复杂度N²，最好能到N，空间复杂度1
     *  稳定
     */
    public static void insertionSort(int[] arr){
        if(arr==null||arr.length<2){
            return;
        }
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
    }

    /**
     * 选择排序
     * @param arr
     * 时间复杂度N²，空间复杂度1，
     * 不稳定
     *
     */
    public static void selectionSort(int[] arr){
        if(arr==null||arr.length<2){
            return;
        }
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    min=j;
                }
            }
            swap(arr,i,min);
        }
    }

    /**
     * 快排
     * @param arr
     * 采用随机快排
     */
    public static void quickSort(int[] arr){
        if(arr==null||arr.length<2){
            return;
        }
        quickSort(arr,0,arr.length-1);
    }
    public static void quickSort(int[] arr,int l,int r){
        if(l<r){
            int[] arr1=partition(arr,l,r);
            quickSort(arr,l,arr1[0]);
            quickSort(arr,arr1[1]+1,r);
        }

    }

    //单次划分的方法,以数组中的随机值做划分
    public static int[] partition(int[] arr,int l,int r){
        swap(arr,(int)(arr.length*Math.random()),r);
        int less=l-1;
        int more=r;
        while(l<more){
            if(arr[l]<arr[r]){
                swap(arr,l++,++less);
            }else if(arr[l]>arr[r]){
                swap(arr,l,--more);
            }else {
                l++;
            }
        }
        swap(arr,more,r);
        return new int[]{less,more};
    }



    //随机产生一个大小为size,值为value的数组
    public static int[] generateRandomArray(int size,int value){
        int[] arr=new int[(int) (Math.random()*(size+1))];
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*(value+1))-(int)(Math.random()*value);
        }
        return arr;
    }

    @Test
    public void test(){
        int time=1;
        int size=10;
        int value=10;
        for(int i=0;i<time;i++){
            int[] arrA=generateRandomArray(size,value);
            int[] arrB= Arrays.copyOf(arrA,arrA.length);
            int[] originArr=Arrays.copyOf(arrA,arrA.length);
            Arrays.sort(arrA);

            quickSort(arrB);
            if(!Arrays.equals(arrA,arrB)){
                System.out.print("出现错误，错误的数组是:");
                System.out.println(Arrays.toString(originArr));
                return;
            }
        }
        System.out.println("OK");
    }

}
