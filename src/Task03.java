public class Task03 {
    public static void main(String[] args) {
        int[] mas = {0,1,0,0};
        if (isWithSameValues(mas)) System.out.println("Yes");
        else System.out.println("No");
    }

    public static boolean isWithSameValues (int[] mas){
        int n = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (mas[i]!=n)
                return false;
        }
        return true;
    }
}
