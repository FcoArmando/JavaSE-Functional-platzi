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

    @FunctionalInterface
    interface DoOperation{
        void take(int i, String text);

        default void execute(int x, String text){
            while (x -- > 0){
                take(5, text);
            }
        }
    }

    public static void main(String[] args) {
        StringOperaion six = () -> 6;
        six.operate("Alumno");

        DoOperation operateFive = (i, text) -> System.out.println(text);
        operateFive.take(5, "Platzi");
    }
}
