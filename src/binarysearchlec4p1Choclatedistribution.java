public class binarysearchlec4p1Choclatedistribution {

    static boolean isDivisionPossible(int[]a,int m,int mxChocAllowed) {    //Time Complexity = n*log n

        int numOfStudents = 1;
        int choc = 0;            //number of choc current students has

        for (int i = 0; i < a.length; i++) {

            if (a[i] > mxChocAllowed) return false;

            if (a[i] + choc <= mxChocAllowed) {

                choc += a[i];
            }
        }
        return numOfStudents <= m;
            /*
            if(numOfStudents > m )return false;
            return true;
             */
    }
        static int distributeChocolates( int[]a ,int m){

            if(a.length < m)return -1;
            int ans=0,st=1,end=(int)1e9;

            while(st<=end){

                int mid = st+(end-st)/2;

                if(isDivisionPossible(a,m,mid)){
                    ans=mid;
                    end=mid-1;
                }
                else{
                    st=mid+1;
                }
            }
            return ans;
        }

    public static void main(String[] args) {

        int[]a= {5,3,1,4,2};
        int m=3;
        System.out.println(distributeChocolates(a,m));
    }
}
