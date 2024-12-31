import java.util.Scanner;

public class StringPractice_10 {
    // remove all Spaces from string

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s2=s.toLowerCase().trim();
        StringBuilder result=new StringBuilder();
      
        
        for(int i=0;i<s2.length();i++){
            if(s2.charAt(i)!=' '){
            result.append(s2.charAt(i));


            }
            
        }
       System.out.println(result);
        
    
    }

}

