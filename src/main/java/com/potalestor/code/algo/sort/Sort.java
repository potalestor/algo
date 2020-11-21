package com.potalestor.code.algo.sort;

import java.util.Comparator;

abstract public class Sort<T> implements Sortable<T> {
    abstract public void sort(T[] a, Comparator<T> c);

    protected void swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
