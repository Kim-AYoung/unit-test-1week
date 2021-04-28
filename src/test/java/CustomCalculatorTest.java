import org.junit.Test;

import static org.junit.Assert.*;

public class CustomCalculatorTest {
    private CustomCalculator customCalculator;

    // 더하기 테스트
    @Test
    public void testAdd() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.add(10, 15);
        /* 테스트 코드 입력 */
        assertTrue(result == 25);
        //assertFalse(result == 10);
    }

    // 빼기 테스트
    @Test
    public void testSubtract() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.subtract(23, 10);
        /* 테스트 코드 입력 */
        assertFalse(result == 10);
    }

    // 곱셈 테스트
    @Test
    public void testMultiply() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.multiply(5, 9);
        /* 테스트 코드 입력 */
        assertTrue(result == 45);
    }

    // 나눗셈 테스트트
   @Test
    public void testDivide() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.divide(25, 5);
        /* 테스트 코드 입력 */
        assertTrue(result == 5);
    }
}