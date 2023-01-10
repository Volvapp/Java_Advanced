package StackQueueLab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class mathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split(" ");

        int steps = 1;

        PriorityQueue<String> kids = new PriorityQueue<>();
        Collections.addAll(kids, names);

        while (kids.size() > 1) {
            for (int i = 1; i < steps; i++) {
                String kid = kids.poll();
                kids.offer(kid);

            }
            if (isPrime(steps)) {
                System.out.println("Prime " + kids.peek());
            } else {


                String removedChild = kids.poll();
                System.out.println("Removed " + removedChild);
            }
            steps++;
        }
        System.out.println("Last is " + kids.poll());
    }

    private static boolean isPrime(int num) {

        if (num == 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}

