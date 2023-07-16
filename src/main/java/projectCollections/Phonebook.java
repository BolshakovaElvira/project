package projectCollections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Phonebook {
    private Map<String, HashSet<String>> map;

    public Phonebook() {
        this.map = new HashMap<>();
    }

    public void add(String name, String phone) {
        HashSet<String> numbers;

        if (map.containsKey(name)) {
            numbers = map.get(name);
        } else {
            numbers = new HashSet<>();
        }
        numbers.add(phone);
        map.put(name, numbers);
    }

    public HashSet<String> get(String lastName) {
        return map.get(lastName);
    }
}
