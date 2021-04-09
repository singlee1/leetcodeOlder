package zuochengyun.character1;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author singlee
 * @create 2021-04-02-22:22
 */
public class Sort {

    //冒泡排序
    public void bubbleSort(int[] arr){
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

    //插入排序
    public static void insertionSort(int[] arr){
        if(arr==null||arr.length<2){
            return;
        }
        for(int i=1;i<arr.length;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }


    //选择排序
    public static void selectionSort(int[] arr){
        if(arr==null||arr.length<2){
            return;
        }
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            swap(arr,i,minIndex);
        }
        
    }

    //归并排序
    public static void mergeSort(int[] arr){
        if(arr==null || arr.length<2){
            return;
        }
        sortProcess(arr,0,arr.length-1);
    }
    public static void sortProcess(int[] arr, int l, int r){
        if(l==r){
            return;
        }
        int mid=l+((r-l)>>1);
        sortProcess(arr,l,mid);
        sortProcess(arr,mid+1,r);
        //合并
        merge(arr,l,mid,r);
    }
    public static void merge(int[] arr,int l,int mid,int r){
        int[] help=new int[r-l+1];
        int p1=l;
        int p2=mid+1;
        int i=0;
        while (p1<=mid&&p2<=r){
            help[i++]=arr[p1]<arr[p2]?arr[p1++]:arr[p2++];
        }
        while(p1<=mid){
            help[i++]=arr[p1++];
        }
        while(p2<=r){
            help[i++]=arr[p2++];
        }

        for(i=0;i<help.length;i++){
            arr[l+i]=help[i];
        }
    }








    //------------------------------------------------------
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    //注意这种异或函数的陷阱，也就是相同值异或会置0
    public static void swap1(int[] arr,int i,int j){
        arr[i]=arr[i]^arr[j];
        arr[j]=arr[i]^arr[j];
        arr[i]=arr[i]^arr[j];
    }

    //绝对正确的排序方法，用来对比我们写的方法
    public static void absolutelyRightMethod(int[] arr){
        Arrays.sort(arr);
    }

    /**
     * 随机测试用例生成器
     * @param size  测试用例的数组的大小
     * @param value 测试用例中值的取值范围[-value,value]
     * @return
     */
    public static int[] generateRandomArray(int size,int value){
        //生成[0,size]范围内的大小的
        int[] arr=new int[(int)((size+1)*Math.random())];
        //给数组初始化值
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)((value+1)*Math.random())-(int)(value*Math.random());
        }
        return arr;
    }

    @Test
    public void test(){
        int testTime=100;
        int size=10;
        int value=10;
        boolean succeed=true;
        for (int i = 0; i < testTime; i++) {
            int[] arr1=generateRandomArray(size,value);
            int[] arr2=Arrays.copyOf(arr1,arr1.length);
            int[] arr3=Arrays.copyOf(arr1,arr1.length);
            mergeSort(arr1);
            absolutelyRightMethod(arr2);
            if(!Arrays.equals(arr1,arr2)){
                succeed=false;
                //可以顺便打印下出错的数组
                System.out.println(Arrays.toString(arr3));
                break;
            }
        }

        System.out.println(succeed?"OK!":"Wrong!");

    }


}
