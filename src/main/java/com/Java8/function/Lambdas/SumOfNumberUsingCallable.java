package com.Java8.function.Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

class CallableTask1 implements Callable<Integer> {
    @Override
    public Integer call() {
        int sum = 0;
        for (int i = 0; i < SumOfNumberUsingCallable.array.length / 2; i++) {
            sum = sum + SumOfNumberUsingCallable.array[i];
        }
        System.out.println();
        return sum;
    }
}

class CallableTask2 implements Callable<Integer> {
    @Override
    public Integer call() {
        int sum = 0;
        for (int i = SumOfNumberUsingCallable.array.length / 2; i < SumOfNumberUsingCallable.array.length; i++) {
            sum = sum + SumOfNumberUsingCallable.array[i];
        }
        return sum;
    }
}

public class SumOfNumberUsingCallable {

    public static int[] array = new int[501];

    static {
        for (int i = 0; i <= 500; i++) {
            array[i] = i;
        }
    }

    public static int total = 0;

    static {
        for (int i = 0; i <= 500; i++) {
            total += i;
        }
    }

    public static void main(String args[]) throws InterruptedException, ExecutionException {

        Callable<Integer> callable1 = new CallableTask1();
        Callable<Integer> callable2 = new CallableTask2();

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Callable<Integer>> list = new ArrayList<>(Arrays.asList(callable1, callable2));

        List<Future<Integer>> futurelist = executorService.invokeAll(list);

        int sum = 0;
        int k = 0;
        for (Future<Integer> future : futurelist) {
            sum = sum + future.get();
            System.out.println("Sum of " + ++k + " is " + future.get());
        }

        System.out.println("Correct sum is: " + total);
        System.out.println("Sum from callable is: " + sum);

        executorService.shutdown();
    }
}
