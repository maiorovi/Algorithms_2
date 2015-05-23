package mst;

public class BoyerMoureSubstringSearch {
    private String pattern;
    private int[] right;

    public BoyerMoureSubstringSearch(String pattern) {
        this.pattern = pattern;
        right =  buildRightSubArray(pattern);
    }

    private int[] buildRightSubArray(String pattern) {
        int R = 256;
        int[] right = new int[R];

        for(int i = 0; i < R; i++)
            right[i] = -1;
        for(int i = 0; i < pattern.length(); i++)
            right[pattern.charAt(i)] = i;

        return right;
    }


    public int search(String text) {
        int N = text.length();
        int M = pattern.length();
        int skip;

        for(int i = 0; i < N - M; i+=skip) {
            skip = 0;
            for(int j = M - 1; j > 0; j--) {
                if (pattern.charAt(j) != text.charAt(j)) {
                    skip = j - right[text.charAt(i+j)];
                    if (skip < 1) skip = 1;
                    break;
                }
            }
            if (skip == 0) return i;
        }

        return N;
    }

}
