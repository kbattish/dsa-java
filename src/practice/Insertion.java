package practice;

public class Insertion {

    private static void sort(Comparable[] a){
        int N = a.length;
        for ( int i = 0; i < N; i++){
            for (int j = i; j>0 && less(a[j],a[j-1]); j--){
                exch(a, j,j-1);
            }
        }
    }

    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
