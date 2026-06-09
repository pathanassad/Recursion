class Recursion
{
public int[] run(int l, int r, int[] arr)
{

    if (l>=r)
        return arr;

    // swapping
    int temp = arr[l];
    arr[l] = arr[r];
    arr[r] = temp;

    return run(l+1, r-1, arr);
}
}

public class R6R
{
public static void main(String[] args)
{
    int[] arr = {14, 10, 26, 64, 89};
    Recursion rec = new Recursion();
    int[] result = rec.run(0, arr.length - 1, arr);
    System.out.println("Reversed Array is ");
    for(int n: result)
    {
        System.out.print(n + " ");
    }
}
}