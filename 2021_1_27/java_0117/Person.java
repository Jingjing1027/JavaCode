package java_0117;

public class Person {
    private int age;
    private String name;
    private String sex;
    private static int count = 0;

    public Person() {
        System.out.println("I am Person init()!");
    }

    //实例代码块
    {
        this.name = "bit";
        this.age = 12;
        this.sex = "男";
        System.out.println("I am Person init()!");
    }

    //静态代码块
    static {
        count = 10;
        System.out.println("I am Person init()!");
    }

    public void show() {
        System.out.println("name:" + name + "age:" + age + "sex" + sex);
    }
}
