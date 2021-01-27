package java_0117;

public class Cat {
    //实例属性
    public String name;
    public String gender;

    //类方法/类属性---和类相关，和实例无关
    public static int n = 0;//永远不变

    //static修饰代码块
    static {

    }

    public static void func() {
        System.out.println("这是一个static方法");
    }

    //构造方法  alt+insert快速生成代码
    public Cat(String name, String gender) {
        this.name = name;//this是指向当前对象的引用
        this.gender = gender;

//        this.eat("🐟");
    }

    public void eat(String food) {
        System.out.println(name + "正在吃" + food);
    }

}
