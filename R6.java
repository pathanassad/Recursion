class Reverse
{
public int[] reverseArray(int[] arr)
{
    int n = arr.length;
    int[] reverse = new int[n];

    for (int i = 0; i<n; i++)
    {
        reverse[i] = arr[n - 1 - i];
    }

    return reverse;
}
}


public class R6
{

public static void main(String[] args)
{
    int[] arr = {1, 2, 3, 4, 5};
    Reverse rev = new Reverse();
    int[] result = rev.reverseArray(arr);
    System.out.println("Reversed Array is ");
    for(int n: result)
    {
        System.out.println(n);
    }

}
}