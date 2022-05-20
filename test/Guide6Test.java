import org.hamcrest.CoreMatchers;
import org.junit.Test;
import tp2.Guide6;
import tp2.Guide6Solution;
import tp2.utilsTP2.Infraction;
import tp2.utilsTP2.Survey;
import utils.SkipRule;

import static org.junit.Assert.*;

public class Guide6Test extends SkipRule {
    Guide6 guide6 = new Guide6Solution();

    @Test
    public void exercise_1_j() {
        assertArrayEquals(new int[]{4, 3, 2, 1}, guide6.exercise_1_j(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{8, 4, 6, 7, 3, 4, 5, 2}, guide6.exercise_1_j(new int[]{2, 5, 4, 3, 7, 6, 4, 8}));
        assertArrayEquals(new int[]{7, 5, 3, 4, 2}, guide6.exercise_1_j(new int[]{2, 4, 3, 5, 7}));
    }

    @Test
    //    El primer elemento no puede ser negativo, si el primer elemento es negativo debe devolver falso"
    public void exercise_4() {
        assertTrue(guide6.exercise_4(new int[]{3, -1, 3, -5}));
        assertFalse(guide6.exercise_4(new int[]{-3, 11, -3, -5}));
        assertTrue(guide6.exercise_4(new int[]{0, 5, -3, -2}));
        assertFalse(guide6.exercise_4(new int[]{0, 5, -3, -2, 1}));
        assertFalse(guide6.exercise_4(new int[]{1, -8, 3, 11, -7}));
    }

    @Test
    public void exercise_6() {
        assertArrayEquals(new int[]{1, 2, 4, 7, 12}, guide6.exercise_6(new int[]{1, 1, 2, 3, 5}));
        assertArrayEquals(new int[]{1, 0, 5, 12, 14, 21, 26, 24, 27, 24, 29, 34}, guide6.exercise_6(new int[]{1, -1, 5, 7, 2, 7, 5, -2, 3, -3, 5, 5}));
        assertArrayEquals(new int[]{-1, -2, 3, 1, 1, -1, 2, -1, 4, -1}, guide6.exercise_6(new int[]{-1, -1, 5, -2, 0, -2, 3, -3, 5, -5}));
    }

    @Test
    public void exercise_7_a() {
        assertEquals(0, guide6.exercise_7_a(new Survey[]{new Survey(1, 24, 1), new Survey(1, 12, 1), new Survey(2, 22, 1), new Survey(1, 44, 1), new Survey(1, 8, 1), new Survey(1, 24, 1)}), 0.1);
        assertEquals(0.66, guide6.exercise_7_a(new Survey[]{new Survey(1, 24, 2), new Survey(2, 12, 1), new Survey(2, 22, 1), new Survey(1, 44, 2), new Survey(1, 8, 2), new Survey(1, 24, 2)}), 0.1);
        assertEquals(0.25, guide6.exercise_7_a(new Survey[]{new Survey(1, 24, 2), new Survey(2, 12, 1), new Survey(2, 22, 1), new Survey(1, 44, 1), new Survey(1, 8, 1), new Survey(1, 24, 1)}), 0.1);
    }

    @Test
    public void exercise_7_b() {
        assertEquals(22.33, guide6.exercise_7_b(new Survey[]{new Survey(1, 24, 1), new Survey(1, 12, 1), new Survey(2, 22, 1), new Survey(1, 44, 1), new Survey(1, 8, 1), new Survey(1, 24, 1)}), 0.1);
        assertEquals(25.16, guide6.exercise_7_b(new Survey[]{new Survey(1, 13, 1), new Survey(2, 15, 1), new Survey(2, 44, 1), new Survey(1, 60, 1), new Survey(1, 8, 1), new Survey(1, 11, 1)}), 0.1);
    }

    @Test
    public void exercise_7_c() {
        assertEquals(0, guide6.exercise_7_c(new Survey[]{new Survey(1, 24, 1), new Survey(1, 12, 1), new Survey(2, 2, 1), new Survey(1, 44, 1), new Survey(1, 8, 1), new Survey(1, 24, 1)}));
        assertEquals(1, guide6.exercise_7_c(new Survey[]{new Survey(2, 13, 2), new Survey(2, 15, 1), new Survey(2, 44, 1), new Survey(1, 60, 1), new Survey(2, 8, 1), new Survey(1, 11, 1)}));
        assertEquals(3, guide6.exercise_7_c(new Survey[]{new Survey(2, 33, 2), new Survey(2, 98, 1), new Survey(2, 44, 1), new Survey(1, 60, 1), new Survey(2, 8, 1), new Survey(1, 11, 1)}));

    }
}
