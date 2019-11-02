package com.company;

public class Insertion {

    public void sort(Comparable[] a){
        int N = a.length;
        for (int i=0; i<N; i++){
            for (int j=i; j>0; j--){
                if (less(a[j], a[j-1])){
                    exch(a, j, j-1);
                }
                else break;
            }
        }
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
