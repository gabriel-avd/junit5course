package com.devlab.junit5;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArraysTest {

    @Test
    void array_basic() {
        String str = "Gabriel,Andres,Valdes,Duarte";
        String[] srtArr = str.split(",");

        assertThat(srtArr).containsSequence("Gabriel", "Andres");
        assertThat(srtArr).containsExactly("Gabriel", "Andres", "Valdes", "Duarte");
    }
}
