import java.util.Scanner;

//��ӡ1~100֮�����������ĺ�
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
//��ӡ1~100֮��������7�ı����������ĸ������ܺͣ�������ü�������˼�룩
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
        System.out.println("1~100֮��������7�ı����������ĸ���" + add);
        System.out.println("1~100֮��������7�ı����������ĺ�" + sum);
    }
}
//��ϰ3��
//��д�����1ѭ����150������ÿ�д�ӡһ��ֵ��������ÿ��3�ı������ϴ�ӡ����foo��,��ÿ��5�ı������ϴ�ӡ��biz��,��ÿ��7�ı������ϴ�ӡ�����baz����
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
//�������һ��100���ڵ����������������Ƕ��٣�
//
//�Ӽ�����������������ˣ���ʾ���ˣ����С�ˣ���ʾС�ˣ�������ˣ��Ͳ��ٲ��ˣ���ͳ��һ�����˶��ٴΡ�
//
//��ʾ������һ��[a,b] ��Χ��������ķ�ʽ��(int)(Math.random() * (b - a + 1) + a)
class ForExeca{
    public static void main(String arg[]){
        int random = (int) (Math.random() * 100) + 1;

        //int test = (int) Math.random();
        //System.out.println("�����"+test + random);

        //ʵ����Scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("������һ������(1-100):");
        int guess = scan.nextInt();

        int count = 1;
        while (random != guess){
            if(random > guess){
                System.out.println("С��");
            }else {
                System.out.println("����");
            }
            System.out.println("������һ������(1-100):");
            guess = scan.nextInt();
            count ++;
        }
        System.out.println("��ϲ����������һ������"+count+"�Σ�");
    }
}


//���� 1-100 ֮����������ֱ�������� 97 �����������һ�����˼��Σ�
//
//��ʾ��ʹ�� (int)(Math.random() * 100) + 1
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
        System.out.println("1-100�����������97һ��"+ count +"��");

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
