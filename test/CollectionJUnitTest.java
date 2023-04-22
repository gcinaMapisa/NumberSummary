
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author 10027175
 */
public class CollectionJUnitTest {

    public CollectionJUnitTest() {
    }

    @Test
    public void test_collect_method() {
        Summarizer summarizer = new Summarizer();
        int[] ts = {1, 3, 6, 7, 8, 12, 13, 14, 15, 21, 22, 23, 24, 31};
        ArrayList<Integer> mylist = new ArrayList<>();
        for (int t : ts) {
            mylist.add(t);
        }
        Assert.assertTrue(mylist.equals(summarizer.collect("1,3,6,7,8,12,13,14,15,21,22,23,24,31")));
    }

    @Test
    public void test_summarizeCollection() {
        Summarizer summarizer = new Summarizer();
        ArrayList<Integer> collection = summarizer.collect("1,3,6,7,8,12,13,14,15,21,22,23,24,31");
        Assert.assertEquals("1, 3, 6-8, 12-15, 21-24, 31", summarizer.summarizeCollection(collection));
    }
}
