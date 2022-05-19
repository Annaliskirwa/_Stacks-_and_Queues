// Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

package Stacks;

public class subsequence {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        for (int j = 0; j < t.length(); j++){
            if (i == s.length()) return true;
            if (s.charAt(i) == t.charAt(j)) i++;
        }
        return i == s.length();
        
    }
}
