package teacher;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Ткаченко С.В.");
        list.add("Лобащук Т.И.");
        list.add("Федоров Н.П.");
        list.add("Лаптева З.Н.");
        list.add("Проценко Л.С.");

        int index = list.indexOf("Лаптева З.Н.");
        System.out.println("индекс самого лучшего учителя: " + index);

        int index1 = list.indexOf("Федоров Н.П.");
        System.out.println("индекс самого худшего учителя: " + index1);
    }
}
