package com.company;

public class Calculate implements Runnable{

    int number;

    Calculate (int number){
        this.number = number;
    }

    @Override
    public void run() {
        int result = 1;

        for (int i = 0; i <= 10; i++) {

            if (i == 0){
                result = 1;
                System.out.printf("%d ^ %d = %d\n", number, i, result);
            } else {
                result = number * result;
                System.out.printf("%d ^ %d = %d\n", number, i, result);
            }

        }
    }
}
