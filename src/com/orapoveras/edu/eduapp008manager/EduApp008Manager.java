package com.orapoveras.edu.eduapp008manager;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * Часть комментариев можно помещать в специальную конструкцию для комментариев /**
 * Такие комментарии сильно отличаются в лучшую сторону в части читаемости или заметности
 *
 * Прикладная часть приложения делает следующее:
 *  Читается содержимое (текстовое) из файла ресурса (input2.txt)
 *  Строки файла сортируются
 *  И после сортировки выводятся на консоль
 *
 */

public class EduApp008Manager {
//    Несколько примеров эффективной работы, которые существенно помогают в написании кода на Intellij IDEA
//    Оригинал смотреть здесь: https://www.youtube.com/watch?v=tpv5n2jWHlw
//
//    Shift + Enter - смышленая вставка строки после строки, на которой находится курсор. Курсор может находится в
//    середине строки, тем не менее новая строка будет добавлена с нужным количеством отступов
//
//    Ctrl + Shift + Space - смышленое "автозаполнение" (smart completion), в отличие от обычного Ctrl + Space, которое вываливает
//    полный список всех возможных вариантов, смышленый формирует и показывает только те варианты, которые совместимы
//    по типу
//
//    Использование шаблонов, которые после нажатия TAB преобразуются в несколько слов
//    Например, psvm родит public static void main(String[] args) {}
//    
//    Alt + Enter - откроет окно с вариантами действий, которое привязано к пиктограмме "Лампа" (ну или лампочка)
//

    public static void main(String[] args) throws IOException {
        // Как можно открыть файл используя не абсолютный, а относительный путь
        //BufferedReader reader = new BufferedReader(new FileReader("e:\\Public\\pit\\Projects\\SVNWorkCopyFromDropbox\\trunk\\LearnJava\\EduApp008\\src\\input.txt"));
        //BufferedReader reader = new BufferedReader(new FileReader("input2.txt"));

        // Для создать файл с ресурсами можно пользоваться шорткатом "Jump to Navigation Bar" Alt + Home

        // А еще есть такая прикольная штука, называется Refactoring. С ее помощью можно менять делать замену выражения
        // на переменную, при этом сама переменная создается средой разработки автоматически
        Reader in = new FileReader("input2.txt");
        String[] array = loadAndSort(in);

        // Существует много шаблонов итераторов (например, по спискам, или, например, по специализированным массивам),
        // В случае нашего примера подойдет самый базовый и универсальный итератор, выбор по: <iter>
        for (String s : array) {
            System.out.println(s);
        }

    }

    // Метод loadAndSort был сделан не руками, а средой разработки с помощью инструмента introduce method
    // для этого выделяется блок кода, нажимается shortcut Ctrl + Alt + M
    static String[] loadAndSort(Reader in) throws IOException {
        BufferedReader reader = new BufferedReader(in);

        // Для создать файл с ресурсами можно пользоваться шорткатом "Jump to Navigation Bar" Alt + Home

        // среда может подчеркивать операторы и таким образом подсказывать, что нет кода "ловли"
        // исключений, которые может "бросать" (генерировать) объект
        //
        // Исключение можно не только ловить, его еще можно "пробрасывать"
        // (использовать для этого конструкцию throws IOException)
        // (для этого примера это самое правильное решение)

        // List<String> lines = new ArrayList<String>();

        List<String> lines = new ArrayList<String>();
        String line;
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }

        reader.close();
        // Преобразование полученного из файла списка строк в массив строк.
        String[] array = lines.toArray(new String[lines.size()]);
        Arrays.sort(array);
        return array;
    }
}
