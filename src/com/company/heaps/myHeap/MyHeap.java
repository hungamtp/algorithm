package com.company.heaps.myHeap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyHeap {
    private List<Integer> heap;

    public List<Integer> getHeap() {
        return heap;
    }

    public MyHeap() {
        this.heap = new ArrayList<>();
    }

    public void insert(int val) {
        heap.add(val);
        int index = heap.size() - 1;

        while (index > 0) {
            // calculate parent index
            int parentIndex = (index - 1) / 2;
            if (heap.get(index) > heap.get(parentIndex)) {
                //swap
                int temp = heap.get(parentIndex);
                heap.set(parentIndex, heap.get(index));
                heap.set(index, temp);
                index = parentIndex;
            } else {
                break;
            }
        }
    }

    public void remove() {
        // make the heap complete first
        if (heap.isEmpty()) return;
        if (heap.size() == 1) {
            heap.remove(0);
            return;
        }
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        sinkDown(0);
    }

    public void sinkDown(int index) {
        int maxIndex = index;
        while (true) {
            int leftChildIndex = leftIndex(index);
            int rightChildIndex = rightIndex(index);
            if (leftChildIndex < heap.size() && heap.get(leftChildIndex) > heap.get(maxIndex)) {
                maxIndex = leftChildIndex;
            }
            if (rightChildIndex < heap.size() && heap.get(rightChildIndex) > heap.get(maxIndex)) {
                maxIndex = rightChildIndex;
            }
            if (maxIndex != index) {
                int temp = heap.get(maxIndex);
                heap.set(maxIndex, heap.get(index));
                heap.set(index, temp);
                index = maxIndex;
            } else {
                return;
            }
        }
    }

    private int leftIndex(int index) {
        return index * 2 + 1;
    }

    private int rightIndex(int index) {
        return index * 2 + 2;
    }

    private int parentIndex(int index) {
        return (index - 1) / 2;
    }

    public void printHeap() {
        System.out.println(Arrays.toString(heap.toArray()));
    }
}
