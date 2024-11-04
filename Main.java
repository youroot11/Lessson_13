import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Создаем массив слов
        List<String> words = Arrays.asList(
                "cat", "dog", "snake", "fox", "wolf", "cat", "fox",
                "whale", "bear", "bird", "rabbit", "spider", "snake"
        );

        ArrayList<String> anyAnimals = new ArrayList<>();
        anyAnimals.add("a");

        Set<String> wordCount = new HashSet<>();

        for (int i = 0; i < 13; i++) {
            wordCount.add(words.get(i));
        }
        System.out.println(wordCount);
        int size = wordCount.size();
        System.out.println("Количество уникальных слов - " + size);

        TelephoneDirectory.add("Смирнова", "920-111-11-22");
        TelephoneDirectory.add("Кузнецова", "930-444-22-66");
        TelephoneDirectory.add("Смирнова", "940-888-66-44");

        System.out.println("Номера для Смирнова: " + TelephoneDirectory.get("Смирнова"));

        System.out.println("Номера для Кузнецова: " + TelephoneDirectory.get("Кузнецова"));
    }
}