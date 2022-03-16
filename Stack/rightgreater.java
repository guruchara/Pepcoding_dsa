import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class rightgreater {

    public static int [] right(int a[])
    {
        int n=a.length;
        int ans[]=new int[n];
         Arrays.fill(ans,-1);
    // Note :-  In below stack we insert only index not value 
        Stack<Integer>st=new Stack<Integer>();        

        // taking for loop for start i=0    
        for(int i=0;i<n;i++)
        {

            while(st.size()!=0 && st.peek()<a[i])
            {
                int idx=st.pop();
                ans[idx]=a[i];                        
            }
              st.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int a[]=new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        int nwarr[]=right(a);

        for(int i=0;i<nwarr.length;i++)
        {
            System.out.print(nwarr[i] +" ");
        }
    }
}
