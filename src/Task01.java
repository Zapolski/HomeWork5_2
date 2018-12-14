public class Task01 {
    public static void main(String[] args) {
        int[] mas = new int[15];

        int n1 = 0;
        int n2 = 1;
        int current;

        System.out.print("Четные элементы массива из первых 15 чисел Фибоначи: ");
        for (int i = 0; i < mas.length; i++) {
            current=n1+n2;
            n1=n2;
            n2=current;
            mas[i]=current;
            if (mas[i]%2==0) System.out.print(mas[i]+" ");
        }
    }
}
