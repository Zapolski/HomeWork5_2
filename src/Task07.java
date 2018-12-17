import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        System.out.print("Введите размерность массива: ");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int[] mas = new int[n];
        for (int i = 0; i < n; i++) {
            mas[i] = Task02.rnd(3,13);
        }
        Task02.printMas(mas);

        for (int i = 3; i <=13 ; i++) {
            System.out.printf("Число %d встречается в массиве %d раз(а).\n",i,countValue(i,mas));
        }
    }

    private static int countValue(int i, int[] mas) {
        int count=0;
        for (int n: mas) if (i==n) count++;
        return count;
    }


}
