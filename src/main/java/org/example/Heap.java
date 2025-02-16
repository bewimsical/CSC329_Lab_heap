package org.example;

public class Heap {
    private int[] data;
    private int size;

    public Heap(){
        data = new int[100];
        size = 0;
    }// end - Heap()

    public int getParentIndex(int index){
        if (index > 0) {
            return (index - 1) / 2;
        }
        else{
            return index;
        }
    }
    public int getLeftChildIndex(int index){
        return (2*index) + 1;
    }
    public int getRightChildIndex(int index){
        return (2*index) + 2;
    }
    public void swap(int index1, int index2){
        int temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }
    public void heapifyUp(int index){

        while(data[index] < data[getParentIndex(index)]){
            swap(index, getParentIndex(index));
            index = getParentIndex(index);
        }
    }
    void add(int item){
        data[size] = item;
        heapifyUp(size);
        size++;
    }
    void show(){
        for (int i = 0; i < size; i++) {
            System.out.printf("%d : %d \n", i, data[i]);
        }
    }
    //TODO implement this method
    public void heapifyDown(int index){

        while(data[index] < data[getParentIndex(index)]){
            swap(index, getParentIndex(index));
            index = getParentIndex(index);
        }
    }
}
