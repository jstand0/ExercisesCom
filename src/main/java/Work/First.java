package Work;

public class First {
    //1.Вывести массив в обратном порядке
    public static void main(String[] args) {
        int[] andrii = {1, 2, 3, 4, 5, 6, 7, 8};
        int length = 0;
        for (int element : andrii) {
            length++;
        }
        for (int a = length - 1; a >= 0; a--) {
            System.out.println(andrii[a]);
        }
    }
}