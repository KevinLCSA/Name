import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println(factRecurve(4));
        System.out.println(factIter(5));
        System.out.println(stringRecurve("Emanator"));
        int[] nums = {7, 2, 3, 1, 5};
        System.out.println(intArrayRecurve(nums, 0, 0));
        ArrayList<Integer> numsTwo = new ArrayList();
        numsTwo.add(2);
        numsTwo.add(7);
        numsTwo.add(2);
        System.out.println(intArrayListRecurve(numsTwo, 0, 0));

    }
    public static int factRecurve(int i)
    {
       if(i == 0) return 0;
       return i + factRecurve(i - 1);
    }
    public static int factIter(int i)
    {
        int sum = 0;
        for(int x = i; x > 0; x--)
        {
            sum += x;
        }
        return sum;
    }
    public static String stringRecurve(String x)
    {
        if(x == "") return "";
        return x.substring(0, 1) + " " + stringRecurve(x.substring(1));
    }
    public static int intArrayRecurve(int[] x, int y, int sum)
    {
        if(x[y] == 1) sum ++;
        if(y + 1 >= x.length) return 0;
        return sum + intArrayRecurve(x, y + 1, sum);
    }
    public static int intArrayListRecurve(ArrayList<Integer> x, int y, int sum)
    {
        if(x.get(y) == 1) sum ++;
        if(y + 1 >= x.size()) return 0;
        return sum + intArrayListRecurve(x, y + 1, sum);
    }
}
