package Level2.HomeWork3;

import java.util.*;


public class Phone {
    private Map<String, Set<String>> phoneBook = new HashMap<>();

    public void add(String name, String phone) {
        Set<String> tell = phoneBook.getOrDefault(name, new HashSet<>());
        tell.add(phone);
        phoneBook.put(name, tell);
    }
    public Set<String> get(String name) {
        return  phoneBook.get(name);
    }
}
