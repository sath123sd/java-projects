import java.util.Scanner;
 class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter names (type 'END' to finish):");


        while (true) {
            System.out.print("Enter a name: ");
            String name = scanner.nextLine();

            if(name.equalsIgnoreCase("ENd")){
                break;
            }

            System.out.println("Name: " + name);
        }


        System.out.println("I am done.");

        scanner.close();
    }
}

