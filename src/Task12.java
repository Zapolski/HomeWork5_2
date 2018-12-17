import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        System.out.print("Введите размерность массива: ");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int[] mas = new int[n];
        System.out.println("Введите целые числа для заполнения массива: ");
        for (int i = 0; i < n; i++) {
            mas[i] = Integer.parseInt(sc.nextLine());
        }

        boolean flag = true;
        for (int i = 0; i < n / 2; i++) {
            if (mas[i] != mas[n-i-1]) {
                flag = false;
                break;
            }
        }
        if (flag) System.out.println("Yes");
        else System.out.println("No");
    }
}
