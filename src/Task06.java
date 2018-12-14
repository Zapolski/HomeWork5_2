import java.util.Arrays;

public class Task06 {
    public static void main(String[] args) {
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++)
            mas[i]=Task02.rnd(-10,10);

        for (int  n: mas) System.out.print(n+" ");
        System.out.println();

        for (int i = 0; i < mas.length; i++)
            if (isUniqueElement(i,mas)) System.out.printf("Элемент %d под индексом %d уникальный.\n",mas[i],i);
    }

    public static boolean isUniqueElement(int index, int[] mas){
        for (int i = 0; i < mas.length; i++) {
            if ((mas[i]==mas[index])&&(i!=index))return false;
        }
        return true;
    }
}
