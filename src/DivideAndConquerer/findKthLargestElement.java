package DivideAndConquerer;

public class findKthLargestElement {

        public int partition(int[] arr, int l, int h, int i) {
            int pivot = arr[i];
            int temp;
            int pIndex = l;

            for (int j = l; j < h; j++) {
                if (arr[j] <= pivot) {
                    temp = arr[pIndex];
                    arr[pIndex] = arr[j];
                    arr[j] = temp;
                    pIndex++;
                }
            }

            temp = arr[pIndex - 1];
            arr[pIndex - 1] = arr[i];
            arr[i] = temp;

            return pIndex - 1;
        }

        public int selectionProcedure(int[] arr, int l, int h, int v) {
            int m = partition(arr, l, h, l);
            if (m == v) {
                return arr[m];
            } else if (m < v) {
                return selectionProcedure(arr, m + 1, h, v);
            } else {
                return selectionProcedure(arr, l, m, v);
            }
        }

        public int findKthLargest(int[] arr, int k) {
            int v = arr.length - k;
            int l = 0;
            int h = arr.length;
            return selectionProcedure(arr, l, h, v);
        }


}
