import java.util.Random;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {

        //不用方法完成
        // 计算 1! + 2! + 3! + 4! + 5!
//        int result = 0;
//        for(int num = 1; num <= 5; num++) {
//            int factorResult = 1;
//            for(int i = 1; i <= num; i++) {
//                factorResult *= i;
//            }
//            result += factorResult;
//        }
//        System.out.println(result);

        //使用方法完成 ---1
//        int result = 0;
//        for (int num = 1; num <= 5; num++) {
//            result += factor(num);  //调用factor方法
//        }
//        System.out.println(result);


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入两个整数：");
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int result = min(a,b);
//        System.out.println(result);

        //打印 1 - 100 之间所有的素数
//        printAllPrime(1,100);

        //输出1000-2000之间所有的闰年
//        printAllLeapYear(1000,2000);

        //输出乘法口诀表
//        printMultiplicationTable();

        //求两个正整数的最大公约数
//        int result = calcGCD(100,120);
//        System.out.println(result);

        //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/n 的值（n 一定是偶数）
//        double result = calcSeries(100);
//        System.out.println(result);

        //编写程序数一下 1到 100 的所有整数中出现多少个数字9
//        int count = calcNineCount(1,100);
//        System.out.println(count);

        //求出0～999之间的所有“水仙花数”并输出
//        printAllNarcissusNum(0,999);

        //猜数字
//        guessNumberGame();

        //编写代码模拟三次密码输入的场景
//        login();

        //阶乘
//        int result = 0;
//        for (int i = 1; i <= 5; i++) {
//            result += fac(i);
//        }
//        System.out.println(result);

        //重载（overload）
        System.out.println(add(10,20));
        System.out.println(add(10.5,20.5));

        //重写（override）

    }
    //
    public static int add(int a, int b) { //形参
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }



    //
    public static int fac(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    //---11
    public static void login() {
        String password = "123456";
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        for (i = 0; i < 3; i++) {
            System.out.println("请输入您的密码：");
            String input = scanner.next();
            if (input.equals(password)) {
                System.out.println("登陆成功");
                break;
            } else {
                System.out.println("登录失败");
            }
        }
        if (i == 3) {
            System.out.println("你已经输错三次密码，程序退出");
        }

    }

    //---10
    public static void guessNumberGame() {
        while (true) {
            //mnue
            //返回值表示玩家输入的选项
            //玩家输入1表示开始游戏
            //玩家输入0表示结束整个程序
            int choice = menu();
            if (choice == 1) {
                game();
                break;
            }else if (choice == 0) {
                System.out.println("GoodBye");
            }else {
                System.out.println("输入错误，请重新输入");
            }
        }
    }

    public static void game() {
        //1.先生成一个1-100之间的随机数
        Random random = new Random();
        int toGuess = random.nextInt(100)+1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("猜1-100之间的数");
        while (true) {
            //2.提示玩家输入整数
            int guess = scanner.nextInt();
            //3.判断
            if (guess < toGuess) {
                System.out.println("低了");
            }else if (guess > toGuess) {
                System.out.println("高了");
            }else {
                System.out.println("猜对了");
                break;
            }
        }

    }

    public static int menu() {
        System.out.println("=================");
        System.out.println("====1.开始游戏====");
        System.out.println("====0.退出游戏====");
        System.out.println("=================");
        System.out.println("==请输入你的选择:==");
        Scanner scanner = new Scanner(System.in) ;
        int choice = scanner.nextInt();
        return choice;
    }


    //---9
    public static void printAllNarcissusNum(int begin, int end) {
        for (int i = begin; i <= end; i++){
            if (isNarcissusNum(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isNarcissusNum(int i) {
        int ge = i % 10;
        int tmp = i / 10;
        int shi = tmp % 10;
        tmp = i / 100;
        int bai = tmp % 10;
        if(cube(ge) + cube(shi) + cube(bai) == i){
            return true;
        }
        return false;
    }
    public static int cube(int num){
        return num * num * num;
    }


    //---8
    public static int calcNineCount(int begin, int end) {
        int count = 0;
        for (int i = begin; i <= end; i++) {
            count += calcCurrentNumNineCount(i);
        }
        return count;
    }

    public static int calcCurrentNumNineCount(int num) {
        int count = 0;
        while(num != 0){
            int ge = num % 10;
            if (ge == 9) {
                count++;
            }
            num = num / 10;
        }
        return count;
    }

    //---7
    public static double calcSeries(int bound) {
        //只考虑项和项之间的求和
        double result = 0;
        for (int i = 1; i <= bound; i += 2){
            //calaItem相当于把相邻的两下给合并
            result += calcItem(i);
        }
        return result;
    }

    public static double calcItem(int i) {
        return 1.0 / i - 1.0 / (i + 1);
    }

    //---6
    public static int calcGCD(int a, int b) {
        int min = min(a,b);
        for (int i = min; i >= 1; i--){
            if (a % i == 0 && b % i == 0){
                return i;
            }
        }
        return 1;
    }

    //---5
    public static void printMultiplicationTable() {
        //打印行
        for (int row = 1; row <= 9; row++) {
            printLine(row);
        }
    }

    public static void printLine(int row) {
        //只打印一行
        for (int col = 1; col <= row; col++) {
            System.out.print(col + "x" + row + "=" + col * row + " ");
        }
        System.out.println();
    }

    //---4
    public static void printAllLeapYear(int begin,int end){
        for (int year = begin; year <= end; year++){
            if(isLeapYear(year)){
                System.out.println(year);
            }
        }
    }

    public static boolean isLeapYear(int year){
        if(year % 100 == 0) {
            if (year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        }else{
            if (year % 4 == 0){
                return true;
            }else {
                return false;
            }
        }
    }

    //---3
    public static void printAllPrime(int begin,int end){
        for (int i = begin; i <= end; i++) {
            if(isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int num){
        if (num == 1){
            return false;
        }
        //找反例
        for (int i = 2;i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return  true;
    }

    //---2
    public static int min(int x,int y) {
        if (x < y){
            return x;
        }
        return y;
    }

    //---1
    public static int factor(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result += i;
        }
        return result;
   }


}
