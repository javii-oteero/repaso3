package es.iesmz.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Vocales2Test {
    @Test
    void sinvocalesTest() {
        assertEquals("Hl Mnd", Vocales2.sinvocales("Hola Mundo"));
    }
}