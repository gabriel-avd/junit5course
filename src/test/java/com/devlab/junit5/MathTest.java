package com.devlab.junit5;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class MathTest {

    @Test
    void testMax() {
        int max = Math.max(1, 100);

        assertThat(max).isEqualTo(100);
    }

    @Test
    void testMin() {
        int max = Math.min(1, 100);

        assertThat(max).isOne();
    }

    @Test
    @Disabled
    void performanceTest() {
        assertTimeout(Duration.ofSeconds(5),
                () -> {
                    for (int i = 0; i < 1000; i++) {
                        {
                            int j = i;
                            System.out.println(j);
                        }
                    }
                });
    }
}
