package java_0119;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //不区分大小写比较
//        String str1 = "hello";
//        String str2 = "Hello";
//        System.out.println(str1.equals(str2)); //区分大小写
//        System.out.println(str1.equalsIgnoreCase(str2));//不区分大小写

        //compareTo比较字符串大小关系
//        int result = str1.compareTo(str2);
//        System.out.println(result);

        //字符串查找
//        String str = "helloworld";
//        System.out.println(str.contains("world"));   //contains包含
//
//        String a = "hello world world";
//        String b = "world";
//        System.out.println(a.indexOf(b));  //
//
//        int result = a.indexOf(b);
//        System.out.println(result);
//        result = a.indexOf(b,result + 1);  //继续从下标为6开始查找
//        System.out.println(result);
//
//        System.out.println(a.lastIndexOf(b));

//        System.out.println(a.startsWith(b));
//        System.out.println(a.endsWith(b));

        //字符串替换
//        String str = "hello";
//        System.out.println(str.replace("h","u"));
//        System.out.println(str.replaceFirst("l","-") );//regex 正则表达式

        //字符串拆分
//        String str = "hello world hello me";
//        String[] result = str.split(" ");//按照空格拆分
//        for (String s: result) {
//            System.out.println(s);
//        }
//        System.out.println(Arrays.toString(result));

        //正则表达式
//        String a = "192.168.1.2";
        //正则表达式见到’\.'才是当成。本身来看待
        //java的字符串又把\当初Java的转义字符.为了表示一个原始的\,需要再次转义
//        String[] result1 = a.split("\\."); //两次转义

//        String[] result = a.split(".");
//        System.out.println(Arrays.toString(result1));

        //多次拆分
//        String str = "name=zhangsan&age=18";
//        String[] result = str.split("&");
//        for (int i = 0; i < result.length; i++) {
//            String[] temp = result[i].split("=");
//            System.out.println(temp[0]+" = "+temp[1]);

        //字符串截取
//        String a= "hello world java";
        //前闭后开
//        System.out.println(a.substring(6,11));

//        String str = "  hello   nnn  ";
//        System.out.println("[" + str.trim() + "]");

        //1.append使用append能够把字符串内容进行追加，相当于String的+=
        //String的+=会产生新的String对象，如果再循环使用，比较低效
//        StringBuilder stringBuilder = new StringBuilder("hello");
//        for (int i = 0; i < 100; i++) {
//            stringBuilder.append(i);
//        }
//        System.out.println(stringBuilder);

        //直接修改本身
//        stringBuilder.reverse();
//        System.out.println(stringBuilder);

//        stringBuilder.delete(2,4);
//        System.out.println(stringBuilder);



    }
}

