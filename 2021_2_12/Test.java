package java_0121;


public class Test {
    public static void main(String[] args) {

        //向上转型
//        Animal animal = new Cat1();
//        Animal animal1 = new Bird();

        //向上转型也可能发生在方法传参过程中
//        func(new Cat1());

        //向上转型也可能发生在方法返回的时候
//        Animal animal = func2();//相当于Animal animal = new Cat1();
        //name是父类本身的属性，可以访问到
//        System.out.println(animal.name);
        //gender是子类的属性，是无法访问到
        //编译错误
        //System.out.println(animal.gender);

        //动态绑定，再运行时决定的
        //animal指向父类还是子类，是在运行时得知
//        Animal animal = new Animal();
//        animal.eat("🐟");//调用父类方法
//
//        Animal animal1 = new Animal();
//        animal1.eat("xx");//调用子类方法

        //体现多态，先创建几个子类的实例
//        Shape shape1 = new Rect();
//        Shape shape2 = new Circle();
//        Shape shape3 = new Flower();
//        Shape shape4 = new Triangle();

        //打印实例
//        draw(shape1);//调用draw方法
//        draw(shape2);
//        draw(shape3);
//        draw(shape4);

        //数组
        Shape[] shapes = {
                new Rect(),
                new Circle(),
                new Flower(),
                new Triangle()
        };
        for (Shape shape : shapes) {
            shape.draw();
        }


    }

    //当增加形状的时候，draw方法本身无需做出任何修改
    public static void draw(Shape shape) {
        shape.draw();
        //shape1 =>shape1.draw();开始调用Rect类里的draw方法，打印出“矩形”
    }


    public static Animal func2() {
        //向上转型也可能发生在方法返回的时候return语句
        return new Cat1();
    }

    public static void func(Animal animal) {

    }
}
