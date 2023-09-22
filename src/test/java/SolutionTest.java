import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void isSubsequenceTest1(){
        String s = "aaaaaa";
        String t = "bbaaaa";
        boolean actual = new Solution().isSubsequence(s, t);

        Assert.assertFalse(actual);
    }

    @Test
    public void isSubsequenceTest2(){
        String s = "abc";
        String t = "ahbgdc";
        boolean actual = new Solution().isSubsequence(s, t);

        Assert.assertTrue(actual);
    }
}
