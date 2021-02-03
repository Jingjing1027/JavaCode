package java_0120;

public class Cat extends Animal {

    public Cat(String name) {
        //通过super关键字调用父类的构造方法(有一个String参数版本的构造方法)
        super(name);//显式调用，父类构造方法放在第一行
        System.out.println("Cat类构造方法");
    }

    public void jump() {
//        System.out.println(this.name + "正在跳");
//        System.out.println(super.name + "正在跳");
        System.out.println(name + "正在跳");
    }
}
