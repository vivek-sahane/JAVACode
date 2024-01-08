public class binarysearchlec1p3sqrroot {


        public static int mySqrt(int x) {        //method 1

            int st = 0 ;
            int end = x;
            int  ans = -1 ;
            while(st<=end){
                int mid = st + (end-st)/2;
                int val = mid *mid ;
                if(val==x){
                    return mid;
                }
                else if(val<x){
                    ans = mid ;
                    st = mid+1 ;
                }
                else{
                    end = mid -1 ;
                }
            }
            return ans;
        }
        static int mySqrt2(int x){          //method 2 0ms runtime
            return (int)Math.sqrt(x);
        }

    public static void main(String[] args) {
        int x= 24 ;
        System.out.println(mySqrt(x));
    }
    }

