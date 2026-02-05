All the node is smaller than parent node.
Max Heap: The value of each node is greater than or equal to the values of its children
Min Heap: The value of each node is less than or equal to the values of its children
Common Operations:
Insertion: Add a new element to the heap and maintain the heap property.
Deletion: Remove the root element (maximum for max heap, minimum for min heap) and maintain
the heap property.
Peek: Retrieve the root element without removing it.
Heapify: Convert an arbitrary array into a heap.
Applications:
Priority Queue: Heaps are often used to implement priority queues.
Sorting: Heapsort is a comparison-based sorting algorithm that uses a heap data structure.
Graph Algorithms: Heaps are used in algorithms like Dijkstra's and Prim's for efficient retrieval
of the minimum element.
Memory Management: Heaps can be used in memory allocation algorithms.
Implementation:
Heaps can be implemented using arrays or linked lists. The array representation is more common
due to its efficiency in accessing parent and child nodes using index calculations.
In an array representation:
For a node at index i:
Left Child Index = 2*i + 1
Right Child Index = 2*i + 2
Parent Index = (i - 1) / 2
Example Code (Java):
```java
class MinHeap {
    private int[] heap;
    private int size;
    private int capacity;
    public MinHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }
    private int parent(int index) { return (index - 1) / 2;
    }
    private int leftChild(int index) { return 2 * index + 1;
    }
    private int rightChild(int index) { return 2 * index + 2;
    }
    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
    public void insert(int value) {
        if (size == capacity) throw new IllegalStateException("Heap is full");
        heap[size] = value;
        size++;
        heapifyUp(size - 1);
    }
    private void heapifyUp(int index) {
        while (index > 0 && heap[parent(index)] > heap[index]) {
            swap(parent(index), index);
            index = parent(index);
        }
    }
    public int extractMin() {
        if (size == 0) throw new IllegalStateException("Heap is empty");
        int min = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return min;
    }
    private void heapifyDown(int index) {
        int smallest = index;
        int left = leftChild(index);
        int right = rightChild(index);
        if (left < size && heap[left] < heap[smallest]) smallest = left
        if (right < size && heap[right] < heap[smallest]) smallest = right
        if (smallest != index) {
            swap(index, smallest);
            heapifyDown(smallest);
        }
    }
    public int peek() {
        if (size == 0) throw new IllegalStateException("Heap is empty");
        return heap[0];
    }
}
```
This code defines a simple MinHeap class with methods for insertion, extraction of the minimum
element, and peeking at the minimum element. The heap property is maintained through the heapifyUp and heapifyDown methods.
