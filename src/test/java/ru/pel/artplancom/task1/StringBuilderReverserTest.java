package ru.pel.artplancom.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class StringBuilderReverserTest {

    @Test
    void reverse_expectedCorrect() {
        String str = "reversed string";
        assertEquals("gnirts desrever", new StringBuilderReverser().reverse(str));
    }

    @Test
    void reverseNull_expectedNull() {
        assertEquals("", new StringBuilderReverser().reverse(null));
    }
}