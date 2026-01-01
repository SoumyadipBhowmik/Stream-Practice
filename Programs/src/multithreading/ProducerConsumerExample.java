package multithreading;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerExample {

//    Queue<Integer> queue = new LinkedList<>();
//    int capacity;
//
//    ProducerConsumerExample(int capacity) {
//        this.capacity = capacity;
//    }
//
//    public synchronized void produce(int value) throws InterruptedException {
//        while(queue.size() == capacity) {
//            wait();
//        }
//        queue.add(value);
//        System.out.println("Produced: " + value);
//        notifyAll();
//    }
//
//    public synchronized int consume() throws InterruptedException {
//        while (queue.isEmpty()) {
//            wait();
//        }
//
//        int value = queue.poll();
//        System.out.println("Consumed: " + value);
//        notifyAll();
//        return value;
//    }

    public static void main(String[] args) {

        BlockingQueue<Integer> queue = new ArrayBlockingQueue(5);

//        ProducerConsumerExample pc = new ProducerConsumerExample(5);

        Thread producerThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    queue.put(i);
                    System.out.println("Produced: " + i);
//                    pc.produce(i);
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread consumerThread = new Thread(() -> {
            for(int i = 0; i < 10; i++) {
                try {
                    queue.poll();
                    System.out.println("Consumed: " + i);
//                    pc.consume();
                    Thread.sleep(150);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
