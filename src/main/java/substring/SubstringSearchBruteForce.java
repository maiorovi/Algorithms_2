package substring;

public class SubstringSearchBruteForce {
    public int searchPattern(String text, String pattern) {
        int N = text.length();
        int M = pattern.length();

        for (int i = 0; i < N-M+1; i++) {

            for (int j = 0; j < M; j++ ) {
                if (text.charAt(i+j) != pattern.charAt(j))
                    break;

                if (j == M - 1)
                    return i;
            }
        }
        return N;
    }
}
