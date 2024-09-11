public class Main
{
    public static void main(String[] args)
    {
        double num1 = 3.2;
        final int num2 = 4;
        boolean check = true;
        String name = "test";

        num1 = num1 + num2;
        double sum = num1;

        System.out.println("The sum is: " + sum);
        System.out.println("The " + name + " is " + check);
    }
}