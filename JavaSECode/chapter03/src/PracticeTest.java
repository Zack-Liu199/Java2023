import java.util.Scanner;

//打印1~100之间所有奇数的和
class PracticeTest {
    public static void main(String arg[]){
        int i = 0;
        int sum = 0;
        for(i=0 ; i <=100 ; i++){
            if (i % 2 == 1){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
//打印1~100之间所有是7的倍数的整数的个数及总和（体会设置计数器的思想）
class ForExer2{
    public static void main(String arg[]){
        int add = 0;
        int sum =0;
        for(int i=1;i<=100;i++){
            if(i % 7 == 0){
                add += 1;
                sum += i;
            }
        }
        System.out.println("1~100之间所有是7的倍数的整数的个数" + add);
        System.out.println("1~100之间所有是7的倍数的整数的和" + sum);
    }
}
//练习3：
//编写程序从1循环到150，并在每行打印一个值，另外在每个3的倍数行上打印出“foo”,在每个5的倍数行上打印“biz”,在每个7的倍数行上打印输出“baz”。
class ForExer3{
    public static void main(String arg[]){
        for(int i = 1; i <= 150; i++){
            String a="";
            String b="";
            String c="";
            if(i % 3 == 0) a = " foo";
            if(i % 5 == 0) b = " biz";
            if(i % 7 == 0) c = " baz";
            System.out.println(i + a + b + c);
        }
    }
}
//随机生成一个100以内的数，猜这个随机数是多少？
//
//从键盘输入数，如果大了，提示大了；如果小了，提示小了；如果对了，就不再猜了，并统计一共猜了多少次。
//
//提示：生成一个[a,b] 范围的随机数的方式：(int)(Math.random() * (b - a + 1) + a)
class ForExeca{
    public static void main(String arg[]){
        int random = (int) (Math.random() * 100) + 1;

        //int test = (int) Math.random();
        //System.out.println("随机数"+test + random);

        //实例化Scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个整数(1-100):");
        int guess = scan.nextInt();

        int count = 1;
        while (random != guess){
            if(random > guess){
                System.out.println("小了");
            }else {
                System.out.println("大了");
            }
            System.out.println("请输入一个整数(1-100):");
            guess = scan.nextInt();
            count ++;
        }
        System.out.println("恭喜你答对啦！！一共猜了"+count+"次！");
    }
}


//生成 1-100 之间的随机数，直到生成了 97 这个数，看看一共用了几次？
//
//提示：使用 (int)(Math.random() * 100) + 1
class WhileExec{
    public static void main( String[] arg){

        int count=0;
        while(true){
            int i = (int)(Math.random() * 100) + 1;
            if(i == 97){
                break;
            }
            count++;
        }
        System.out.println("1-100随机数，生成97一共"+ count +"次");

    }
}

class Learn{
    public static void main(String[] arg){
        int random = (int)(Math.random() * 100)+1;
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        scanner.close();
    }
}
