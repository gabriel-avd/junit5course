package com.devlab.junit5;

import Entities.Person;
import org.assertj.core.groups.Tuple;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class EntitiesTest {

    @Test
    void extract_basic() {
        List<Person> personList = Arrays.asList(
                new Person(1L, "Gabriel", "Valdes", "Engineer"),
                new Person(1L, "Romina", "Ventura", "Teacher")
        );

        assertThat(personList).extracting("name", "occupation")
                .contains(
                        Tuple.tuple("Romina", "Teacher"),
                        Tuple.tuple("Gabriel", "Engineer")
                );
    }

}
