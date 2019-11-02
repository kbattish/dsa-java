package com.company;

public class ResizeStack<Item> {

    private Item[] s;
    private int N;

    public ResizeStack(){
        s = (Item[]) new Object[1];
    }

    public void push(Item item){
        if (N == s.length) resize(2*s.length);
        s[N++] = item;
    }

    public Item pop(){
        return s[--N];
    }

    public void resize(int capacity){
        Item[] copy = (Item[]) new Object[capacity];
        for (int i=0; i < N; i++){
            copy[i] = s[i];
        }
        s = copy;
    }
}
