import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import tp1.Guide1;
import tp1.Guide1IterativeSolution;
import tp1.Guide1RecursiveSolution;
import utils.SkipRule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class Guide1Test extends SkipRule {
    private Guide1 guide1;

    public Guide1Test(Guide1 guide) {
        guide1 = guide;
    }

    @Parameterized.Parameters(name = "{0}")
    public static Collection<Guide1> parameters() {
        return new ArrayList<>(Arrays.asList(new Guide1IterativeSolution(), new Guide1RecursiveSolution()));
    }

    @Test
    public void exercise_1_d() {
        assertEquals(1, guide1.exercise_1_d(1));
        assertEquals(4, guide1.exercise_1_d(2));
        assertEquals(9, guide1.exercise_1_d(3));
        assertEquals(16, guide1.exercise_1_d(4));
        assertEquals(25, guide1.exercise_1_d(5));
        assertEquals(36, guide1.exercise_1_d(6));
        assertEquals(50625, guide1.exercise_1_d(225));
    }

    @Test
    public void exercise_2_c() {
        assertEquals(0, guide1.exercise_2_c(0));
        assertEquals(1, guide1.exercise_2_c(1));
        assertEquals(1, guide1.exercise_2_c(2));
        assertEquals(2, guide1.exercise_2_c(3));
        assertEquals(3, guide1.exercise_2_c(4));
        assertEquals(5, guide1.exercise_2_c(5));
        assertEquals(8, guide1.exercise_2_c(6));
    }

    @Test
    public void exercise_4() {
        assertFalse(guide1.exercise_4(new int[]{1, 2, 3}));
        assertFalse(guide1.exercise_4(new int[]{1, 2, 3, 4, 3, 1, 2}));
        assertFalse(guide1.exercise_4(new int[]{1, 2, 2, 1, 1}));
        assertTrue(guide1.exercise_4(new int[]{8, 9, 8}));
        assertTrue(guide1.exercise_4(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1}));
        assertTrue(guide1.exercise_4(new int[]{1, 1, 1, 1, 1}));
    }

    @Test
    public void exercise_6_b_iii() {
        assertEquals(1, guide1.exercise_6_b_iii(2));
        assertEquals(1, guide1.exercise_6_b_iii(3));
        assertEquals(2, guide1.exercise_6_b_iii(4));
        assertEquals(1, guide1.exercise_6_b_iii(5));
        assertEquals(1, guide1.exercise_6_b_iii(7));
        assertEquals(2, guide1.exercise_6_b_iii(6));
        assertEquals(3, guide1.exercise_6_b_iii(8));
        assertEquals(2, guide1.exercise_6_b_iii(9));
        assertEquals(2, guide1.exercise_6_b_iii(10));
        assertEquals(4, guide1.exercise_6_b_iii(16));
        assertEquals(3, guide1.exercise_6_b_iii(30));
        assertEquals(3, guide1.exercise_6_b_iii(66));
        assertEquals(4, guide1.exercise_6_b_iii(315));
    }

    @Test
    public void exercise_8() {
        assertEquals(340, guide1.exercise_8(new int[]{1, 8, 5, 10}, 3));
        assertEquals(117, guide1.exercise_8(new int[]{1, 8, 5, 10}, 2));
        assertEquals(24, guide1.exercise_8(new int[]{1, 8, 5, 10}, 1));
        assertEquals(1, guide1.exercise_8(new int[]{1, 8, 5, 10}, 0));
    }
}