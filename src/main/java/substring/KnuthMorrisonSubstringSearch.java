package substring;

public class KnuthMorrisonSubstringSearch {


    private int[][] constructDFA(String pattern, int R) {
        int M =  pattern.length();
        int dfa [][] = new int[R][M];
        dfa[pattern.charAt(0)][0] = 1;

        for(int x = 0, j = 1; j < M; j++) {
            for (int z = 0; z < R; z++) {
                dfa[z][j] = dfa[z][x];
            }
            dfa[pattern.charAt(j)][j] = j + 1;
            x = dfa[pattern.charAt(j)][x];
        }

        return dfa;
    }

    public int searchPattern(String text, String pattern, int R) {
        int dfa[][] = constructDFA(pattern, R);
        int M = pattern.length();
        int i = 0, j = 0;
        for(; i < text.length() && j < M; i++)
            j = dfa[text.charAt(i)][j];
        if (j == M)
            return i - M;
        else
            return text.length();
    }
}
