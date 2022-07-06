package com.baikati.lamdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class SumOfNumbersUsingCallable {
    private static int[] numArray = IntStream.rangeClosed(0, 10).toArray();
    private static int total = IntStream.rangeClosed(0, 10).sum();

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable<Integer> callable1 = () -> {
            int sum = 0;
            for (int i = 0; i < numArray.length / 2; i++) {
                sum = sum + numArray[i];
            }
            return sum;
        };

        Callable<Integer> callable2 = () -> {
            int sum = 0;
            for (int i = numArray.length / 2; i < numArray.length; i++) {
                sum = sum + numArray[i];
            }
            return sum;
        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Callable<Integer>> taskList = Arrays.asList(callable1, callable2);
        List<Future<Integer>> results = executorService.invokeAll(taskList);

        int j = 0;
        int sum = 0;
        for (Future<Integer> result : results) {
            sum = sum + result.get();
            System.out.println("Sum of " + ++j + " half is: " + result.get());
        }
        System.out.println("Sum of Callable is : " + sum);
        System.out.println("Actual Sum from IntStream is : " + total);
        executorService.shutdown();
    }
}
