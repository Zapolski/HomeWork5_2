import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.print("Введите размерность массива: ");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int[] mas = new int[n];
        for (int i = 0; i < n; i++) {
            mas[i] = Task02.rnd(0,33);
        }
        Task02.printMas(mas);

        int index = -1;
        for (int i = 1; i < n-1; i++) {
            if ((mas[i - 1] != 0) && (mas[i + 1] != 0))
                if ((mas[i] % mas[i - 1] == 0) && (mas[i] % mas[i + 1] == 0)) {
                    index = i;
                    break;
                }
        }
        System.out.println(index);
    }
}
