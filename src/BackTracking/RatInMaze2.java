package BackTracking;
import java.util.*;
public class RatInMaze2 {

    private static void print(int sr , int sc , int er , int ec, String s){
        if(sr>er || sc>ec){
            System.out.println(s);
            return ;
        }
        //go down
        print(sr+1,sc,er , ec,s+"D");
        print(sr,sc+1,er,ec,s+"R");
    }

    public static void main(String[] args) {
        int rows =3;
        int cols = 3;
        print(1,1,rows,cols,"");
    }
}
