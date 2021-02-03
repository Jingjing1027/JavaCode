package java_0120;

public class Animal {
    //protected可也被子类访问，也可以被同包的其他类访问
    protected String name;


    //构造方法alt+ins
    public Animal(String name) {
        this.name = name;
        System.out.println("Animal构造方法");
    }

    public void eat(String food) {
        System.out.println(name + "正在吃" + food);
    }
}
