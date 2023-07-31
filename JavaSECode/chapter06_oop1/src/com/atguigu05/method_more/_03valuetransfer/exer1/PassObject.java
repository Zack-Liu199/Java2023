package com.atguigu05.method_more._03valuetransfer.exer1;

/**
 * ClassName: PassObject
 * Package: com.atguigu05.method_more._03valuetransfer.exer1
 * Description:
 *     定义一个类PassObject，在类中定义一个方法printAreas()，该方法的定义如下：
 *      public void printAreas(Circle c, int time)。
 *
 * 3. 在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。
 *     例如，time为5，则输出半径1，2，3，4，5，以及对应的圆面积。
 *
 * 4. 在main方法中调用printAreas()方法，调用完毕后输出当前半径值。程序运行结果如图所示。
 * @Author Zack_Liu
 * @Create 2023/7/26 17:10
 * @Version 1.0
 */
public class PassObject {
    public static void main(String[] args) {
        Circle circle = new Circle();
        PassObject passObject = new PassObject();
        passObject.printAreas(circle, 5);
        System.out.println();
        System.out.println("now radius is:" + circle.radius);

    }
    public void printAreas(Circle c, int time){
        System.out.println("Radius" + "\t\t" + "Area");
        int i = 1;
        for (; i <= time; i++){
            c.radius = i;
            System.out.println(c.radius + "\t\t\t" + c.findArea(i));
        }
        c.radius = i;

    }

}
