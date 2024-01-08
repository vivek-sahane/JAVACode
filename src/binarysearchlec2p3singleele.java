public class binarysearchlec2p3singleele {

    /*
     rotated sorted array give the number which is not repeated
     Time complexity = O(logn)
    */
    static int search(int[]a,int target){                                    //M1
        int st=0 , end=a.length-1 ;

        while(st<=end){
            int mid=st +(end-st)/2 ;

            if(a[mid] == target){
                return mid ;
            }
            else if(a[st] == a[mid] && a[end]== mid) {

                st++ ;
                end-- ;
            }
            else if(a[mid] <= a[end]){       //mid to end is sorted
                if(target > a[mid] && target <= a[end]){
                    st =mid+1 ;
                }
                else{
                    end = mid-1 ;
                }
            }
            else{       //st to mid is sorted
                if(target >= a[st] && target < a[mid]){
                    end = mid-1 ;
                }
                else{
                    st = mid+1 ;
                }
            }
        }
        return -1 ;
    }

    public static int singleNumber(int[] nums) {                        //M2

        int xor = nums[0];
            /*
            we use xor operator to find unique numbers ,which cancles the duplicate array
            */
        for(int i= 1 ; i<nums.length ; i++){
            xor ^= nums[i];
        }
        return xor ;
    }

    public static void main(String[] args) {

        int[]a = {1,1,1,2,2,3,1};
        int target =1 ;
        System.out.println(search(a, target));
    }
}




