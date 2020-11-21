package com.potalestor.code.algo.sort;

import java.util.Comparator;

public class Quick<T> extends Sort<T> {

    @Override
    public void sort(T[] a, Comparator<T> c) {
        int len = a.length;
        // array is trivially sorted
        if (len < 2) {
            return;
        }
        quick(a, 0, len - 1, c);
    }
    public void quick(T[] a, int l, int r, Comparator<T> c) {
        if (l >= r) {
            return;
        }
        int pi = partition(a, l, r, c);
        quick(a, l, pi - 1, c);
        quick(a, pi + 1, r, c);
    }

    private int partition(T[] a, int l, int r, Comparator<T> c) {
        // pivot (Element to be placed at right position)
        T pivot = a[r];

        // index of smaller element
        int i = (l - 1);

        for (int j = l; j <= r - 1; j++) {
            // if current element is smaller than the pivot
            if (c.compare(a[j], pivot) < 0) {
                // increment index of smaller element
                i++;
                if (i != j)
                    swap(a, i, j);
            }
        }
        swap(a, i + 1, r);
        return (i + 1);
    }    
}
