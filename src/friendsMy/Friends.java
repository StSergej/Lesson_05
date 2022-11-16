package friendsMy;

import java.util.ArrayList;
import java.util.Collections;

public class Friends {
    public static void main(String[] args) {

        ArrayList<String > element = new ArrayList<>();

        element.add("Михаил");
        element.add("Сергей");
        element.add("Антон");
        element.add("Леонид");
        element.add("Роман");
        element.add("Тарас");
        element.add("Владимир");

        System.out.println("Начальный список: " + element);

        Collections.sort(element);
        System.out.println("Список после сортировки: " + element);
    }
}
