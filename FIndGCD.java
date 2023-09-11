public class FIndGCD
{
    public int test(int n1, int n2)
    {
        int[] arr = new int[n1+n2];
        int max = 0;
        for(int i =1; i<n1+n2; i++)
        {
           if(n1%i==0 && n2%i==0)
           {
               arr[i] = i;
           }
        }
        for(int i =0; i< arr.length; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }
        return max;

    }
}
