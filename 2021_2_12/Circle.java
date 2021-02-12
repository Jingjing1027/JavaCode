package java_0121;

//圆是一种形状，符合is-a(继承)的语义，可以进行继承
public class Circle extends Shape{

    @Override
    public void draw() {
        System.out.println("o");
    }
}
