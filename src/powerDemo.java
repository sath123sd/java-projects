
    import java.util.Scanner;

class PowerDemo
    {
        public static void main(String[] args)
        {
            Scanner console = new Scanner(System.in);

            int base;
            int power;
            int result = 1;

            System.out.print("Enter the base number ");
            base = console.nextInt();

            System.out.print("Enter the power ");
            power = console.nextInt();

            for(int i = 1; i <= power; i++)
            {
                result *= base;
            }

            System.out.println("Result: "+ result);
        }
    }

