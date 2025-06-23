package zbell_integrator;

import java.util.*;

public class TableSearch {
    public static void main(String[] args) {
        // Создаем список для хранения строк таблицы
        List<Map<String, String>> table = new ArrayList<>();

        // Добавляем данные в таблицу
        table.add(createRow("Максим", "32", "Middle java dev", "$ 1200"));
        table.add(createRow("Иван", "25", "Junior java dev", "50000 ₽"));
        table.add(createRow("Мария", "35", "Senior java automation QA", "160000 ₽"));
        table.add(createRow("Петр", "28", "Dev-ops", "$ 1700"));
        table.add(createRow("Анна", "31", "Middle functional tester", "€ 1100"));
        table.add(createRow("Кирилл", "36", "Senior java dev", "€ 2500"));
        table.add(createRow("Дмитрий", "22", "Junior java automation Q", "45000 ₽"));

        // Выводим таблицу для проверки
        printTable(table);
    }

    // Метод для создания строки таблицы
    private static Map<String, String> createRow(String name, String age, String position, String salary) {
        Map<String, String> row = new LinkedHashMap<>(); // LinkedHashMap для сохранения порядка столбцов
        row.put("Имя", name);
        row.put("Возраст", age);
        row.put("Должность", position);
        row.put("Зарплата", salary);
        return row;
    }

    // Метод для вывода таблицы
    private static void printTable(List<Map<String, String>> table) {
        // Вывод заголовков
        if (!table.isEmpty()) {
            System.out.println(String.join("\t", table.get(0).keySet()));
        }

        // Вывод строк
        for (Map<String, String> row : table) {
            System.out.println(String.join("\t", row.values()));
        }
    }
}
