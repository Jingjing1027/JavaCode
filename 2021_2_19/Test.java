package java_0122;

import java.awt.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        //以顺序表，链表为例
        //向上转型
//        List<String> list = new ArrayList<>();
//        List<String> list1 = new LinkedList<>();
//
//        //
//        list.add("hello");
//
//        Map<String,String> map = new HashMap<>();
//        Map<String,String> map2 = new TreeMap<>();
//
//        map.put("hello", "hello");

        //向上转型
        Animal animal = new Cat();

        //向下转型
        Cat cat = (Cat)animal;


    }

}
