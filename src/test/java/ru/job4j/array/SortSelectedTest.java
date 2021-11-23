package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortThreeNumbers() {
        int[] data = new int[]{32, 4, 18};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{4, 18, 32};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortFiveNumbers() {
        int[] data = new int[]{10, 14, 16, 12, 18};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{10, 12, 14, 16, 18};
        Assert.assertArrayEquals(expected, result);
    }
}