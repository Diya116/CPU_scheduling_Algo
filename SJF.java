//shortest job first
public class SJF{
    public static void main(String[] args) {
        int p[][]={{1,4},{2,3},{3,5},{4,2},{5,1}};
        int[] wt=new int[p.length];
       float avg_wt,avg_tat;
       //sorting according to burst time
         for(int i=0;i<p.length;i++)
         {
              for(int j=0;j<p.length-i-1;j++)
              {
                if(p[j][1]>p[j+1][1])
                {
                     int temp=p[j][1];
                     p[j][1]=p[j+1][1];
                     p[j+1][1]=temp;
                     temp=p[j][0];
                     p[j][0]=p[j+1][0];
                     p[j+1][0]=temp;
                }
              }
         }
            //waiting time
            wt[0]=0;
            for(int i=1;i<p.length;i++)
            {
                wt[i]=wt[i-1]+p[i-1][1];
            }
            //average waiting time
            avg_wt=0;
            for(int i=0;i<p.length;i++)
            {
                avg_wt+=wt[i];
            }
            avg_wt=avg_wt/p.length;

            //turn around time
            int tat[]=new int[p.length];
            for(int i=0;i<p.length;i++)
            {
                tat[i]=wt[i]+p[i][1];
            }
            //average turn around time
            avg_tat=0;
            for(int i=0;i<p.length;i++)
            {
                avg_tat+=tat[i];
            }
            avg_tat=avg_tat/p.length;
            System.out.println("Average Waiting Time is "+avg_wt);
            System.out.println("Average Turn Around Time is "+avg_tat);
            
        }
}

