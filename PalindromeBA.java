class Recursion
{
    public boolean isPalindrome(String n, int l, int r)
    {
        if (l>=r)
            return true;
        if(n.charAt(l)!= n.charAt(r))
            return false;

        return isPalindrome(n, l+1, r-1);


    }
}


public class PalindromeBA
{
    public static void main(String[] args) {
        String name = "markram";
        Recursion rec  = new Recursion();
        boolean result = rec.isPalindrome(name, 0, name.length()-1);
        if(result)
            System.out.println("It is a Palindrome");
        else
            System.out.println("It is not a Palindrome");

    }
}