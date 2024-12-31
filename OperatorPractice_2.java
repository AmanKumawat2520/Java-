import java.util.*;
class OperatorPractice_2{
    public static void main(String[]args){
        //Area of Traingle
        Scanner sc=new Scanner(System.in);
        float base,height,area;
        System.out.println("enter Base and Height = ");
        base=sc.nextFloat();
        height=sc.nextFloat();
        area=base*height/2;
        System.out.println("Area of triangle= " + area);
    }
}
