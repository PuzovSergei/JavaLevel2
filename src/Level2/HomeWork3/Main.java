package Level2.HomeWork3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] words = {"aa","bb","cc","dd","ee","aa","aa","bb","cc","gg","hh","ee"};
        System.out.println(Arrays.toString(words));

        Map<String, Integer> hMap = new HashMap<>();
        for (String x : words) {
            hMap.put(x, hMap.getOrDefault(x, 0) + 1);
        }
        System.out.println(hMap);

        Phone phBook = new Phone();
        phBook.add("Иванов", "123456");
        phBook.add("Иванов", "456789");
        phBook.add("Петров", "789456");
        phBook.add("Сидоров", "321654");
        phBook.add("Петров", "654987");

        System.out.println("Тел: " + phBook.get("Иванов"));
        System.out.println("Тел: " + phBook.get("Петров"));
        System.out.println("Тел: " + phBook.get("Сидоров"));
    }
}
