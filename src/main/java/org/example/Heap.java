package org.example;

/**
 * This class implements an array based min heap
 */
public class Heap {
    private int[] data;
    private int size;

    /**
     * Default constructor
     */
    public Heap(){
        data = new int[100];
        size = 0;
    }// end - Heap()

    /**
     * This method returns the  index of the parent of the given index
     * @param index - an integer within the bounds of the heap array
     * @return parent index
     */
    private int getParentIndex(int index){
        if (index > 0) {
            return (index - 1) / 2;
        }
        else{
            return index;
        }
    }// end getParentIndex

    /**
     * This method returns the index of the left child of the given index
     * @param index - an integer within the bounds of the heap array
     * @return left child index
     */
    private int getLeftChildIndex(int index){
        return (2*index) + 1;
    }
    /**
     * This method returns the index of the right child of the given index
     * @param index - an integer within the bounds of the heap array
     * @return right child index
     */
    private int getRightChildIndex(int index){
        return (2*index) + 2;
    }

    /**
     * This method swaps the elements at index1 and index2
     * @param index1 - an integer within the bounds of the heap array
     * @param index2 - an integer within the bounds of the heap array
     */
    private void swap(int index1, int index2){
        int temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }// end swap

    /**
     * This method takes the index of the element where it should start checking for heap
     * property violations. It keeps moving up the tree towards the root and checks whether the current
     * item and its parent violate the heap property. If there is a violation, then it swaps the elements in
     * the array (current item and parent)
     * @param index
     */
    private void heapifyUp(int index){
        while(data[index] < data[getParentIndex(index)] && index > 0){
            swap(index, getParentIndex(index));
            index = getParentIndex(index);
        }
    }//end heapifyUp

    /**
     * This method adds a new item to the heap.
     * @param item
     */
    public void add(int item){
        data[size] = item;
        heapifyUp(size);
        size++;
    }

    /**
     * This method displays all heap data.
     */
    public void show(){
        for (int i = 0; i < size; i++) {
            System.out.printf("%d : %d \n", i, data[i]);
        }
    }//end show

    /**
     * This method takes the index of the element where it should start checking for
     * heap property violations. It keeps moving down the tree towards the leaves and check whether
     * the current item and either of its children violate the heap property. If there is a violation, then it
     * swaps the elements in the array (current item and child that violates the heap property)
     * @param index
     */
    private void heapifyDown(int index){
        int minChildIndex = data[getLeftChildIndex(index)] < data[getRightChildIndex(index)] ? getLeftChildIndex(index) : getRightChildIndex(index);
        while(minChildIndex <= size && data[index] > data[minChildIndex]){
            swap(index, minChildIndex);
            index = minChildIndex;
            minChildIndex = data[getLeftChildIndex(index)] < data[getRightChildIndex(index)] ? getLeftChildIndex(index) : getRightChildIndex(index);
        }
    }//end heapifyDown

    /**
     * This method returns the minimum element in the heap
     * @return
     */
    public int getMin(){
        if (size > 0) {
            int min = data[0];
            data[0] = data[size - 1];
            size--;
            heapifyDown(0);
            return min;
        }
        return -1;
    }

}
