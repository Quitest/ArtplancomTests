package ru.pel.artplancom.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StreamReverserTest {
    @Test
    void reverse_expectedCorrect() {
        String str = "reversed string";
        assertEquals("gnirts desrever", new StreamReverser().reverse(str));
    }

    @Test
    void reverseNull_expectedNull() {
        assertEquals("", new StreamReverser().reverse(null));
    }

}