package algos;

/**
 * Created by shazra on 1/29/16.
 */
public class QuickFindUnion {

    private int[] id;

    public QuickFindUnion(int N) {
        id = new int[N];
        for ( int i = 0; i < N; i++ ) {
            id[i] = i;
        }
    }


    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for ( int i = 0; i < id.length; i++ ) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
    }
}
