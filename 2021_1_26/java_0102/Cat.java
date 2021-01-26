package java_0102;

public class Cat {
    public String name;
    public String sex;
    public int age;
    public String color;

    //构造方法
//    public Cat() {
//        name = "mimi";
//        sex = "公";
//        age = 2;
//        color = "花";
//    }

    public Cat(String name) {
//        name = n;
        this.name = name;
        this.age = age;
    }
    //猫的行为，既方法
    public void eat(String food) {
        System.out.println(name + "正在吃" + food);
    }
    public void sleep() {
        System.out.println(name + "正在睡觉");
    }

}
