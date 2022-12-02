package practicArrayList;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Практическое задание для Java 8
//
//        1. Напишите программу на Java, чтобы создать новый список массивов,
//        добавить несколько городов, вывести их в консоль.
//
//        2. Напишите программу Java для вставки элемента в список массивов в первую позицию.
//
//        3. Напишите программу Java для извлечения элемента (по указанному индексу)из заданного списка массивов.
//
//        4. Напишите программу Java для обновления определенного элемента массива заданным элементом.
//
//        5. Напишите программу на Java для удаления третьего элемента из списка массивов.
//
//        6. Напишите программу Java для поиска элемента в списке массивов.
//
//        7. Напишите программу на Java для сортировки заданного списка массивов.
//
//        8. Напишите программу на Java для копирования одного списка массивов в другой.
//
//        9. Напишите программу на Java для перемешивания элементов в списке массивов.
//
//        10. Напишите программу на Java, чтобы поменять местами элементы в списке массивов.
//
//        11. Напишите программу Java для извлечения части массива
//
//
//        Java 8 үчүн практикалык тапшырма
//
//        1. Жаңы массив тизмесин түзүү үчүн Java программасын жазыңыз,
//        бир нече шаарларды кошуп, аларды консольго чыгарыныз.
        System.out.println("---------------------------");
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Bishkek");
        strings.add("Osh");
        strings.add("Talas");
        strings.add("Chicago");

        System.out.println(strings);

//        2. Массив тизмесине элементти биринчи орунга киргизүү үчүн Java программасын жаз.
        System.out.println("---------------------------");
           strings.add(0,"Naryn");
        System.out.println(strings);

//        3. Берилген массивдердин тизмесинен элементти (белгиленген индексте)алуу үчүн Java программасын жазыңыз.
        System.out.println("---------------------------");
        System.out.println(strings.get(1));

//        4. Берилген элемент боюнча белгилүү бир массив элементин озгортуу үчүн Java программасын жазыңыз.
        System.out.println("---------------------------");
        System.out.println(strings.set(2, "London"));

//        5. Массив тизмесинен үчүнчү элементти очуруп салуу үчүн Java программасын жазыңыз.
        System.out.println("---------------------------");
        System.out.println(strings.remove(3));

//        6. Массив тизмесиндеги элементти издөө үчүн Java программасын жазыңыз.
        System.out.println("---------------------------");
        System.out.println(strings.contains("Bishkek"));

//        7. Берилген массивдердин тизмесин сорттоо үчүн Java программасын жазыңыз.
        System.out.println("-----------------------------");
        Collections.sort(strings);
        System.out.println("strings = " + strings);

//        8. Бир массив тизмесин экинчи масивге көчүрүү үчүн Java программасын жазыңыз.
        System.out.println("------------------------------------");
        ArrayList<String> strings2 = new ArrayList<>();
        strings2.add("Moscow");
        strings2.add("Jalal-Abad");
        strings2.add("Praga");
        strings2.add("Batken");
        Collections.copy(strings,strings2);
        System.out.println("strings2 = " + strings2);
        System.out.println("strings = " + strings);

//        9. Массив тизмесиндеги элементтерди аралаштыруу үчүн Java программасын жазып.
//        Маанилерин консольго чыгарыныз.
        System.out.println("----------------------");
        Collections.shuffle(strings,new Random());
        System.out.println("strings = " + strings);


//        10. Массив тизмесиндеги элементтерди тескери өзгөртүү үчүн Java программасын жазыңыз.
        System.out.println("----------------");
        Collections.reverse(strings);
        System.out.println("strings = " + strings);

//        11. Аррейлисттин бир бөлүгүн алуу үчүн Java программасын жазыңыз
        System.out.println("----------------------------------");
        System.out.println("strings.subList(1,3) = " + strings.subList(1, 3));

    }
}