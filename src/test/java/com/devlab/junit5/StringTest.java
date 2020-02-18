package com.devlab.junit5;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringTest {

    @Test
    void length_basic() {
        int length = "ABCD".length();

        assertThat(length).isEqualTo(4);
    }

    @Test
    void toUpperCase_basic() {
        String str = "abcd";
        String result = str.toUpperCase();

        assertThat(result).isEqualTo("ABCD");
        assertThat(result).isNotNull();
    }

    @Test
    void contains_basic() {
        String str = "ABCDEFGH";
        boolean result = str.contains("IJK");

        assertThat(result).isEqualTo(false);
    }

}
