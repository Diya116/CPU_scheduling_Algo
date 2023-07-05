//First Come First Serve Scheduling Algorithm
class fcfs{
   public static double waitingtime(int p[],int n,int bt[],int wt[])
    { 
   
        wt[0]=0;
        double avg=0;
        for(int i=1;i<n;i++)
        {
            wt[i]=bt[i-1]+wt[i-1];
            avg=avg+wt[i];
        }
        avg=avg/n;
        return avg;
    }
   public static double turnaroundtime(int p[],int n,int bt[],int wt[])
    {
        int tat[]=new int[n];//turn around time
        double avg=0;
        for(int i=0;i<n;i++)
        {
            tat[i]=bt[i]+wt[i];
            avg+=tat[i];
        }
        avg=avg/n;
        return avg;
    }  
    public static void main(String[] args) {
        //arrival time is 0 for all processes
          int p[]={1,2,3,4,5}; //process
          int bt[]={3,6,8,2,4}; //burst time
          int wt[]=new int[p.length];//waiting time
         double avg_wt=waitingtime(p,p.length,bt,wt);
         System.out.println("Average waiting time is "+avg_wt);
         double avg_tot=turnaroundtime(p,p.length,bt,wt);
         System.out.println("Average turn around time is "+avg_tot);
    } 
} 