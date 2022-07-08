package ru.pel.artplancom.task1;

public class StreamReverser implements StringReverser {
    /**
     * Для разворота строки используется Stream API. Далеко не самый лучший по производительности способ.
     *
     * @param str исходная строка
     * @return развернутая строка
     */
    @Override
    public String reverse(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .reduce("", (s, c) -> c + s, (s1, s2) -> s2 + s1);

    }
}
