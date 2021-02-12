package java_0121;

public class Animal {
    public String name = "小动物";

    public void eat(String food) {
        System.out.println("我是一只小动物");
        System.out.println(name + food);
    }



    //toString就是Object的方法
    public String toString() {
        return "hello";
    }
}
