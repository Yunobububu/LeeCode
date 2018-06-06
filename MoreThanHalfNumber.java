package Leecode;

import java.util.Random;
/*
* Aim2Offer 29
*
 */
public class MoreThanHalfNumber {
    public static void main(String[] args){
        int[] array = {1,9,1,1,4,1,6,1,1,3,4,9};
        int result = moreThanHalfNumber(array);
        System.out.println("重复的数组为: " + result);
        System.out.println(checkMoreThanHalf(array,1));

    }
    /*
    *
    *
    **/
    public static int moreThanHalfNumberTwo(){
        return 0;
    }
    /*
    *
    * Method ①:基于快速排序的partition,根据partition算法,当partition后返回index前的值小于array[index]
    * partition后的值大于array[index]的值.所以如果数组存在大于数组一半长度的值,那么array[mid]的值就是要求的值,
    * 根据partition返回的值循环partition,直到partition返回的值为mid
    * */
    public static int moreThanHalfNumber(int[] array){
        int mid = array.length >> 1;
        int endIndex = array.length - 1;
        int startIndex = 0;
        int index = partition(array,startIndex,endIndex);
        while(index != mid){
            if(index > mid ){
                endIndex = index - 1;
                index = partition(array,startIndex,endIndex);
            }else{
                startIndex = index + 1;
                index = partition(array,startIndex,endIndex);
            }
        }
        int result = array[index];
        boolean isMoreThanHalf = checkMoreThanHalf(array,result);
        if(isMoreThanHalf){
            return result;
        }
        return -1;
    }
    /*
    * @Param array 待partition数组
    * @Param start partition 数组的开始坐标
    * @Param end partition 数组的结束坐标
    * @return 返回partition后的索引,index 之前的大于array[index],index之后的小于array[index]
    ***/
    public static int partition(int[] array,int start,int end){
        partitionValid(array,start,end);
        int i = start - 1;
        Random random = new Random();
        int pivot = start + random.nextInt(end - start + 1);
        swap(array,pivot,end);
        for(int j = start;j < end;j++){
            if(array[j] < array[end]){
                i++;
                swap(array,i,j);
            }
        }
        i++;
        swap(array,i,end);
        return i;
    }
    public static void partitionValid(int[] array,int start,int end){
        if(array == null || array.length == 0
                || start < 0 || start > end || end >= array.length){
            return;
        }
    }
    public static void swap(int[] array,int src,int dest){
        if(src == dest){ return;}
        int temp = array[src];
        array[src] = array[dest];
        array[dest] = temp;
    }
    public static boolean checkMoreThanHalf(int[] array,int number){
        int times = 0;
        for(int i = 0;i < array.length;i++){
            if(array[i] == number){
                times++;
            }
        }
        if(times < array.length >> 1){
            return false;
        }
        return true;
    }
}
