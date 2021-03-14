package java_0131;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println(arrayList.isEmpty());

        arrayList.add("c");
        arrayList.add("c++");
        arrayList.add("java");
        arrayList.add("python");
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
        System.out.println("尾插四次的结果 " + arrayList);

        //增
        arrayList.add(2, "javascript");
        System.out.println(arrayList.size());
        System.out.println("中间插入一次的结果 " + arrayList);

        //删
//        arrayList.remove("c");
//        System.out.println("按值删除 " + arrayList);

//        arrayList.remove(2);
//        System.out.println("按照位置删除 " + arrayList);

        //查
        boolean ret = arrayList.contains("java");
        System.out.println("查找Java的结果为：" + ret);

        int index = arrayList.indexOf("c");
        System.out.println("查找c的位置为 " + index);

        int lastindex = arrayList.lastIndexOf("java");
        System.out.println("从后往前遍历找Java的位置为 " + lastindex);

        //获取元素
        String elem = arrayList.get(0);
        System.out.println("0号元素为" + elem);

        //修改元素
        arrayList.set(0, "PHP");
        System.out.println("修改之后的顺序表为：" + arrayList);

        //遍历操作
        //1.通过下标来进行遍历
        System.out.println("通过下标来进行遍历:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        //2.通过迭代器来进行遍历
        System.out.println("通过迭代器遍历元素：");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String e = iterator.next();
            System.out.println(e);
        }

        //3.使用for-each来遍历
        System.out.println("使用for-each来遍历:");
        for (String e : arrayList) {
            System.out.println(e);
        }

    }
}