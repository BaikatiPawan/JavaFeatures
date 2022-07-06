package com.baikati.lamdaexpression;

public class RunnableExample {
    public static void main(String[] args) {
        //before java8
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = 0; i <= 10; i++) {
                    sum += i;
                }
                System.out.println(sum);
            }
        };
        new Thread(runnable).start();

        //using java8 lambda
        Runnable runnable1 = () -> {
            int sum = 0;
            for (int i = 0; i <= 10; i++) {
                sum += i;
            }
            System.out.println(sum);
        };
        new Thread(runnable1).start();

        //Thread using lambda
        new Thread(()->{
            int sum=0;
            for(int i=0;i<=10;i++){
                sum+=i;
            }
            System.out.println(sum);
        }).start();
    }
}
