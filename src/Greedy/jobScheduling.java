package Greedy;

import java.util.ArrayList;
import java.util.Collections;

public class jobScheduling {

    char id;
    int deadline,profit;

    public jobScheduling(){};
    public jobScheduling(char id, int deadline,int profit){
        this.id=id;
        this.deadline=deadline;
        this.profit=profit;
    }
    void printJobSequence(ArrayList<jobScheduling> arr,int maxDeadline){
        //1.Sort the arr in decreasing order of the profit
        //lambda epressions
        //nlog(n)
        int n=arr.size();
        Collections.sort(arr,(a,b)->b.profit-a.profit);

        //2.Store the job ids on the basis of the max profite and the given deadline

        //To track the alloted jobs
        boolean result[]=new boolean[maxDeadline];

        //To store the jobs ids
        char job[]=new char[maxDeadline];

        //o(n2)
        for(int i=0;i<n;i++){
            for(int j=Math.min(maxDeadline-1 , arr.get(i).deadline-1);j>=0 ; j--){
                if(result[j]==false){
                    result[j]=true;
                    job[j]=arr.get(i).id;
                    break;
                }
            }
        }
        for(char id:job){
            System.out.print(id+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<jobScheduling> arr = new ArrayList<>();
        arr.add(new jobScheduling('1',5,55));
        arr.add(new jobScheduling('2',2,65));
        arr.add(new jobScheduling('3',7,75));
        arr.add(new jobScheduling('4',3,60));
        arr.add(new jobScheduling('5',2,70));
        arr.add(new jobScheduling('6',1,50));
        arr.add(new jobScheduling('7',4,85));
        arr.add(new jobScheduling('8',5,68));
        arr.add(new jobScheduling('9',3,45));

        System.out.println("Job sequence order to get the maximum profite is: ");
        jobScheduling job = new jobScheduling();

        job.printJobSequence(arr,7);
    }
}
