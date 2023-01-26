package Work;

public class Third {
    //3.Есть число(к примеру 5)
    //Значит программа должна выводить 1 22 333 4444 55555
    public static void main(String[] args) {
        for(int q = 0;q <= 5;q++) {
            for(int w = 1;w <= q;w++){
                System.out.println(q);
            }
            System.out.println();
        }
    }
}