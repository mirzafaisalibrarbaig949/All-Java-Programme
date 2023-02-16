package com.accolite;
import org.junit.Test;
import static org.junit.Assert.*;

public class WeirdArrayTest {
	WeirdArray array=new WeirdArray();

    @Test
    public void testWeirdArray() {
        assertEquals(2, WeirdArray.weirdArray(new int[] {3, 3, 1, 3, 3}));
        assertEquals(0, WeirdArray.weirdArray(new int[] {5}));
        assertEquals(3, WeirdArray.weirdArray(new int[] {1, 2, 1, 3, 3, 4, 1, 2}));
        assertEquals(1, WeirdArray.weirdArray(new int[] {1, 1, 1, 1, 1, 2, 2, 2, 2}));
    }
}

