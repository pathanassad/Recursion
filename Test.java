class BaseCondition
{
    int count = 0;
    public int run()
    {
        if(count == 4)
            return count;
        System.out.println(count);
        count++;
        return run();
    }
}


public class Test
{
    public static void main(String[] args)
    {
        BaseCondition bc = new BaseCondition();
        int result = bc.run();
        System.out.println("Function calls over");

    }
}