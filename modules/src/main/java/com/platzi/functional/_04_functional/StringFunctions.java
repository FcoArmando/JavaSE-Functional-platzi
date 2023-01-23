package com.platzi.functional._04_functional;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class StringFunctions {
    public static void main(String[] args) {
        UnaryOperator<String> quote = text -> "\"" + text + "\"";
        UnaryOperator<String> addMark = text -> text + "!";
        System.out.println(quote.apply("El mundo no es perfecto, pero está ahí, haciendo lo mejor que puede, por eso es tan maravilloso"));
        System.out.println(addMark.apply("El mundo no es perfecto, pero está ahí, haciendo lo mejor que puede, por eso es tan maravilloso"));

        BiFunction<Integer, Integer, Integer> multiplicacion = (x, y) -> x * y;

        System.out.println(multiplicacion.apply(5,10));

        BiFunction<String, Integer, String> leftPad = (text, number) -> String.format("%" + number + "s", text);

        System.out.println(leftPad.apply("Pancheister", 10));

        List<BiFunction<String, Integer, String>> formateadores;

    }
}
