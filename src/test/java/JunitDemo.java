import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
public class JunitDemo {
    @Test
    public void testReverse() {
        int[] arr = {1, 2, 3};
        ArrayUtils.reverse(arr);
        assertArrayEquals("数组反转失败", new int[]{3, 2, 1}, arr); // 测试失败
    }

    @Test
    public void testContains() {
        assertTrue("应包含元素10", ArrayUtils.contains(new int[]{5, 10, 15}, 10));
        assertFalse("不应包含元素20", ArrayUtils.contains(new int[]{5, 10, 15}, 20));
    }

    @Test
    public void testIsEmpty() {
        assertTrue("空数组应返回true", ArrayUtils.isEmpty(new int[0]));
        assertFalse("非空数组应返回false", ArrayUtils.isEmpty(new int[]{1}));
    }
}


@RunWith(Suite.class)
@Suite.SuiteClasses({JunitDemo.class})
class TestSuite {}