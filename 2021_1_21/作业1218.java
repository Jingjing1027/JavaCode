import java.util.Scanner;

public class 作业1218 {
    public static void main(String[] args) {
        //有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
//        int[] arr = {1,2,3,4,2,2};
//        findOneNum(arr);

        //求斐波那契数列的第n项。(迭代实现)
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入你想计算的项数");
//        int num = scanner.nextInt();
//        int result = fib(num);
//        System.out.println(result);

        //求1！+2！+3！+4！+........+n!的和
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入你想计算的数字：");
//        int n = scanner.nextInt();
//        int result = addFactor(n);
//        System.out.println(result);

        //求 N 的阶乘 。
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入你想计算的数字：");
//        int n = scanner.nextInt();
//        int result = factorial(n);
//        System.out.println(result);

        //调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
//        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
//        for (int i = 0; i < 10; i++){
//            for (int j = i+1;j < 10; j++){
//                if (arr[j] % 2 != 0) {
//                    int tmp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = tmp;
//                }
//            }
//            System.out.println(arr[i] + " ");
//        }

        //创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
        //​ 要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
//        Scanner scanner = new Scanner(System.in);
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        int num3 = scanner.nextInt();
//        int ret = max3(num1,num2,num3);
//        System.out.println(ret);


        //在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，
        // 还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
//        System.out.println(max(10,20));
//        System.out.println(max(10.2,12.4));
//        System.out.println(max(10.5,3.2,4));

        //在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 并执行代码，求出结果
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入两个整数：");
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        int ret1 =  sum(num1,num2);
//        System.out.println(ret1);
//        System.out.println("请输入三个小数：");
//        double num3 = scanner.nextDouble();
//        double num4 = scanner.nextDouble();
//        double num5 = scanner.nextDouble();
//        double ret2 = sum(num3,num4,num5);
//        System.out.println(ret2);

    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static double sum(double num3,double num4,double num5){
        return num3 + num4 + num5;
    }

    //
    public static int max(int num1, int num2) {
        int max = num1 > num2 ? num1 : num2;
        return max;
    }

    public static double max(double num1, double num2) {
        double max = num1 > num2 ? num1 : num2;
        return max;
    }

    public static double max(double num1, double num2, int num3) {
        double max = max(max(num1,num2),num3);
        return max;
    }

    //
    public static int max3(int num1, int num2, int num3) {
        int max = max2(max2(num1,num2),num3);
        return max;
    }

    public static int max2(int num1, int num2) {
        int max = num1 > num2 ? num1 : num2;
        return max;
    }

    public static int addFactor(int n) {
       int result = 0;
       for (int i = 1; i <= n;i++){
           result += factorial(i);
       }

       return result;
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <=n; i++){
            result *= i;
        }
        return result;
    }

    public static int fib(int num) {
        if (num <= 2) {
            return 1;
        } else {
            return (fib(num - 1) + fib(num - 2));
        }
    }

    public static void findOneNum(int[] arr) {
        int num = 0;
        for (int i = 0; i< arr.length; i++){
            num ^= arr[i];
        }
        System.out.println(num);
    }


}
