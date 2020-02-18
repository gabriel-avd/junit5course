package com.devlab.junit5;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MathTest {

    @Test
    void testMax() {
        int max = Math.max(1,100);

        assertThat(max).isEqualTo(100);
    }

    @Test
    void testMin() {
        int max = Math.min(1,100);

        assertThat(max).isOne();
    }

}
