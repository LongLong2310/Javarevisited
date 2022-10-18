import java.util.Scanner;

public class EditDistance {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String s1 = scn.nextLine();
        String s2 = scn.nextLine();

        System.out.println(editDist(s1, s2));

    }

    public static int editDist(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];

        /* this is the last column of the matrix which
         *  represents the result of empty string1
         *  and string2 starting from current row.
         */
        for (int row = s2.length(); row >= 0; row--) {
            dp[row][s1.length()] = s2.length() - row;
        }

        /* this is the last row of the matrix which
         * represents the result of empty string2
         *  and string1 starting from current col.
         */
        for (int col = s1.length(); col >= 0; col--) {
            dp[s2.length()][col] = s1.length() - col;
        }

        for (int col = s1.length() - 1; col >= 0; col--) {
            for (int row = s2.length() - 1; row >= 0; row--) {

                /* If characters are same, then the solution will be without
                 * these characters */
                if (s1.charAt(col) == s2.charAt(row)) {
                    dp[row][col] = dp[row + 1][col + 1];
                } else {
                    /* else it will be minimum of these three operations
                     */
                    dp[row][col] = 1 + Math.min(dp[row + 1][col + 1], // replace
                            Math.min(dp[row][col + 1]  //   removal
                                    , dp[row + 1][col]));   // insertion
                }
            }
        }

        return dp[0][0];
    }
}