package com.sample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.WeakHashMap;

public class Demo {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(); // Create and use one MinHeap internally
        priorityQueue.add(50);
        priorityQueue.add(10);// can throw an exception when the addition fails
        priorityQueue.offer(20); //return false if addition fails
        priorityQueue.offer(40);
        priorityQueue.offer(60);
        priorityQueue.offer(30);// adding in last
        System.out.println(priorityQueue);
        System.out.println("Data is :" + priorityQueue.poll());// deleting from first or front
        System.out.println("Front value" + priorityQueue.peek());
        System.out.println("********** Traversing through Enhanced for loop");
        for (Integer integer : priorityQueue) {
            System.out.println(integer);
        }
        System.out.println("********** Traversing through Lambda");
        priorityQueue.forEach(element -> System.out.println(element));
        PriorityQueue<Integer> reversePriorityQueue = new PriorityQueue<>(Comparator.reverseOrder()); // create and Use a Max Heap Internally
        reversePriorityQueue.add(50);
        reversePriorityQueue.add(10);// can throw an exception when the addition fails
        reversePriorityQueue.offer(20); //return false if addition fails
        reversePriorityQueue.offer(40);
        reversePriorityQueue.offer(60);
        reversePriorityQueue.offer(30);// adding in last
        System.out.println("Reverse Priority Queue is"+reversePriorityQueue);
    }
}
