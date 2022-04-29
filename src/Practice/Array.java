package Practice;

public class Array {
    public static void main(String[] args) {

        int[] array = {1, 1, 2, 3, 5, 8};
        for (int i : array) {
            if ((i % 2) == 1) {
                System.out.println(i);
            }
        }



    }
}
