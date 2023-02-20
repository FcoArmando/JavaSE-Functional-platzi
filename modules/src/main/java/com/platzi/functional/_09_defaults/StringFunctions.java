package com.platzi.functional._09_defaults;

public class StringFunctions {
    @FunctionalInterface
    interface StringOperaion {
        int getAmount();

        default void operate (String text){
            int x = getAmount();
            while (x-- > 0){
                System.out.println(text);
            }
        }
    }

    public static void main(String[] args) {
        StringOperaion six = () -> 6;
        six.operate("Alumno");
    }
}
