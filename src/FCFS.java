import java.util.*;
public class FCFS{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter no. of process ");
        int n=sc.nextInt();
        int Pid[]=new int[n];
        int ar[]=new int[n];
        int bt[]=new int[n];
        int ct[]=new int[n];
        int tat[]=new int[n];
        int wt[]=new int[n];
        int  temp;
        float avgwt=0,avgtat=0;
        for(int i=0;i<n;i++)
        {
            System.out.print("enter process "+(i+1)+" arrival time : ");
            ar[i]=sc.nextInt();
            System.out.print("enter process "+(i+1)+" burst time : ");
            bt[i]=sc.nextInt();
            Pid[i]=i+1;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-(i+1);j++){
                if(ar[j]>ar[j+1]){
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                    temp=bt[j];
                    bt[j]=bt[j+1];
                    bt[j+1]=temp;
                    temp=Pid[j];
                    Pid[j]=Pid[j+1];
                    Pid[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(i==0){
                ct[i]=ar[i]+bt[i];
            }
            else{
                if(ar[i]>ct[i-1]){
                    ct[i]=ar[i]+bt[i];
                }
                else{
                    ct[i]=ct[i-1]+bt[i];
                }
                tat[i]=ct[i]-ar[i];
                wt[i]=tat[i]-bt[i];
                avgwt += wt[i];
                avgtat += tat[i];
            }
        }
        System.out.println("\nPid  arrival burst complete turnaround waiting ");
            for(int i=0;i<n;i++)
            {
                System.out.println(Pid[i]+"\t"+ar[i]+"\t"+bt[i]+"\t"+ct[i]+"\t"+tat[i]+"\t"+wt[i]);
            }
            sc.close();
            System.out.print("\n average waiting time: "+(avgwt/n));
            System.out.print("\n average turnaround time: "+(avgtat/n));
    }

}