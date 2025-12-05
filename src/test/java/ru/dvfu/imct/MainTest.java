package ru.dvfu.imct;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void sayHello() {
        String expected = "Hello World";

        String actual = Main.sayHello();

        assertEquals(expected, actual, "Ожидалась строка Hello World");
    }

    @Test
    void shouldNotThrowException() {
        assertDoesNotThrow(Main::sayHello);
    }

}