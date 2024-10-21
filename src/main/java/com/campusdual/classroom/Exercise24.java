package com.campusdual.classroom;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Exercise24 {

    protected static String[] data = {
            "Smith",
            "Montessori",
            "Peralta",
            "House"
    };

    public static Queue<String> createQueue() {
        return new LinkedList<String>(Arrays.asList(data));
    }
    public static void printAndEmptyQueue(Queue<String> q) {
        System.out.println(q.peek() + "\n");

        // Objetivo 3
        System.out.println("Queue is empty? " + q.isEmpty());

        while(!q.isEmpty()){
            System.out.println("\tRemoved " + q.poll());
        }
        System.out.println("Queue is empty? " + q.isEmpty());
    }

    public static void main(String[] args) {
        // Objetivo 1
        Queue<String> q = createQueue();

        // Objetivo 2
        printAndEmptyQueue(q);
    }


}
