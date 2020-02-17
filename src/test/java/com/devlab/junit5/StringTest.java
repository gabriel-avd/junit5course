package com.devlab.junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class StringTest {

    @Test
    void test() {
        int length = "ABCD".length();

        assertThat(length).isEqualTo(4);

        //Write test code
        //Invoke method square(4)
        //Checks in place -16


    }
}
