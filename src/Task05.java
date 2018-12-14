import java.util.Arrays;

public class Task05 {
    public static void main(String[] args) {
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++)
            mas[i]=Task02.rnd(-10,10);

        Arrays.sort(mas);
        int count=1;
        for (int i = 0; i < mas.length-1; i++) {
            int current=mas[i];
            if (current!=mas[i+1]){
                if (count>1){
                    System.out.println(mas[i]+" повторяется "+(count-1)+" раз(а)");
                    count=1;
                }
            }else count++;
        }
        if (count>1) System.out.println(mas[mas.length-1]+" повторяется "+(count-1)+" раз(а)");
    }
}
