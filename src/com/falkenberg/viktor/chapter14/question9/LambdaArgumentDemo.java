package com.falkenberg.viktor.chapter14.question9;
/*Используя программу, созданную в упражнении 14.1, создайте лямбда-выражение,
которое удаляет все пробелы из заданной строки и возвращает результат.
Продемонстрируйте работу этого метода, передав его методу changeStr () .*/
public class LambdaArgumentDemo {
    public static void main(String args[]) {
        String inStr = "Лямбда-выражения расширяют Java";
        String outStr;
        System.out.println("Входная строка: " + inStr);
        StringFunc reverse = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);

            }
            return result;
        };
        StringFunc deleteSpace = (str) -> {
            String result ="";
            String[] masStr = str.split(" ");
            for (String s: masStr){
                result += s;
            }
            return result;
        };
        outStr = changeStr(deleteSpace, inStr);
        System.out.println("Строка без пробелов: " + outStr);
        outStr = changeStr(reverse, inStr);
        System.out.println("Обращенная строка: " + outStr);
        outStr = changeStr((str) -> str.replace(' ', '-'), inStr);
        System.out.println("Строка с замененными пробелами: " + outStr);
        outStr = changeStr((str) -> {
            String result = "";
            char ch;
            for (int i = 0; i < str.length(); i++) {
                ch = str.charAt(i);
                if (Character.isUpperCase(ch))
                    result += Character.toLowerCase(ch);
                else
                    result += Character.toUpperCase(ch);
            }
            return result;
        }, inStr);
        System.out.println("Строка с обращенным регистром букв: " + outStr);
    }

    static String changeStr(StringFunc sf, String s) {
        return sf.func(s);
    }
}
