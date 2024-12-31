import java.util.Scanner;

public class StringPractice_12 {
    // reverse String

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder result=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            result.append(s.charAt(i));
        }
        
       System.out.println(result);

        
    
    }

}


