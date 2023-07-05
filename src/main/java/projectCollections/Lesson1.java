package projectCollections;

import java.util.*;

public class Lesson1 {
    public static void main(String[] args) {
        String[] array = new String[]{"hello", "abc", "hello", "dog", "house"
                , "hello", "house", "power", "abc", "happy"
                , "qwery", "cat", "city", "khabarovsk", "cat"};

        Map<String, Integer> map = new HashMap<>();
        for (String word : array) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        Set<String> unique = new HashSet<>(Arrays.asList(array));
        System.out.println(unique);
    }
}
