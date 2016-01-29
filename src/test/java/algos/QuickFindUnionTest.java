package algos;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by shazra on 1/29/16.
 */
public class QuickFindUnionTest {

    @Test
    public void findConnectionWithoutUnionShouldBeFalse() {
        QuickFindUnion quickFindUnion = new QuickFindUnion(5);
        assertEquals(false, quickFindUnion.connected(0, 1));
    }

    @Test
    public void unionOf1and2ThenFindConnectedShouldReturnTrue() {
        QuickFindUnion quickFindUnion = new QuickFindUnion(5);
        quickFindUnion.union(0, 1);
        assertEquals(true, quickFindUnion.connected(0, 1));
    }


    @Test
    public void unionOf0and3ThenFindConnectedShouldReturnTrue() {
        QuickFindUnion quickFindUnion = new QuickFindUnion(5);
        quickFindUnion.union(0, 1);
        quickFindUnion.union(2, 3);
        quickFindUnion.union(1, 2);
        assertEquals(true, quickFindUnion.connected(0, 3));
    }
}
