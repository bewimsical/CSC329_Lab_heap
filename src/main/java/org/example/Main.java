package org.example;

public class Main {
    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.add(80);
        heap.add(70);
        heap.add(60);
        heap.add(50);
        heap.add(40);
        heap.add(50);
        heap.add(20);
        heap.add(10);
        heap.show();

        System.out.println();
        System.out.println(heap.getMin());
        heap.show();
        System.out.println(heap.getMin());
        heap.show();
        System.out.println(heap.getMin());
        heap.show();
        System.out.println(heap.getMin());
        heap.show();
        System.out.println(heap.getMin());
        heap.show();
        System.out.println(heap.getMin());
        heap.show();System.out.println(heap.getMin());
        heap.show();
        System.out.println(heap.getMin());
        heap.show();
        System.out.println(heap.getMin());
        heap.show();

    }
}