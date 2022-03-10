import java.util.Scanner;
import java.util.Stack;

class valid {
    public static boolean valid(String s)
    {
        // String should be (){}[]
          Stack<Character>st=new Stack<Character>();
          
          for(int i=0;i<s.length();i++)          
          {

              char ch=s.charAt(i);              
             if(ch=='{' || ch=='[' || ch=='(')
             {
              st.push(ch);
              }
             else if(st.size()==0)
             {
                 return false;
             }
             else  if(st.peek()!='(' && ch==')')
              {
                  return false;
              }
              else if(st.peek()!='{' && ch=='}')
              {
              return false;
              }
              else if(st.peek()!='[' && ch==']')
              {
                  return false;
              }
              else
              {
                  st.pop();
              }
          } 
        return st.size()==0;   
       
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        if (valid(s)) {
            System.out.println("Yes this is Valid");
        } else {
            System.out.println("Not Valid");
        }
    }
}
