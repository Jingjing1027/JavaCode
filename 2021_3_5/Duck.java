package java_0124;

public class Duck extends Animal implements IFlying,IRunning,ISwimming{
    //继承父类name
    public Duck(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(name + "正在跑");
    }

    @Override
    public void fly() {
        System.out.println(name + "正在飞");
    }

    @Override
    public void swim() {
        System.out.println(name + "正在游");
    }
}
