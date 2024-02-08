

public class swich {
    public static void main(String[] args) {

        int number = 44;
        String name = ""; // Initializing the variable 'name' with an empty string

        switch (number) {

            case 29:
                name="rose";
                break;

            case 42:
                name="lily";
                break;

            case 44:
                name="jasmine";
                break;

            case 48:
                name="tulip";
                break;

            default:
                name="flowers";
                break;

        }
        System.out.println("name: " + name);
    }
}
