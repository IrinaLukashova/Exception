import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ФИО в формате: (Фамилия Имя Отчество:");
        System.out.println("Введите дату рождения в формате: dd.mm.yyyy");
        System.out.println("Введите пол в формате: f/m");
        String next = scanner.nextLine();



        String[] splits = next.split(" ");
        if (splits.length != 5) {
            System.out.println(Arrays.toString(splits));
            throw new IllegalArgumentException("Неправильное количество данных");
        }
        Human human = new Human(splits[0], splits[1], splits[2], splits[3], splits[4]);


            String[] date = splits[3].split("\\.");
            if (date.length != 3 || Integer.parseInt(date[2]) > 2024 || Integer.parseInt(date[2]) < 1900) {
                throw new IllegalArgumentException("Неверный формат даты рождения");
            }
            if (!(human.gender.equals("m") || human.gender.equals("f"))) {
                System.out.println(human.gender);
                throw new GenderException();
            }
            // Запись в файл
            String fileName = human.lastName + ".txt";
            try (FileWriter fw = new FileWriter(fileName, true);) {
                fw.write(human.toString());
                System.out.println("Данные успешно записаны в файл " + fileName);
            } catch (Exception e) {
                throw new FileNotFindEx("Файл не найден!");
            }
    }
}



