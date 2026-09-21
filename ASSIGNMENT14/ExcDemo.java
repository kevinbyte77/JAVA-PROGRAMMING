public class ExcDemo
{
    public static void main(String[] args)
    {
        try
        {
            int a = 10, b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error: Division by zero not allowed.");
        }

        System.out.println();

        try
        {
            int[] arr = new int[5];
            arr[10] = 50;

            String str = null;
            System.out.println(str.length());
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error: Array index is out of bounds.");
        }
        catch (NullPointerException e)
        {
            System.out.println("Error: Null reference used.");
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();

        try
        {
            System.out.println("Outer try block start");

            try
            {
                int[] numbers = {1, 2, 3};
                System.out.println(numbers[5]);
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Inner catch: Array index out of bounds.");
                int x = 10 / 0;
            }

            System.out.println("Outer try block end");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Outer catch: Arithmetic error - " + e.getMessage());
        }
    }
}
