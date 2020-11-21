package com.potalestor.code.algo.sort;

import java.util.Arrays;
import java.util.Comparator;

public class Merge<T> extends Sort<T> {

    @Override
    public void sort(T[] a, Comparator<T> c) {
        int len = a.length;
        // array is trivially sorted
        if (a.length < 2) {
            return;
        }
        // divide
        int mid = len/2;
        T[] a1 = Arrays.copyOfRange(a, 0, mid);
        T[] a2 = Arrays.copyOfRange(a, mid, len);
        // conquer
        sort(a1, c);
        sort(a2, c);
        // merge results
        merge(a1, a2, a, c);
    }

    private void merge(T[] a1, T[] a2, T[] a, Comparator<T> c) {
        int i = 0, j = 0;
        while (i + j < a.length) {
            if (j >= a2.length) {
                a[i + j] = a1[i++];
                continue;
            }
            if (i >= a1.length) {
                a[i + j] = a2[j++];
                continue;
            }
            if (c.compare(a1[i], a2[j]) < 0) {
                a[i + j] = a1[i++];
            } else {
                a[i + j] = a2[j++];
            }
        }
    }
    
}
