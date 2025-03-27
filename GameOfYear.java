import java.util.Scanner;

public class GameOfYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Приветствую Игрока");

        int score = 0;

        while (true) {

            System.out.print("Введите год:");
            int year = scanner.nextInt();

            System.out.print("Введите колличество дней:");
            int days = scanner.nextInt();

            if (days == calculateDays(year)) {
                score++;
            } else {
                System.out.println("Неправильно! В этом году " + calculateDays(year) + " дней!");
                System.out.println("Набрано очков: " + score);
                break;
            }
        }
    }
    public static int calculateDays(int year) {
        if (year % 400 == 0) return 366;
        else if (year % 100 == 0) return 365;
        else if (year % 4 == 0) return 366;
        else return 365;
    }
}
