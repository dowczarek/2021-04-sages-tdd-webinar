package com.smalaca.tdd.fizzbuzz;

class FizzBuzz {
    String convert(int number) {
        if (isDividableBy(number, 15)) {
            return "FizzBuzz";
        }

        if (isDividableBy(number, 3)) {
            return "Fizz";
        }

        if (isDividableBy(number, 5)) {
            return "Buzz";
        }

        return String.valueOf(number);
    }

    private boolean isDividableBy(int number, int divisor) {
        return number % divisor == 0;
    }
}
