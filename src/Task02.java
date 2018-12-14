import java.util.Arrays;

public class Task02 {
    public static void main(String[] args) {
        int[] mas = new int[30];
        for (int i = 0; i < mas.length; i++)
            mas[i]=rnd(-70,50);
        Arrays.sort(mas);
        System.out.println("Минимальный элемент массива: "+mas[0]);
        System.out.println("Максимальный элемент массива: "+mas[mas.length-1]);
    }

    public static int rnd (int min,int max){
        return (int)(Math.random()*((max-min)+1))+min;
    }
}
