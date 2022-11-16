package numbers;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numberList = new ArrayList<>();

            numberList.add(12);
            numberList.add(3);
            numberList.add(-8);
            numberList.add(75);
            numberList.add(22);
            numberList.add(123);
            numberList.add(16);
            numberList.add(49);
            numberList.add(34);

        System.out.println("Список чисел: \n" + numberList);

        System.out.println("Список чисел увеличенный на 1: ");
        ListIterator<Integer> numbers = numberList.listIterator();
        while (numbers.hasNext()) {
            Integer element = numbers.next() + 1;
            System.out.print(element + "; ");
        }
    }
}
