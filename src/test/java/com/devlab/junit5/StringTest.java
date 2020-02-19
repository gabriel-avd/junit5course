package com.devlab.junit5;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringTest {

    @BeforeAll
    static void init() {
        System.out.println("Initialize connection to DB");
    }

    @AfterAll
    static void close() {
        System.out.println("Close connection to DB");
    }

    @BeforeEach
    void setup(TestInfo info) {
        System.out.println("Initialize test data for" + info.getDisplayName());
    }

    @AfterEach
    void cleanUp(TestInfo info) {
        System.out.println("Clean up test data for" + info.getDisplayName());
    }


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

    @Test
    @DisplayName("When string is null, throw Exception")
    void length_exception() {
        String str = null;

        assertThrows(NullPointerException.class,
                () -> str.length());
    }

}
