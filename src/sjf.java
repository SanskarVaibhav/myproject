import java.util.*;
public class sjf{
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
        int f[]=new int[n];
        int  st=0,tot=0;
        float avgwt=0,avgtat=0;
        for(int i=0;i<n;i++)
        {
            System.out.print("enter process "+(i+1)+" arrival time : ");
            ar[i]=sc.nextInt();
            System.out.print("enter process "+(i+1)+" burst time : ");
            bt[i]=sc.nextInt();
            Pid[i]=i+1;
            f[i]=0;
        }
       
        while (true) 
        {
          int c=n,min=999;
          if(tot==n)
          break;
        for(int i=0;i<n;i++)
        {
            if((ar[i]<=st) &&(f[i]==0) && (bt[i]<min))
            {
              min=bt[i];
              c=i;
            }
        }
         if(c==n)
         st++;
         else
         {
            ct[c]=st+bt[c];
            st +=bt[c];
            tat[c]=ct[c]-ar[c];
            wt[c]=tat[c]-bt[c];
            f[c]=1;
            tot++;
         }
        }
        System.out.println("\nPid  arrival burst complete turnaround waiting ");
            for(int i=0;i<n;i++)
            {
                avgwt +=wt[i];
                avgtat +=tat[i];
                System.out.println(Pid[i]+"\t"+ar[i]+"\t"+bt[i]+"\t"+ct[i]+"\t"+tat[i]+"\t"+wt[i]);
            }
            sc.close();
            System.out.print("\n average waiting time: "+(float)(avgwt/n));
            System.out.print("\n average turnaround time: "+(float)(avgtat/n));
    }

}