package ru.pel.artplancom.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringBufferReverserTest {
    @Test
    void reverse_expectedCorrect() {
        String str = "reversed string";
        assertEquals("gnirts desrever", new StringBufferReverser().reverse(str));
    }

    @Test
    void reverseNull_expectedNull() {
        assertEquals("", new StringBufferReverser().reverse(null));
    }
}