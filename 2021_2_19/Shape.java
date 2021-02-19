package java_0122;

//类前面加上abstract  此时就是一个抽象类
abstract public class Shape {
    //给方法前加abstract此时就是一个抽象方法
    //抽象方法不需要方法体
    //抽象方法只能在抽象类中存在，不能在普通的类中存在
    //抽象方法存在的意义就是为了让子类进行重写
    //abstract和private共同使用
    abstract public void draw();

}
