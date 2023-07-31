package com.atguigu05.method_more._03valuetransfer.exer1;


import static java.lang.Math.PI;

/**
 * ClassName: Circle
 * Package: com.atguigu05.method_more._03valuetransfer.exer1
 * Description:
 *定义一个Circle类，包含一个double型的radius属性代表圆的半径，一个findArea()方法返回圆的面积。
 * @Author Zack_Liu
 * @Create 2023/7/26 17:07
 * @Version 1.0
 */
public class Circle {
    int radius;
    public double findArea(double radius){
        return PI * radius* radius ;
    }
}
