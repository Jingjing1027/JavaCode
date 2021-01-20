import java.util.Random;
import java.util.Scanner;

public class Practice1203 {
    public static void main(String[] args) {
        //完成猜数字游戏 ，用户输入数字，判断该数字是大于，小于，还是等于随机生成的数字，等于的时候退出程序。
        //1.先生成1个1-100的随机数
//        Random random = new Random();
//        //[0,100)
//        int toGuess = random.nextInt(100);
//        //2.循环的提示用户来输入数字
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("请输入你猜的数字:");
//            int num = scanner.nextInt();
//            //3.根据用户的输入进行判定
//            if (num < toGuess){
//                System.out.println("低了");
//            }else if (num > toGuess) {
//                System.out.println("高了");
//            }else {
//                System.out.println("你猜对了！！！");
//                break;
//            }
//        }

        //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值 。
//        int i = 0;
//        float sum = 0;
//        for (i = 1; i <=100 ; i++) {
//            if (i %2 ==1) {
//                sum += 1.0/i;
//            }else{
//                sum -= 1.0/i;
//            }
//        }
//        System.out.println(sum);

        //求两个正整数的最大公约数(辗转相除法)
//        int a = 10;
//        int b = 20;
//        int c = 0;
//        while (true){
//            c = a % b;
//            if (c == 0){
//                break;
//            } else {
//                a = b;
//                b = c;
//            }
//        }
//        System.out.println(b);

        //编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,密码错误， 可以重新输 入，最多输入三次。三次均错，则提示退出程序
        //初始化一个密码
        String my_password = new String("123456");
        Scanner scanner = new Scanner(System.in);
        //记录输入密码次数
        int count = 0;
        System.out.println("请输入6位数的密码：");
        //比较输入次数
        for (count = 0; count < 3; count++) {
            String password = scanner.nextLine();
            if (my_password.equals(password)) {
                System.out.println("登录成功");
            } else if (!(my_password.equals(password)) && count <=1) {
                System.out.println("输入错误，请重新输入：");
            } else if (!(my_password.equals(password)) && count <=2) {
                System.out.println("连续三次错误，退出程序！");
            }
        }


        //输出n*n的乘法口诀表，n由用户输入。
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        //外层循环
//        for (int i = 1; i <= n; i++) {
//            //内层循环
//            for (int j = 1; j <= i; j++) {
//                System.out.printf("%d x %d = %-2d  ",j,i,i*j);
//            }
//            System.out.println();
//        }

        //求一个整数，在内存当中存储时，二进制1的个数。
//        int num = 10;  //00000000 00000000 00000000 0000101
//        int count = 0;
//        for (int i = 0; i < 32; i++) {
//            if (((num >> i) & 1) == 1){
//                count++;
//            }
//        }
//        System.out.println(count);

        //输出一个整数的每一位，如：123的每一位是1 ， 2 ， 3
//        System.out.print("输入一个3位数的正整数:");
//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        for (int i = 0; i < 3 ; i++) {
//            int n = num % 10;
//            num = num / 10;
//            System.out.print(n + " ");
//        }
    }
}
