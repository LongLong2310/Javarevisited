class SCS
{


    // Finding the shortest common supersequence string
    public static void shortestCommonSupersequence(String lcs, String S1, String S2)
    {
        String result = "";
        int len = lcs.length();
        int p1=0, p2=0, p3=0;
        // for loop
        for(int i=0; i<len; i++)
        {
            while(S1.charAt(p1)!= lcs.charAt(p3))
            {
                result += S1.charAt(p1);
                p1++;
            }
            while(S2.charAt(p2)!= lcs.charAt(p3))
            {
                result += S2.charAt(p2);
                p2++;
            }
            result += lcs.charAt(p3);
            p1++;
            p2++;
            p3++;
        }

        System.out.printf("\nSCS : %s", result);
    }

    public static String lcs(String S1, String S2) {
        int m = S1.length();
        int n = S2.length();

        int[][] LCS_table = new int[m + 1][n + 1];

        // Building the matrix
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    LCS_table[i][j] = 0;
                else if (S1.charAt(i - 1) == S2.charAt(j - 1))
                    LCS_table[i][j] = LCS_table[i - 1][j - 1] + 1;
                else
                    LCS_table[i][j] = Math.max(LCS_table[i - 1][j], LCS_table[i][j - 1]);
            }
        }

        int index = LCS_table[m][n];
        int temp = index;

        char[] lcs = new char[index + 1];
        lcs[index] = '\0';

        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (S1.charAt(i - 1) == S2.charAt(j - 1)) {
                lcs[index - 1] = S1.charAt(i - 1);

                i--;
                j--;
                index--;
            }

            else if (LCS_table[i - 1][j] > LCS_table[i][j - 1])
                i--;
            else
                j--;
        }

        // Printing the sub sequences
        System.out.print("S1 : " + S1 + "\nS2 : " + S2 + "\nLCS: ");
        for (int k = 0; k <= temp -1 ; k++)
            System.out.print(lcs[k]);
        System.out.println("");

        return arr2str(lcs);
    }

    public static String arr2str(char[] arr){
        String result = "";
        for (int i = 0; i < arr.length - 1; i++){
            result += arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        // calling lcsAlgo()
        String S1 = "AGGTAB";
        String S2 = "GXTXAYB";

        String S3 = lcs(S1,S2);

        shortestCommonSupersequence(S3, S1,S2);
        System.out.println();
    }
}
