class Recursion
{
    String reversed = "";
    public String palindrome(String n, int  i)
    {

       if(i < 0)
           if(n.equals(reversed))
                return "String is Palindrome";
            else
                return  "String is not Palindrome";

        reversed = reversed + n.charAt(i);


        return palindrome(n, i-1);

}
}

public class R7R
{
    public static void main(String[] args) {
        Recursion rec = new Recursion();
        String n = "Asad";
        String result = rec.palindrome(n, n.length() - 1);
        System.out.println(result);
    }
}