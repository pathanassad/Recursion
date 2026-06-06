class Recursion
{
    int count = 1;
    public void run(int n)
    {
        if(count > n)
            return;
        System.out.print(count);
        count++;
        run(1);

    }
}

public class R2
{
    public static void main(String[] args)
    {
        Recursion recursion = new Recursion();
        recursion.run(1);

    }
}