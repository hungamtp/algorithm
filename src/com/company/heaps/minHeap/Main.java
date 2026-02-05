package com.company.heaps.minHeap;

public class Main {
    public static void main(String[] args) {
        var minHeap = new MinHeap();
        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(8);
        minHeap.insert(1);
        minHeap.insert(4);
        minHeap.insert(2);
        minHeap.insert(10);
        minHeap.remove();
        minHeap.print();
    }
}
