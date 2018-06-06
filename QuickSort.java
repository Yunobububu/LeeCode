package Leecode;

import java.util.Random;

/*
* 快速排序,基于比较的排序,时间渐进θ(nlgn)空间θ(1)
* @author Mikasa
* @since 2018-05-29 08:25:16
* @version Aim2Offer page43
 **/
public class QuickSort {
    public static void main(String[] args){
        int[] array = {1,12,9,2,5,1,7,8,10};

        //System.out.println(partition(array,0,array.length - 1));
        quickSort(array,0,array.length - 1);
        for(int i: array){
            System.out.print(i + " ");
        }
    }
    public static void quickSort(int[] array,int p,int r){
        if(array == null || array.length == 0) return;
        if(p == r) return;
        int q = partition(array,p,r);
        if(p < q){
            quickSort(array,p,q - 1 );
            quickSort(array,q,r);
        }
    }
    public static int partition(int[] array,int p,int q){
        int pivot =  p + (int)(Math.random() * (q - p));
        int key = array[pivot];
        int i = p - 1;
        for(int j = p;j <= q;j++){
            if(array[j] < key){
                i++;
                exchange(array,i ,j);
            }
        }
        exchange(array,i + 1,pivot);
        return i + 1;
    }

    public static void exchange(int[] array,int src,int dest){
        if(src == dest ) return ;
        int temp = array[dest];
        array[dest] = array[src];
        array[src] = temp;
    }
}
