import java.util.Scanner;

// suchen tecnic linkdin
public class climbr {

    public static int climbstair(int cr,int n)
    {
        if(cr==n)
        {
            return 1;
        }
        if(cr>n)
        {
            return 0;
        }

        int x1=climbstair(cr+1, n);
        int x2=climbstair(cr+2, n);

        return x1+x2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        System.out.println(climbstair(0,n));
    }
}
