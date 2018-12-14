import java.util.Arrays;
import java.util.HashSet;

public class Task04 {
    public static void main(String[] args) {
        int[] mas = {1,2,3,4};
        if (isWithDifferentElements(mas)) System.out.println("Yes");
        else System.out.println("No");
    }

    public static boolean isWithDifferentElements (int[] mas){

        for (int i = 0; i < mas.length-1; i++) {
            for (int j = i+1; j < mas.length; j++) {
                if (mas[i]==mas[j]) return false;
            }
        }
        return true;

        //решение потоками и ссылками на методы
        //return Arrays.stream(mas).allMatch(new HashSet<>()::add);
    }
}
