package java_0102;

//一个.java文件中允许有多个类
//得有一个用public修饰的类，类名必须和文件严格相同
public class Person {
    //属性/成员变量/字段
    //直接写到类里面的就是“成员变量”
    //写到方法里面的变量就是“局部变量”
    public String name;
    public int age;
    public String sex;

    //方法/成员函数
    public void eat(String food) {
        System.out.println(name + "正在吃" + food);
    }
}
