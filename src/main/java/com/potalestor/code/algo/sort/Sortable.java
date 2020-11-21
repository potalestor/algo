package com.potalestor.code.algo.sort;

import java.util.Comparator;

public interface Sortable<T> {
    public void sort(T[] a, Comparator<T> c);
}
