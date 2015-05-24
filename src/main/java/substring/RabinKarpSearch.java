package substring;

public class RabinKarpSearch {
    private final int Q = 997;
    private final int R;
    private long patternHash;
    private int RM;
    private int M;

    public RabinKarpSearch(String pattern) {
        RM = 1;
        R = 256;
        M = pattern.length();

        for(int i = 1; i <= M - 1; i++) {
            RM = (R * RM) % Q;
        }

        patternHash = hash(pattern, M);
    }

    //gorners method of computing hash value of string of lenght M
    private long hash(String key, int M) {
        int h = 0;

        for (int i = 0; i < M; i++) {
            h = (h * R + key.charAt(i)) % Q;
        }

        return h;
    }

    public int search(String text) {
        int N = text.length();
        long txtHash = hash(text, M);

        if (txtHash == patternHash) return 0;

        for(int i = M; i < N; i++) {
            txtHash = (txtHash + Q - RM * text.charAt(i - M) % Q) % Q;
            txtHash = (txtHash*R + text.charAt(i)) % Q;
            if (patternHash == txtHash)
                return i - M + 1;
        }

        return N;
    }
}
