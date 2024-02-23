
public class words {
    public static void main(String[] args) {
        String msg = "Bank sbi Welcomes You but you have to wait!!";
        System.out.println("The given String is: " + msg);
        int total = 1;
        for (int i = 0; i < msg.length(); i++) {
            if ((msg.charAt(i) == ' ') && (msg.charAt(i + 1) != ' ')) {
                total++;
            }
        }

        System.out.println("No of words in the string: " +  total);
    }
}
