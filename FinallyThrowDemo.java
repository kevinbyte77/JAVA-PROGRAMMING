public class FinallyThrowDemo
{
    static void checkAge(int age) throws Exception
    {
        if (age < 18)
        {
            throw new Exception("Age must be 18 or above.");
        }

        System.out.println("Age is valid. Access granted.");
    }

    public static void main(String[] args)
    {
        try
        {
            checkAge(15);
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        finally
        {
            System.out.println("Age verification process completed.");
        }
    }
}