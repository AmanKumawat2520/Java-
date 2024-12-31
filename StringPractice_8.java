 import java.util.*;
 class StringPractice_8 {
    //sum of digit in String
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
       
        int sum=0;
        for(int i=0;i<s.length();i++){
        if(s.charAt(i)>='0' && s.charAt(i)<='9'){
            sum=sum+s.charAt(i)-'0';
        }
        
    
    }
    System.out.println(sum);
    }
}
