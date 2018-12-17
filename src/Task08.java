import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {

        System.out.print("Введите размерность массива: ");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        char[] mas = new char[n];
        for (int i = 0; i < n; i++) {
            mas[i] = (char)Task02.rnd(97, 122);
        }

        for (char ch: mas) System.out.print(ch+"; ");
        System.out.println();

        System.out.println("Символы, встречающиеся более 3-х раз:");
        for (int i = 0; i < n; i++) {
            if ((mas[i])!=0){
                int count =0;
                for (int j = i+1; j < n-1; j++) {
                    if (mas[i]==mas[j]){
                        count++;
                        mas[j]=0;
                    }
                }
                if (count>3) System.out.printf("символ '%s' встречается %d раз\n",mas[i],count);
            }
        }
    }

}
