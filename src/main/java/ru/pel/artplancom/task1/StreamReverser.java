package ru.pel.artplancom.task1;

public class StreamReverser implements StringReverser {
    /**
     * Для разворота строки используется Stream API. Далеко не самый лучший по производительности способ.
     *
     * @param str исходная строка
     * @return развернутая строка или пустая, если передан null
     */
    @Override
    public String reverse(String str) {
        String result;
        if (str == null) {
            result = "";
        } else
            result = str.chars()
                    .mapToObj(c -> (char) c)
                    .reduce("", (s, c) -> c + s, (s1, s2) -> s2 + s1);
        return result;
    }
}
