package com.smalaca.tdd.fizzbuzz;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

/*
Wymagania:
1. Gdy jest przekazana liczba (int) zwracamy tą liczbę w postaci String'a.
2. Gdy liczba jest podzielna przez 3 zwracamy Fizz.
3. Gdy liczba jest podzielna przez 5 zwracamy Buzz.
4. Gdy liczba jest podzielna przez 3 oraz 5 zwracamy FizzBuzz.

INPUT   | OUTPUT
1       | 1
2       | 2
3       | Fizz
4       | 4
5       | Buzz
6       | Fizz
7       | 7
8       | 8
9       | Fizz
10      | Buzz
11      | 11
12      | Fizz
13      | 13
14      | 14
15      | FizzBuzz
16      | 16
17      | 17
18      | Fizz
19      | 19
20      | Buzz
*/
public class FizzBuzzTest {
    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @ParameterizedTest
    @ValueSource(strings = {"1", "2", "13", "17"})
    void shouldReturnNumberAsString(String number) {
        String actual = fizzBuzz.convert(Integer.parseInt(number));

        assertThat(actual).isEqualTo(number);
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12})
    void shouldReturnFizzWhenNumberDividableByThree(int number) {
        String actual = fizzBuzz.convert(number);

        assertThat(actual).isEqualTo("Fizz");
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20})
    void shouldReturnBuzzWhenNumberDividableByFive(int number) {
        String actual = fizzBuzz.convert(number);

        assertThat(actual).isEqualTo("Buzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45})
    void shouldReturnFizzBuzzWhenNumberDividableByThreeAndFive(int number) {
        String actual = fizzBuzz.convert(number);

        assertThat(actual).isEqualTo("FizzBuzz");
    }
}
