import java.util.Scanner;
class positive_Negative
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = input.nextInt();
        if(num>0)
            System.out.println("Positive Number");
        else if(num<0)
            System.out.println("Negative Number");
        else
            System.out.println("Zero");
    }
}
