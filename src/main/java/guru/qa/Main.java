package guru.qa;

public class Main {

    public static void main(String[] args) {

        //1) поупражняться с математическими и логическими операторами,
        // добиться переполнения при вычислениях,
        // посмотреть результаты (вывести в консоль)
        //2) попробовать вычисления комбинаций типов данных (int и double)

        // Примитивные типы данных
        //boolean isNameIvan = false;
        //Boolean isName = false;
        //boolean unbox = isName;

        //byte varByte = 0;  // -128 ... 127
        //short varShort = 0; // -32768 ... 32767
        //int varInt = 0; // -2147483648 ... 2147483647
        //long varLong = 0; //
        //char varChar = '0';
        //float varFloat = 0.0F;
        //double varDouble = 0.0;

        // Операторы

        // Арифметические + - * / % ++ --

        int a = 120;
        int b = 20;
        int c = 60;
        int d = 40;
        byte e = 127;
        byte minValue = Byte.MIN_VALUE;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / c = " + (a / c));
        System.out.println("c % d = " + (c % d));
        System.out.println("c % a = " + (c % a));

        System.out.println("a++ = " +  (a++));
        System.out.println("++a = " +  (++a));

        //Переполнение
        System.out.println("++e = " +  (byte)(++e));
        System.out.println("minValue - 1 : " + (byte)(minValue - 1));

        //Операторы сравнения

        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b : " + (a > b));
        System.out.println("a >= b : " + (a >= b));


        // Логические операторы &&(&)  ||(|) , !
        //String name = "Lol";
        //int age = ;


    }

}