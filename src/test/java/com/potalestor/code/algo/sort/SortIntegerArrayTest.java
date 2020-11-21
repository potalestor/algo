package com.potalestor.code.algo.sort;

import static org.junit.Assert.assertArrayEquals;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.Test;

public class SortIntegerArrayTest {
    private static HashMap<String, Sortable<Integer>> sorters = new HashMap<String, Sortable<Integer>>();
    private static Comparator<Integer> comp = new Comparator<Integer>() {
        @Override
        public int compare(Integer a, Integer b) {
            return a.compareTo(b);
        }
    };

    @BeforeClass
    public static void init() {
        sorters.put("Bubble sort", new Bubble<Integer>());
        sorters.put("Merge sort", new Merge<Integer>());
        sorters.put("Quick sort", new Quick<Integer>());
    }

    @Test
    public void sortWinSingleItemArray() {
        Integer A[] = new Integer[] { 1 };
        Integer E[] = new Integer[] { 1 };
        for (Map.Entry<String, Sortable<Integer>> sorter : sorters.entrySet()) {
            sorter.getValue().sort(A, comp);
            assertArrayEquals(sorter.getKey(), E, A);
        }
    }

    @Test
    public void sortArray() {
        Integer A[] = new Integer[] { 1, -3, 3, 2, 0, -2, -1 };
        Integer E[] = new Integer[] { -3, -2, -1, 0, 1, 2, 3 };
        for (Map.Entry<String, Sortable<Integer>> sorter : sorters.entrySet()) {
            sorter.getValue().sort(A, comp);
            assertArrayEquals(sorter.getKey(), E, A);
        }
    }

}
