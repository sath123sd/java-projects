

import java.util.HashSet;

class HashSetEX {
    public static void main(String[] args) {
        HashSet<String> hash_set = new HashSet<String>();
        hash_set.add("a");
        hash_set.add("b");
        hash_set.add("c");
        hash_set.add("d");
        System.out.println("HashSet: " + hash_set);
        int size = hash_set.size();
        System.out.printf("Size of HashSet is: %d \n", size);
        hash_set.remove("b");
        System.out.println("HashSet after removal: " + hash_set);

    }
}
