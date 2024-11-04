
import java.util.*;

public class TelephoneDirectory {
    private static Map<String, List<String>> telephoneDirectory = new HashMap<>();

    public static void add(String surname, String phoneNumber) {
        telephoneDirectory.computeIfAbsent(surname, k -> new ArrayList<>()).add(phoneNumber);
    }

    public static List<String> get(String surname) {
        return telephoneDirectory.getOrDefault(surname, new ArrayList<>());
    }

    public static void main(String[] args) {
        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();
    }
}
