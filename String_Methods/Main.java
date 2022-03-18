import javax.swing.plaf.synth.SynthSeparatorUI;

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

       //

    }
}