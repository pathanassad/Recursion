class Recursion
{
    int count;
    public void times(int n)
    {
        if(count >= n)
            return;
        System.out.print("Asad ");
        count++;
        times(7);
    }
}



public class Demo
{
    public static void main(String[] args)
    {
        Recursion rec = new Recursion();
        rec.times(7);
    }
}