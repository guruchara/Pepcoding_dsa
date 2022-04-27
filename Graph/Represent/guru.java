import java.util.Scanner;

public class guru {

    

     public static String getnum(String s)
     {
  
        String words[]={"zero","one","two","three","four","five","six","seven","eight","nine"};

          StringBuffer sb=new StringBuffer();
           // one two three 
           String a[]=s.split(" ");

            // for(String sx:a)
            // {
            //      System.out.print(sx +" ");
            // }           

                        
            //   one  eight double three 

           for(int i=0;i<a.length;i++)
           {
               for(int j=0;j<words.length;j++)
               {
                   if(a[i].equals(words[j])) 
                   { 
                       if(i>0 && a[i-1].equals("double"))
                       {                                                                 
                            int x=j*10+j;
                            sb.append(x);        
                            break;                                              
                       }
                       
                       // 8
                       // 8*100+8*10+8                       
                       if(i>0 && a[i-1].equals("triple"))
                       {                            
                            int x=j*100+j*10+8;
                            sb.append(x);        
                            break; 
                       }
                      sb.append(j);
                      break;
                   }
               }
           }
           return sb.toString();
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();

        System.out.println(getnum(s));
    }
}
