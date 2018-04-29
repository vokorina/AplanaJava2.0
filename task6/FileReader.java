package task6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileReader {
    public static void main(String[] args) {
        Scanner fileScanner;
        try {
            fileScanner = new Scanner(new File("C:\\Users\\Alina\\IdeaProjects\\AplanaJava2.0\\task6\\words.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
            return;
        }

        Map<String, Integer> words = new TreeMap<>();
        int max = 0;
        String maxWord = null;
        while (fileScanner.hasNext()) {
            String word = fileScanner.next();
            int counter = words.getOrDefault(word, 0);
            counter++;
            if (counter > max) {
                max = counter;
                maxWord = word;
            }
            words.put(word, counter);
        }

        System.out.println("Отсортированные слова из файла: " + words.keySet());

        System.out.println("Статистика по каждому слову:");
        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " раз(а)");
        }

        System.out.println("Слово с максимальным количеством повторений: " + maxWord + " (" + max + " повтора)");
    }
}
