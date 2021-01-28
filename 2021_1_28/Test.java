package java_0118;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//        String a = "hello";
//        String b = "hello";
//        //比较俩地址是否相等
//        System.out.println(a == b);  //true
        
//        //如果要想比较两个字符串的内容，用equals
//        String str1 = new String("Hello");
//        String str2 = new String("Hello");
//        System.out.println(str1.equals(str2));  //true
//        System.out.println(str1 == str2);//false

//        String a = new String();
//        //一旦a是null，抛出异常
//        if (a.equals("hello")) {
//
//        }

        //建议使用
        //如果a是null，不会抛出异常，返回false
//        if ("hello".equals(a)) {
//            System.out.println("相等");
//        } else {
//            System.out.println("不相等");
//        }

//        String a = new String("hello").intern();//池
//        System.out.println(a == "hello");

//        String str = "hello";
        //通过反射的方式修改“hello”的内容
        //反射式特殊手段，不是常规手段

        //特殊手段
        //1.获取String的类对象
        //2.根据“value”这个字段名字，在类对象中拿到对应的字段

//        Field valueField = String.class.getDeclaredField("value");
//        //让value这个private的成员也能被访问
//
//        valueField.setAccessible(true);
//        //3.根据图纸，把str这个对象给拆开，取出里面的零件
//        char[] value = (char[])valueField.get(str);
//
//        //4.修改零件
//
//        value[4] = 'a';
//        System.out.println(str);

        //字符 =>字符串
//        char[] value = {1,2,3,4};
//        String s = new String(value);

        //字符串=>字符
//        String s = "abcd";
//        System.out.println(s.charAt(0));
//        System.out.println(s.charAt(1));
//        System.out.println(s.charAt(2));
//        System.out.println(s.charAt(3));
//        //使用.length（）方法取到字符串长度，而数组的长度.length这是一个属性
//        System.out.println(s.length());

        //字符串转字节
        String s = "hello";
        //String转byte[]
        byte[] data = str.getBytes();
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i] + "");
        }
        //byte[] 转 String
        System.out.println(new String(data));
    }
}
