import org.apache.commons.lang3.ArrayUtils;
import java.util.Arrays;

public class MainTest {
    public static void main(String[] args) {
        // 测试 reverse 方法
        int[] arr = {1, 2, 3};
        ArrayUtils.reverse(arr);
        boolean reversePass = Arrays.equals(arr, new int[]{3, 2, 1});
        System.out.println("Reverse Test: " + (reversePass ? "Pass" : "Fail")); // 预期 Fail

        // 测试 contains 方法
        boolean containsPass = ArrayUtils.contains(new int[]{5, 10, 15}, 10);
        System.out.println("Contains Test: " + (containsPass ? "Pass" : "Fail")); // 预期 Pass

        // 测试 isEmpty 方法
        boolean isEmptyPass = ArrayUtils.isEmpty(new int[0]);
        System.out.println("IsEmpty Test: " + (isEmptyPass ? "Pass" : "Fail")); // 预期 Pass
    }
}
