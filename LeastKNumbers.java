package Leecode;

import java.util.Random;
/*
* 求数组中最小的K个数@Aim2Offer 30
* @author CCmikasa
* @since 2018-06-06 19:28:50
*
 **/
public class LeastKNumbers {

    public static void main(String[] args){
        int[] array = {1,5,3,9,0,2,4,8,11,1};
        int k = 6;
        leastKNumbers(array,k);

    }
    /*
    * method ①:
    * 利用partition的性质求循环求得partition返回值为k - 1;
    * 算法时间复杂度为θ(n),会改变源数组
    * 求数组中最小的K个数
    * @param array 给定的数组
    * @param k 数组最小的k
    *
     */
    public static void leastKNumbers(int[] array,int k){
        //校验array,k是否输入参数是否合法
        boolean flag = isLeastKValid(array,k);
        //校验通过,继续
        if(flag){

                int startIndex = 0;
                int endIndex = array.length - 1;
                int index = partition(array,startIndex,endIndex);
                while(index >= 0 && index != k - 1){
                    if(index > k - 1){
                        endIndex = index - 1;
                        index = partition(array,startIndex,endIndex);
                    }else {
                        startIndex = index + 1;
                        index = partition(array,startIndex,endIndex);
                    }
                }
                for(int i = 0;i < k;i++){
                    System.out.println(array[i]);
                }
        }
    }
    public static int partition(int[] array,int start,int end){
        boolean flag = isPartitionValid(array,start,end);
        int index = start - 1;
        if(flag){
            Random random = new Random();
            int pivot = start + random.nextInt(end - start + 1);
            swap(array,pivot,end);
            for(int j = start;j < end;j++){
                if(array[j] < array[end]){
                    index++;
                    swap(array,index,j);
                }
            }
            index++;
            swap(array,index,end);
        }
        return index;
    }
    public static void swap(int[] array,int src,int dest){
        int temp = array[src];
        array[src] = array[dest];
        array[dest] = temp;
    }
    public static boolean isLeastKValid(int[] array,int k){
        if(array == null || array.length == 0){
            System.out.println("输入数组有误");
            return false;
        }
        if(k <=0 || k > array.length){
            System.out.println("请选择正确的K值");
            return false;
        }
        return true;

    }
    public static boolean isPartitionValid(int[] array,int start,int end){
        if( start < 0 || end > array.length || start > end){
            return false;
        }
        return true;
    }
}
