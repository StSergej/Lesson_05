package zoopark_02;

import java.util.ArrayList;

public class ZooNew {
    public static void main(String[] args) {

        ArrayList<String> zoo = new ArrayList<>();

        zoo.add("Bear");
        zoo.add("Wolf");
        zoo.add("Fox");
        zoo.add("Tiger");
        zoo.add("Panda");
        zoo.add("Monkey");
        zoo.add("Giraffe");
        zoo.add("Elephant");

        System.out.println(zoo);
        int size = zoo.size();
        System.out.println("Размер списка: " + size);

        zoo.remove(6); //удаляем 3, 5, 7 животные
        zoo.remove(4);
        zoo.remove(2);
        System.out.println(zoo);

        int sizeNew = zoo.size();
        System.out.println("Размер списка после удаление: " + sizeNew);
    }
}
