import javax.swing.plaf.synth.SynthSeparatorUI;

import javafx.scene.chart.ValueAxis;

public class Main
{
    public static void main(String[] args) {
        
        String s="gurucharamn chouhan";


        // length()
        System.out.println(s.length());

        // get char of any index 
       System.out.println(s.charAt(0)); // 0th index element

       // substring 
       System.out.println(s.substring(2,5));

       // intern method  used for copy the String
       System.out.println(s.intern());       

       // lastindex used for taking the last char of given String

       System.out.println(s.lastIndexOf('n'));

        // find the indexof given element
       System.out.println(s.indexOf('u')); // starting from 0
 
       // get first element
       System.out.println(s.startsWith("gu"));
      
       // join the Strings
       String x=String.join("guru","charan","jasbir","aman","mrinal");
       System.out.println(x);

       // replace used for replacing the character from string and set another char
       String p="pepcoding";

       // now i want to replace the charachter p 
       System.out.println("replacing String " +p.replace('p','k'));

       // replaceAll character from String which i want to replace 
       String g="pepcoding";
       System.out.println(g.replaceAll("p","k"));
 
       // split use for String convert in array
       String s1="guru,charan,chouhan,ghughariyakhedi,khargone";
       String a[]=s1.split(","); // cut based on ,
       for(String val:a)
       {
           System.out.print(val +" ");
       }

       System.out.println();
       String k1="  gurucharan   ";
       System.out.println(k1.trim());

       char ch[]=k1.toCharArray();

       for(char chh:ch)
       {
           System.out.print(chh +" ");
       }

        System.out.println();
       //valueOf used for getting int value from String
       String number="103";
       int n=Integer.valueOf(number);
       System.out.println(n);
    }
}