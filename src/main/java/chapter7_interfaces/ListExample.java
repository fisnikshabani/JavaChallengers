package chapter7_interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListExample {

    public static void main(String[] args) {
        addElement(new ArrayList());
        addElement(new LinkedList());
        addElement(new Vector());
        addElement(new CopyOnWriteArrayList());
    }

    static void addElement(List list){
        list.add("Adding elements with differenct types of lists");
        System.out.println(list + ":" + list.getClass().getSimpleName());
    }
}
