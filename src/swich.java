

class main {
    public static void main(String[] args) {

        int number = 44;
        String name;

        // switch statement to check size
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