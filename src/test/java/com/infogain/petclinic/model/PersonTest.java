package com.infogain.petclinic.model;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
@Tag("Model")
class PersonTest {

    @Test
    void groupedAssertions() {
        //given
        Person person = new Person(1l, "Rudhra", "Koul");

        //then
        assertAll("Test Props Set",
                () -> assertEquals(person.getFirstName(), "Rudhra"),
                () -> assertEquals(person.getLastName(), "Koul"));
    }

    @Test
    void groupedAssertionMsgs() {
        //given
        Person person = new Person(1l, "Rudhra", "Koul");

        //then
        assertAll("Test Props Set",
                () -> assertEquals(person.getFirstName(), "Rudhra", "First Name Failed"),
                () -> assertEquals(person.getLastName(), "Koul", "Last Name Failed"));
    }
}