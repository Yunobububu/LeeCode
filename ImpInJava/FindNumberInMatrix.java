package Leecode.ImpInJava;
/*
*在行和列都是递增的二维数组中查找key是否在数组中
* 采用逐行剔除的策略来查找,选定左上角的元素与key进行比较
* 如果等于直接命中,返回true
* > key有二维数组的特点可知,查找元素必定在该列的左侧,endY--,剔除该列
* < key 剔除改行,endX++;
* 当endX == rows 或者endY ==0时循环终止
**/
public class FindNumberInMatrix{
	public static void main(String[] args){
		int[][] matrix = {{1,3,9,20},{4,8,13,25},{6,14,17,36},{9,16,19,50}};
		boolean result = findNumber(matrix,7);
		System.out.println(result);
	}

	public static boolean findNumber(int[][] matrix,int key) {
		if(matrix == null){ return false;}
		int rows = matrix.length;
		int columns = matrix[0].length;
		int endX = 0;
		int endY = columns - 1;
		while(endX < rows && endY >= 0){
			if(matrix[endX][endY] == key){ return true;}
			if(matrix[endX][endY] < key){
				endX++;
			}else{
				endY--;
			}
		}
		return false;
	}
}