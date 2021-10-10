package com.smalaca.tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {
    private final FizzBuzz fizzBuzz = new FizzBuzz();
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

    @Test
    void shouldReturnThirteenAsString() {
        //given

        //when
        String actual = fizzBuzz.convert(13);

        //then
        assertThat(actual).isEqualTo("13");
    }

    @Test
    void shouldReturnNumberAsString() {
        //given

        //when
        String actual = fizzBuzz.convert(17);

        //then
        assertThat(actual).isEqualTo("17");
    }

    @Test
    void shouldReturnFizzWhenNumberDividableByThree() {
        //given

        //when
        String actual = fizzBuzz.convert(3);

        //then
        assertThat(actual).isEqualTo("Fizz");
    }
}
