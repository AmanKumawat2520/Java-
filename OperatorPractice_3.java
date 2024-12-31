import java.util.*;
class OperatorPractice_3{
    public static void main(String[]args){
        //roots of quadratic equation
        Scanner sc=new Scanner(System.in);
            int a,b,c;
            System.out.println("enter value of a b c = ");
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            double r1,r2;
            r1= (-b+Math.sqrt(b*b-4*a*c))/(2*a);
            r2= (-b-Math.sqrt(b*b-4*a*c))/(2*a);
            System.out.println("root 1= "+ r1);
            System.out.println("root 2= "+ r2);


    }
}
