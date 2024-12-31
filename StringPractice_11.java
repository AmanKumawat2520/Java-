import java.util.Scanner;

public class StringPractice_11 {
    // remove all Special character from string except alphabet

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s2=s.toLowerCase().trim();
        StringBuilder result=new StringBuilder();
      
        
        for(int i=0;i<s2.length();i++){
            if((s2.charAt(i)>=65 && s2.charAt(i)<=90)|| (s2.charAt(i)>=97 && s2.charAt(i)<=122)){
            result.append(s2.charAt(i));


            }
            
        }
       System.out.println(result);
        
    
    }

}


