package java_0122;


class A {
    public A() {
        this.func();
    }
    public void func() {
        System.out.println("A.func");
    }
}

class B extends A{
    private int num = 1;

    @Override
    public void func() {
        //出现在初始化之前
        System.out.println("B.func " + num);
    }
}

//通过这个代码来说明，在构造方法中调用重写的方法带来的问题
public class Test2 {
    public static void main(String[] args) {
        //1.A 是 B 的父类，构造 B 的时候，就需要先构造 A 的实例
        //2.构造 A 的实例，就会调用 A 的构造方法
        //3.调用 A 的构造方法的时候，此时就会调用到this.func（），此时的this指向子类的实例触发动态绑定
//        B b = new B();

        //Shape 本身虽然也有draw方法，此时draw方法没有实质的内容
        //存在的目的只是为了让其他的子类进行重写
        //Shape 本身也不需要去创建实例，Shape存在的目的是为了创建Shape的子类

        //像这样不需要去实例化（没有实例化必要的类）/l；/就可以把这个类作为一个抽象类
        //像这种本身没有方法体，只是为了被子类重写的方法 ，就可以把这个方法作为一个 抽象方法

        Shape shape = new Circle();
        Shape shape1 = new Rect();
    }
}
