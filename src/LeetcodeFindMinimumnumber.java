public class LeetcodeFindMinimumnumber {

        public int findMin(int[] array) {       //Find minimum number in rotated array Time complexity = O(log n)
            int b=array[0];
            for(int i=1;i<array.length;i++){
                if(array[i]<b){
                    b=array[i];
                }
            }
            return b;
        }


    public static void main(String[] args) {

    }
    }


