package com.potalestor.code.algo.sort;

import java.util.Comparator;

public class Bubble<T> extends Sort<T> {
    @Override
    public void sort(T[] a, Comparator<T> c) {
        for (int i = a.length - 1; i > 0; i--)
            for (int j = 0; j < i; j++)
                if (c.compare(a[j], a[j + 1]) > 0)
                    swap(a, j, j + 1);

    }
}
