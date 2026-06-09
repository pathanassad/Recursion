class Recursion 
{  

    public int factorial(int x)
    {
        if(x<=1)
            return 1; 
        return x * factorial(x - 1); 
    }
}



public class R5  
{
    public static void main(String[] args)
    {
        Recursion recursion = new Recursion(); 
        int result = recursion.factorial(5);   
        System.out.println(result); 
    }
}
