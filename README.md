# Lesson7

Пререквизиты:

- Ознакомится с методами класса String

https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html

- Обратить внимание на методы: toCharArray, charAt, indexOf, intern, contains, startWith, valueOf



1. Создать пустой проект в IntelliJ



2. Создать метод findSymbolOccurance. Метод принимает в качестве параметров строку и символ. Необходимо вычислить, сколько раз символ встречается в переданной строке и вернуть это числовое значение.



3. Создать метод findWordPosition. Метод принимает в качестве параметров две строки (source, target). Необходимо выяснить, является ли target (подстрока) частью строки source. Если да, тогда вернуть номер позиции (индекс) первого элемента подстроки в строке, иначе вернуть -1.

Пример 1:

Source: Apollo

Target: pollo

Result: 1



Пример 2:

Source: Apple

Target: Plant

Result: -1



4. Создать метод stringReverse. Метод принимает в качестве параметра строку. Необходимо ее развернуть и вернуть измененный вариант.

Например:

Hello -> olleH



5. Создать метод isPalindrome. Метод принимает в качестве параметра строку. Необходимо Проверить является ли переданная строка палиндромом. Если да, тогда вернут true, иначе false.

Пример 1:

ERE -> true



Пример 2:

Allo -> false



6. * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,

сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.

apple – загаданное

apricot - ответ игрока

ap############# (15 символов, чтобы пользователь не мог узнать длину слова)

Для сравнения двух слов посимвольно, можно пользоваться:

String str = "apple";

str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции

Играем до тех пор, пока игрок не отгадает слово

Используем только маленькие буквы



ВАЖНО: При работе с заданием использовать классы:

- java.util.Scanner для ввода информации через консоль

https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Scanner.html

- java.util.Random для генерации случайных чисел (индексов)

https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Random.html