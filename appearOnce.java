class appearOnce
{
    private static int findSingle(int[] ar)
    {
        // Do XOR of all elements and return
        int res = ar[0];
        for (int i = 1; i < ar.length; i++)
            res = res ^ ar[i];

        return res;
    }

    // Driver code
    public static void main (String[] args)
    {
        int ar[] = {2, 3, 5, 4, 5, 3, 4};
        System.out.println("Element occurring once is " +
                findSingle(ar) + " ");
    }
}


