class Recursion
{


    public void run(int n)
    {
     if(n < 1)
         return;
     System.out.print(n + " ");

     run(n-1);



    }




}

public class R3
{
    public static void main(String[] args)
    {
        Recursion recursion = new Recursion();
        recursion.run(2);
    }
}