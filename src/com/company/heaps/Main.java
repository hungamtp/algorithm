package com.company.heaps;

import com.company.heaps.myHeap.MyHeap;

public class Main {
    public static void main(String[] args) {
        var heap = new MyHeap();
        heap.insert(10);
        heap.insert(11);
        heap.insert(12);
        heap.insert(13);
        heap.remove();
        heap.insert(14);
        heap.printHeap();
    }
}
