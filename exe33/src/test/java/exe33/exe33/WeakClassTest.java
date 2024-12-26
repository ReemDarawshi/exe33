package exe33.exe33;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;


public class WeakClassTest {

    WeakClass weakClass1 = new WeakClass();

        @Test
        public void testDivisionByZero() {
            assertThrows(ArithmeticException.class, () -> {
                weakClass1.weakMethod2(1, 0); // a > 0, b == 0 -> חלוקה באפס
            });
        }

        @Test
        public void testPartialBranchCoverage() {
            int result = weakClass1.weakMethod2(-1, 2); // a <= 0, b > 0
            assertEquals(11, result); // ציפייה מעודכנת: -1 + 2 + 10 = 11
        }

        @Test
        public void testFullBranchCoverage_PositiveB() {
            int result = weakClass1.weakMethod2(1, 2); // אין חלוקה באפס
            assertEquals(60, result); // 100 / 2 = 50 + 10 = 60
        }

        @Test
        public void testFullBranchCoverage_NegativeValues() {
            int result = weakClass1.weakMethod2(-1, -2); // a + b - 5
            assertEquals(-8, result); // -1 + -2 - 5 = -8
        }

        @Test
        public void testFullBranchCoverage_ZeroA() {
            int result = weakClass1.weakMethod2(0, 1); // a + b + 10
            assertEquals(11, result); // 0 + 1 + 10 = 11
        }
    }




