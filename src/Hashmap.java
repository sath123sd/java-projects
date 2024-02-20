

import java.util.HashMap;

    public class Hashmap{
    public static void main(String[] args) {
        HashMap<Integer, String> languages = new HashMap<>();

        languages.put(1, "Ant");
        languages.put(2, "Cat");
        languages.put(3, "Mat");
        System.out.println("HashMap: " + languages);
        System.out.println("Keys: " + languages.keySet());
        System.out.println("Values: " + languages.values());
        System.out.println("Key/Value mappings: " + languages.entrySet());
    }
}
