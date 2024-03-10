package GeeksForGeeks;

public class pushZeroesToEnd {
    void pushZerosToEnd(int[] arr, int n) {
        int nonZeroIndex = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                if (i != nonZeroIndex) {
                    int temp = arr[i];
                    arr[i] = arr[nonZeroIndex];
                    arr[nonZeroIndex] = temp;
                }
                nonZeroIndex++;
            }
        }
    }

    public static void main(String[] args) {

    }
}
