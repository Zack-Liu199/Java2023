package com.atguigu3.common_algorithm;

import java.util.Scanner;

/**
 * ClassName: RectangleTest
 * Package: com.atguigu3.common_algorithm
 * Description:
 *举例6：回形数
 * 从键盘输入一个整数（1~20） ，则以该数字为矩阵的大小，把1,2,3…n*n 的数字按照顺时针螺旋的形式填入其中。
 * 例如： 输入数字2，则程序输出： 1 2 4 3
 * 输入数字3，则程序输出： 1 2 3 8 9 4 7 6 5 输入数字4， 则程序输出： 1 2 3 4 12 13 14 5 11 16 15 6 10 9 8 7
 * @Author Zack_Liu
 * @Create 2023/7/12 23:31
 * @Version 1.0
 */
public class RectangleTest2 {
    public static void main (String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入1个数字");
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        int count = 0;
        int minX = 0;
        int minY = 0;
        int maxX = n - 1;
        int maxY = n - 1;
        while(minY<=maxY) {
            for(int x=minX;x<=maxX;x++) {
                arr[minY][x] = ++count;
            }
            minY++;
            for(int y=minY;y<=maxY;y++) {
                arr[y][maxX] = ++count;
            }
            maxX--;
            for(int x=maxX;x>=minX;x--) {
                arr[maxY][x] = ++count;
            }
            maxY--;
            for(int y=maxY;y>=minY;y--) {
                arr[y][minX] = ++count;
            }
            minX++;
        }
        for(int x=0; x<n; x++){
            for(int y=0; y<n; y++){
                System.out.print(arr[x][y]+" ");
            }
            System.out.println();
        }
    }
}

