package javathreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main {

    public static void main(String[] args) {
        EvenOrOdd homeWork = new EvenOrOdd();
        ExecutorService executor = Executors.newFixedThreadPool(15);
        for (int i = 0; i < 10000; i++) {
            executor.execute(homeWork);
        }
        executor.shutdown();
        System.out.println("Even Numbers : " + homeWork.getEvenNumber().size());

    }
}
