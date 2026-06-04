class Hello
{
    public void hello()
    {
        System.out.println("Hello");
        hello();
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Hello recursion =  new Hello();
        recursion.hello();
    }
}