package guru.qa;

public class JavaTypesAndOperators {

    public class FirstClass {

        byte aByte = 10;    // 8 bit -128 ... 127
        short aShort = 100; // 16 bit -32 768 ... 32 767

        // Самый используемый Тип данных
        int alnt = 1_100_000;    // 32 bit  -2 ^ 31 ... (2 ^ 31) - 1

        long aLong = 100L; // 64 bit   -2 ^ 63 ... (2 ^ 63) - 1

        // Тип данных для чисел с плавающей точкой
        float aFloat = 0.0F;   // 32 bit

        // Самый используемый (если просто хранить, но не использовать Арифметику)
        double aDouble = 0.0D; // 64 bit

        // Символ Юникода
        char aChar = 'c'; // хранится в виде чисел

        // Для Литералов - примитивный тип данных, данные которые будут использоваться в программе как есть
        // = 10
        // = это оператор присвоения, 10 это Литерал
        // $ это Метод
        // boolean aBoolean = true;
        // boolean aBoolean = false;
        String aString = "hello qa.guru!"; // Не примитивный тип данных


// У Функции есть Аргументы + Результат работы (на вход подав Аргументы можно получить Результат)
// Метод - это некая единица кода которая может получить на вход какие то Аргументы и сделать полезную работу
// Метод отвечает за поведение объекта
// Метод! - нужен для описания поведения объекта
// С этого Метода начинается  любая Java программа и запускается Тест

// Математические операторы
// + --- сложение
// - --- вычитание
// * --- умножение
// / --- целочисленное деление
// % --- остаток от деления
// инкремент ++ изменение значения на 1
// декремент -- изменение значения на 1
//  System.out.println(5 + 10);


// Логические операторы
// < -- больше
// > -- меньше
// <= -- больше и равно
// >= -- меньше и равно
// == -- равно
// != -- не равно
// !  -- отрицание
//   System.out.println(2 != 3);


// =
// +=
// -=
// *=
// /=
// Переменная которая хранится только внутри Метода
// int a = 10;
// int b = 10;
// a = a + b;
// a += b;

// System.out.println(a++);
// System.out.println(++a);

// Фигурные скобки - это область Видимости

// System.out.println(5 % 2);

// Логические операторы и + или
// &&  (&) "I"
// ||  (|) "ILI"
// ! - отрицание меняет true на falce и наоборот

// boolean result=(3>2)&&(3>1);
// boolean result=!(3< 4)||false;

// Book murzilka = new Book();
//murzilka.doReadBook();
    }

    ////!Book - Java class // public class Book(string) {
    // string author = "Дима Тучс";
    // string text = "Мурзилка";
    // void doReadBook() {
    // System.out.println("книга прочитана! + author");


    public static void main(String[] args) {
        byte b = 100;
        int i = 200, k = 300;
        long l = 70_000_000_000L;
        // b = b + 150; переполнение типа byte
        //  k  = k - 1000000000000000000000000; переполнение типа int
        System.out.println((k + i) > (i - k));
        System.out.println(k * i);
        System.out.println(k / i);
        System.out.println(k % i);
        System.out.println(i += k); // int + long

        System.out.println(l + k);

        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

        System.out.println(b > i);
        System.out.println(k != i);

        float f = 0.3F;
        double d = 7.30;
        System.out.println(((f - d) > 0) && ((d - f) > 0));
        System.out.println(((f - d) > 0) || ((d - f) > 0));
        System.out.println(d / f);
        System.out.println(d % f);

        char c = 'q', t = 'a';
        boolean bol = false;
        System.out.println(c + t); // char + char
        System.out.println(!bol);
    }
}

