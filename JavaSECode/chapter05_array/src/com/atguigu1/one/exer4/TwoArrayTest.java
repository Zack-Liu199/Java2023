package com.atguigu1.one.exer4;

/**
 * ClassName: TwoArrayTest
 * Package: com.atguigu1.one.exer4
 * Description:
 *
 * @Author Zack_Liu
 * @Create 2023/7/9 17:47
 * @Version 1.0
 */
///*
// 1
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5
// */
public class TwoArrayTest {
    public static void main(String[] args) {
        int[][] arr = new int[5][];
        for(int i = 0; i < 5;i++){
            arr[i] = new int[i+1];
        }
        for (int x = 0;x < 5;x++){
            for(int y =0;y <= x; y++){
                arr[x][y] = x+1;
                System.out.print(arr[x][y]+" ");
            }
            System.out.println("");
        }
    }
}
