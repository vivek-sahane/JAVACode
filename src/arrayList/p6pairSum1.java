package arrayList;
import java.util.*;
public class p6pairSum1 {

    public static boolean pairSum(ArrayList<Integer> list, int target)   //M1 O(n)
    {
        int lp=0;
        int rp= list.size()-1;
        while(lp!=rp){
            if(list.get(lp)+ list.get(rp)==target)return true;
            if(list.get(lp)+ list.get(rp)<target)lp++;
            else rp--;
        }
        return false;
    }

    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int bp = 1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {  //breaking point
                bp = i;
                break;
            }
        }

        int lp = bp + 1;
        int rp = bp;

        while (lp != rp) {
            // case 1
            if (list.get(lp) + list.get(rp) == target)
                return true;
            if (list.get(lp) + list.get(rp) < target)
                lp = (lp + 1) % list.size();
            else
                rp = (list.size() + rp - 1) % list.size();
        }

        return false;
    }


    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        //1,8,6,2,5,4,3,7
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(7);
        System.out.println(pairSum(list,4));
    }
}
