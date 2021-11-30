package fr.lernejo;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    @Test
    void three_and_two_should_make_five {
        int a = 3;
        int b = 2;
        prod = Sample.op(ADD, a, b);

        Assertions.assertThat(prod).as("add 3 and 2").isEqualTo(5);
    }

    @Test
    void height_x_four_should_make_thirty_two {
        int a = 8;
        int b = 4;
        prod = Sample.op(MULT, a, b);

        Assertions.assertThat(prod).as("prod between 8 and 4").isEqualTo(32);
    }

    @Test
    void n_under_zero_is_impossible {
        int n = -4;
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> Sample.fact(n));

    }

    @Test
    void n_equals_four_should_return_twelve {
        int n = 4;
        int fact = Sample.fact(n);
        /*for (int i = 0; i <= n-1; i++){
            fact = fact*i;
        }*/
        Assertions.assertThat(fact).as("4 fact").isEqualTo(24);
    }

}
