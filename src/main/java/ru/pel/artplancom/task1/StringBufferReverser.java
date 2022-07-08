package ru.pel.artplancom.task1;

public class StringBufferReverser implements StringReverser{
    /**
     * Для разворота строки используется StringBuffer - чуть более медленная реализация по отношению к StringBuilder,
     * но зато методы StringBuffer потокобезопасные.
     * @param str исходная строка
     * @return развернутая строка
     */
    @Override
    public String reverse(String str) {
        return new StringBuffer(str).reverse().toString();
    }
}
