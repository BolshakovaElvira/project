package projectCollections;

public class Lesson2 {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add("elya", "546-123");
        phonebook.add("misha", "456-765");
        phonebook.add("elya", "111-486");

        System.out.println(phonebook.get("elya"));
    }
}
