package java_0120;

public class Main {
    public static void main(String[] args) {
        //构造方法有形参，new时也要有
        Cat cat = new Cat("小黑");
        //name和eat是从Animal中继承下来
        //cat.eat("🐟");
        //jump
        cat.jump();

//        Bird bird = new Bird("mimi");
//        bird.fiy();
//        bird.eat("mi");
    }
}
