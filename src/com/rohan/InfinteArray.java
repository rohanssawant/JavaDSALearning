public class InfinteArray
{
    public static void main(String[] args)
    {
        int[] arr = {3, 5, 7, 9, 10, 90,
                     100, 130, 140, 160, 170
                    };
        int target = 10;
        System.out.print(findingAns(arr, target));
    }


    static int findingAns(int[] arr, int target)
    {
        //initialize s, e with 0,1 resp ie size of box is 2
        int s = 0;
        int e = 1;

        while(target > arr[e])
        {
            s = e + 1;
            e = 2 * s + 1;

            // int newStart = e + 1;
            // e = e + (e - s + 1) * 2;
            // s = newStart;


        }
        return binarySearch(arr, target, s, e);
    }

    static int binarySearch(int[] arr, int target, int s, int e)
    {
        while(s <= e)
        {
            int m = s + (e - s) / 2;
            if(target < arr[m])
            {
                e = m - 1;
            }
            else if (target > arr[m])
            {
                s = s + 1;
            }
            else
            {
                return m;
            }
        }
        return -1;
    }


}