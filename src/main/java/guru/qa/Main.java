package guru.qa;

public class Main {

    public static void main(String[] args) {

        //1) поупражняться с математическими и логическими операторами,
        // добиться переполнения при вычислениях,
        // посмотреть результаты (вывести в консоль)
        //2) попробовать вычисления комбинаций типов данных (int и double)

        int a = 120;
        int b = 20;
        int c = 60;
        int d = 40;
        byte e = 127;
        byte minValue = Byte.MIN_VALUE;
        String bigcountry = "Brazil";
        String smallcountry = "Uruguay";
        int population = 220000000;
        int sugarweight = 12;
        double coffeeweight = 2.5;
        double milkweight = 1.3;

        // Арифметические операторы + - * / % ++ --

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / c = " + (a / c));
        System.out.println("c % d = " + (c % d));
        System.out.println("c % a = " + (c % a));

        System.out.println("a++ = " +  (a++));
        System.out.println("++a = " +  (++a));

        //Операторы сравнения == , != , > , < , >= , <=

        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b : " + (a > b));
        System.out.println("a >= b : " + (a >= b));

        // Логические операторы &&(&)  ||(|) , !

        System.out.println(bigcountry.equals("Brazil") && population == 220000000);
        System.out.println(bigcountry.equals("Uruguay") && population == 220000000);

        System.out.println(bigcountry.equals("Uruguay") || population == 220000000);
        System.out.println(bigcountry.equals("Uruguay") || population == 100000000 || smallcountry.equals("Uruguay"));

        System.out.println(!(bigcountry.equals("Brazil") && smallcountry.equals("Uruguay")));

        //Переполнение

        System.out.println("++e = " +  (byte)(++e));
        System.out.println("minValue - 1 : " + (byte)(minValue - 1));

        //Вычисления комбинаций типов данных (int и double)

        System.out.println("sugarweight + coffeeweight = " + (sugarweight + coffeeweight));
        System.out.println("sugarweight - coffeeweight = " + (sugarweight - coffeeweight));
        System.out.println("sugarweight + coffeeweight = " + (sugarweight * coffeeweight));
        System.out.println("sugarweight + coffeeweight = " + (sugarweight / coffeeweight));
        System.out.println("coffeeweight + milkweight = " + (coffeeweight + milkweight));
    }

}