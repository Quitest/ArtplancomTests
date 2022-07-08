package ru.pel.artplancom.task1;

public class StringBufferReverser implements StringReverser {
    /**
     * Для разворота строки используется StringBuffer - чуть более медленная реализация по отношению к StringBuilder,
     * но зато методы StringBuffer потокобезопасные.
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
            result = new StringBuffer(str).reverse().toString();
        return result;
    }
}
