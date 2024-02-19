
import java.io.*;
        import java.util.LinkedList;
public class LinkedListEX  {
    public static void main(String args[])
    {
        LinkedList<String> list = new LinkedList<String>();
        list.add("amu");
        list.add("san");
        list.add("tin");
        list.add("10");
        list.add("20");
        System.out.println("LinkedList:" + list);
        System.out.println(
                "The Object that is replaced is: "
                        + list.set(2, "tan"));
        System.out.println(
                "The Object that is replaced is: "
                        + list.set(4, "50"));
        System.out.println("The new LinkedList is:" + list);
    }
}

