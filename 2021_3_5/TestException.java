package java_0124;

import java.util.Scanner;

public class TestException {

    public static void main(String[] args) {
//        int a = 10;
//        int b = 0;
//        System.out.println(a / b);

        //1.异常示例
//        int[] a = {1,2,3};
//        System.out.println(a[100]);

        //2.使用try catch后的程序执行过程
//        try {
//            System.out.println("try中异常之前的代码");
//            int[] a = null;
//            System.out.println(a[0]);
//            System.out.println("try中异常之后的代码");
//
//        } catch (NullPointerException e) {
//            System.out.println("catch中的代码");
//            e.printStackTrace();
//        }
//        System.out.println("hello");

        //3.catch只能处理对应种类的异常
//        try {
//            System.out.println("try中异常之前的代码");
//            int[] a = {1,2,3};
//            System.out.println(a[100]);
//            System.out.println("try中异常之后的代码");
//
//        } catch (NullPointerException e) {
//            System.out.println("catch中的代码");
//            e.printStackTrace();
//        }
//        System.out.println("hello");

        //4.一个catch可以对应多个catch
//        try {
//            System.out.println("try中异常之前的代码");
//            int[] a = null;
//            System.out.println(a[0]);
//            System.out.println("try中异常之后的代码");
//
//        } catch (NullPointerException e) {
//            System.out.println("catch空指针异常");
//            e.printStackTrace();
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("catch下标越界");
//        }

        //5.使用一个catch捕获所有异常
//        try {
//            System.out.println("try中异常之前的代码");
//            int[] a = {1,2,3};
//            System.out.println(a[100]);
//            System.out.println("try中异常之后的代码");
//
//        } catch (Exception e) {
//            System.out.println("catch异常");
//            e.printStackTrace();
//        }

        //6.finally表示最后的善后工作，例如释放资源
//        try {
//            System.out.println("try中异常之前的代码");
//            int[] a = {1, 2, 3};
//            System.out.println(a[0]);
//            System.out.println("try中异常之后的代码");
//        } catch ( Exception e) {
//        System.out.println("catch异常");
//        } finally {
//            //无论是前面的代码中是否触发异常，都会执行到
//            System.out.println("finally");
//        }
//        System.out.println("hello");

        //7.使用try进行回收操作
//        Scanner scanner = null;
//        try {
//            scanner = new Scanner(System.in);
//            return;
//        } catch (NullPointerException e) {
//            System.out.println("空指针异常");
//        } finally {
//            //关闭scanner
//            scanner.close();
//        }

        //try with rescources
//        try (Scanner scanner = new Scanner(System.in)) {
//            //使用Scanner来进行若干操作
//        } catch (NullPointerException e) {
//            System.out.println("空指针异常");
//        }

        //8.如果当前方法中没有合适的处理异常的方式，就会沿着调用栈向上传递
//        fun1();

        //9.
    }

//    public static void fun1() {
//            fun2();
//    }
//
//    public static void fun2() {
//            int[] a = {1,2,3};
//            System.out.println(a[100]);
//
//    }
}
