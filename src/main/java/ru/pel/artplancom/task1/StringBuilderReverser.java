package ru.pel.artplancom.task1;

public class StringBuilderReverser implements StringReverser {
    /**
     * Для разворота строки используется StringBuilder - чуть более быстрая реализация по отношению к StringBuffer,
     * но зато методы StringBuilder могут некорректно отрабатывать в многопоточном приложении.
     *
     * @param str исходная строка
     * @return развернутая строка или пустая, если передан null
     */
    public String reverse(String str) {
        String result;
        if (str == null) {
            result = "";
        } else
            result = new StringBuilder(str).reverse().toString();
        return result;
    }
}
