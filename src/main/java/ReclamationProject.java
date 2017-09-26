/*
 * The following code needs a lot of TLC. So give it some! 1. Fix all checkstyle errors 2. Determine
 * what it does (it's going to be tough before you finish #1) 3. Improve the name of the methods and
 * variables 4. Add comments and Javadoc comments where needed 5. Remove unnecessary comments as
 * appropriate
 */

/**
 *
 */
public class ReclamationProject {
    /**
     * Finds the longest common substring
     * @param a some string value.
     * @param b some string value.
     * @return r returns longest common substring.
     */
    public static String doIt(final String a, final String b) {
        // gets rid of final parameter variable by assigning to local variable
        String s1 = a;
        String s2 = b;

     // if s1 is longer than s2, switch values
        if (s1.length() > s2.length()) {
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }
        String r = "";

        // while i is less than the length of s1, increments i
        for (int i = 0; i < s1.length(); i++) {
            // j = length of string, decrements backwards
            for (int j = s1.length() - i; j > 0; j--) {
                // while k is shorter than length of s2 - j
                for (int k = 0; k < s2.length() - j; k++) {
                    if (s1.regionMatches(i, s2, k, j) && j > r.length()) {
                        r = s1.substring(i, i + j);
                    }
                }
            }
        }
        return r;
    }
}
