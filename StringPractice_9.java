import java.util.Scanner;

public class StringPractice_9 {
    /// remove all vowels

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s2=s.toLowerCase().trim();
        StringBuilder result=new StringBuilder();
       
        
        for(int i=0;i<s2.length();i++){
            if(s2.charAt(i)!='a'&& s2.charAt(i)!='e' && s2.charAt(i)!='i'&& s2.charAt(i)!='o'&& s2.charAt(i)!='u'){
                result.append(s2.charAt(i));

            }
            
        }
        System.out.println(result.toString());
        
    
    }
}
