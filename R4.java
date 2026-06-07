class Recursion
{
    int count = 1;
    int sum;
    public int run(int n)
    {
       if (count > n)
           return sum;
       sum = sum + count;
       count++;
       return run(6);


    }
}


public class R4
{
    public static void main(String[] args)
    {
        Recursion recursion = new Recursion();
        int result = recursion.run(6);
        System.out.println(result);
    }
}