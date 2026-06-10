class Pali
{
    public boolean run(String n)
    {
        String reversed = "";
        for(int i = n.length() - 1; i>=0; i--)
        {
            reversed  = reversed + n.charAt(i);

        }
        if(n.equals(reversed))
            return true;

        return false;

    }
}

public  class R7
{
    public static void main(String[] args)
    {
        Pali pal = new Pali();
        boolean result = pal.run("Dans");
        if(result == true)
            System.out.println("String is Palindrome");
        else
            System.out.println("String is not Palindrome");

    }
}