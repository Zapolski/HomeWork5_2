import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        System.out.print("Введите размерность массива: ");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        String[] mas = new String[n];
        System.out.println("Введите слова для заполнения массива (строчные латринские буквы, разелены пробелами от 1 до 5): ");
        for (int i = 0; i < n; i++) {
            mas[i] = sc.nextLine();
        }

        int count = 0;
        for (int i = 0; i < n; i++)
            count += mas[i].split("[ ]+").length;
        System.out.println("Общее количество слов в массиве: "+count);
    }
}
