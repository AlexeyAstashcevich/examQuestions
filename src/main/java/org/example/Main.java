package org.example;
import org.example.helpers.AbstractBase;

import java.util.ArrayList;

public class Main extends AbstractBase {
    public static void main(String[] args) {
        // перевернуть строку
        System.out.println(cycleHelper.reverseString("qwerty"));
        // заменить символ в строке
        System.out.println(cycleHelper.changeString("qwerty", 'q', 'd'));
        //удалить определенный символ в строке
        System.out.println(cycleHelper.deleteCharFromString("qwerty", 'q'));
        //подсчитать сколько раз символ встречается в строке, учитывая различные раскладки
        System.out.println(cycleHelper.howMuchLetterWasUsed("qwertyqq", 'q'));
        //вывести строку указанное число раз с разделителем
        cycleHelper.recurseWithSeparator("qwerty", 3, "//");
        //написать метод который определяет является ли строка палиндромом
        System.out.println(cycleHelper.isItAPalindrome("qweewq"));
        //написать метод который определяет является ли слово анаграммой (например рано - нора)
        System.out.println(cycleHelper.isItAAnagram("qwerty", "wqerty"));
        //вычислить число Фибоначчи
        System.out.println(cycleHelper.fibonachiNumbers(18));
        //вычислить факториал
        System.out.println(cycleHelper.factorialNumbers(4));

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Astashcevich");
        nameList.add("Burdenko");
        nameList.add("Vinokur");

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(-5);
        list.add(-8);

        //Создать коллекцию целых чисел, написать методы:
        //2.1. Который отрицательные числа делает положительными и возвращает коллекцию ([1, 5, -3, 7] -> [1, 5, 3, 7])
        System.out.println(streamHealper.exchangePlusToMinus(list));
        //2.2. Который четные числа умножает на 100, а от нечетных отнимает 100 и возвращает коллекцию. Количество принимаемых и возвращаемых элементов коллекций должно совпадать
        System.out.println(streamHealper.plus100ForCountableAndMinus100ForUncountable(list));
        //2.3. Есть стринговый лист фамилий, нужно пройтись по списку, вытащить фамилии которые начинаются на А и поместить их в другой список для дальнейшей работы с ними
        System.out.println(streamHealper.getLastNamesStartsWithA(nameList));
    }
}