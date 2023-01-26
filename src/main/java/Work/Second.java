package Work;
public class Second {
    public static void main(String[] args) {
        //2.Вывести массив до середины, а потом в обратном порядке.
        int[] andriy = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int a = 0; a <andriy[3]; a++)
        {
            System.out.println(andriy[a]);
        }
            int length = 0;
            for(int element : andriy) {
                length++;
            }
            for(int o = length -1;o >= 4;o--)
            {
                System.out.println(andriy[o]);
            }

        }
    }

