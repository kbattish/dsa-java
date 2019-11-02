package com.company;

import java.util.Arrays;
import java.util.Collections;

public class QuickSort {

    public static Comparable select(Comparable[] a, int k){
        Collections.shuffle(Arrays.asList(a));
        int lo = 0, hi = a.length - 1;
        while (hi > lo){
            int j = partition(a, lo, hi);
            if (j<k) lo = j + 1;
            if (j>k) hi = j - 1;
            else if (j>k) hi = j - 1;
            else return a[k];
        }
        return a[k];
    }

    public static void sort(Comparable[] a){
        Collections.shuffle(Arrays.asList(a));
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi){
        if ( hi <= lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j-1);
        sort(a, j+1, hi);
    }

    private static int partition(Comparable[] a, int lo, int hi){
        int i = lo, j = hi+1;
        while(true){
            while (less(a[++i], a[lo]))
                if (i == hi) break;

            while (less(a[lo], a[--j]))
                if (j == lo) break;

            if (i >= j) break;
            exch(a, i, j);
        }

        exch(a, lo, j);
        return j;
    }

    public static boolean less(Comparable p, Comparable q){
        return p.compareTo(q) < 0;
    }

    public static void exch(Comparable[] a, int i, int j){
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}
