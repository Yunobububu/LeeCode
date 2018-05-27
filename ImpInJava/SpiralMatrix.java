package Leecode.ImpInJava;

import java.util.List;
import java.util.ArrayList;
public class SpiralMatrix{
	private static List<Integer> list = new ArrayList<>(); 
	public static void main(String[] args){
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		spiralOrder(matrix);
		System.out.println(list);
	}
	public static List<Integer> spiralOrder(int[][] matrix){
		if(matrix == null || matrix.length == 0){return list;}
		int start = 0;
		int rows = matrix.length;
		int columons = matrix[0].length;
		while(rows > start * 2 && columons > start * 2){
			execute(matrix,rows,columons,start);
			start++;
		}
		return list;
	}
	public static void execute(int[][] matrix,int rows,int columons,int start){
		//endX:行的打印终点坐标
		int endX = columons - start - 1;
		//endY列的打印终点坐标
		int endY = rows - start - 1;
		//从左向右打印 ->
		for(int i = start; i <= endY;i++){
			list.add(matrix[start][i]);
		}
		//从上往下打印
		for(int i = start;i <= endY;i++){
			list.add(matrix[i][endX]);
		}
		//从右往左打印
		if(start < endX && start < endY){
			for(int i = endX - 1;i >= start;i--){
				list.add(matrix[endY][i]);
			}
		}
		//从下往上打印
		if(start < endX && start < endY - 1 ){
			for(int i = endY - 1;i > start;i--){
				list.add(matrix[i][start]);
			}
		}

	}
}