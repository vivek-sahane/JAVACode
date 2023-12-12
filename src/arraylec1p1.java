public class arraylec1p1 {
   public static void Arrayofsum() {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i <array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Arrayofsum();
    }
}
