import java.util.Scanner;

public class StringPractice_13 {
    // Palindrome String

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder result=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            result.append(s.charAt(i));
        }
        
       if(s.equals(result.toString())){
        System.out.println("Palindrome");
       }
       else{
        System.out.println("not palindrome");
       }

        
    
    }

}


