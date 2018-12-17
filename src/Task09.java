import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        System.out.print("Введите размерность массива: ");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int[] mas = new int[n];
        for (int i = 0; i < n; i++) {
            mas[i] = Task02.rnd(-2,n);
        }
        System.out.println("Исходный массив: ");
        Task02.printMas(mas);

        //проверяем есть ли в массиве хоть одно число меньше -1
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (mas[i]<-1){
                flag=true;
                break;
            }
        }
        //если нашли производим манипуляции
        if (flag){
            for (int i = 0; i < n; i++)
                if (mas[i] < 0) mas[i] = mas[i] * mas[i];
            System.out.println("Массив после преобразования: ");
            Task02.printMas(mas);
        }else System.out.println("Преобразование массива не потребовалось (отсутствует элемент меньше -1)");




    }
}
