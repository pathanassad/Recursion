class Recursion
{
public int[] run(int l, int[] arr)
{
    if(l >= arr.length/2)
        return arr;

    // swapping
    int temp = arr[l];
    arr[l] = arr[arr.length - 1 - l];
    arr[arr.length -1 -l] = temp;

    return run(l+1, arr);

}
}
public class R6R2 {
public static void main(String[] args)
{
    int[] arr = {14, 13, 7, 9, 33};
    Recursion recursion = new Recursion();
    int[] result = recursion.run(0, arr);
    System.out.println("Reversed Array is");
    for(int n:result)
    {
        System.out.print(n + " ");
    }

}
}