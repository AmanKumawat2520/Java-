import java.util.*;
class StringPractice_6 {

   
    public static void main(String[]args){
        // count vowel consonant spaces
        Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            String s1=s.toLowerCase();
            int countV=0,countC=0,CountS=0;
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)=='a'|| s1.charAt(i)=='e'|| s1.charAt(i)=='i'||s1.charAt(i)=='o'|| s1.charAt(i)=='u'){
                countV++;
                }
                else if(s1.charAt(i)==' '){
                    CountS++;
                }
                else{
                    countC++;
                }
            }
            System.out.println(countC);
            System.out.println(countV);
            System.out.println(CountS);

    }
}
