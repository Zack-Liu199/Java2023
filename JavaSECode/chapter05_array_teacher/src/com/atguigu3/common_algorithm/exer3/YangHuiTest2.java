package com.atguigu3.common_algorithm.exer3;

/**
 * ClassName: YangHuiTest2
 * Package: com.atguigu3.common_algorithm.exer3
 * Description:
 *案例：使用二维数组打印一个 10 行杨辉三角。
 *
 *    提示：
 *    1. 第一行有 1 个元素, 第 n 行有 n 个元素
 *    2. 每一行的第一个元素和最后一个元素都是 1
 *    3. 从第三行开始, 对于非第一个元素和最后一个元素的元素。即：
 *    yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
 * @Author Zack_Liu
 * @Create 2023/7/10 11:26
 * @Version 1.0
 */
public class YangHuiTest2 {
    public static void main(String[] args) {
        int[][] yanghui = new int[10][];
        for(int i = 0;i < yanghui.length;i++){
            yanghui[i] = new int[i+1];
            yanghui[i][0] = yanghui[i][yanghui[i].length-1] = 1;
            for(int j =1;j < yanghui[i].length-1;j++){
                yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
            }
        }
        for(int x = 0; x < yanghui.length; x++){
            for(int y = 0; y < yanghui[x].length; y++){
                System.out.print(yanghui[x][y] + " ");
            }
            System.out.println();
        }
    }
}
