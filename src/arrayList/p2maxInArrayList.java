package arrayList;
import java.util.*;
public class p2maxInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        int max=Integer.MIN_VALUE;
        for(int i=0;i< list.size();i++){
            if(list.get(i)>max){
                max= list.get(i);
            }
        }
        System.out.println("Max Element: "+max);
    }
}
