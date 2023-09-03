import java.util.*;
public class DisplayPosorNegnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();

        if(n>0){
            System.out.println("It is Positive Number");
        }
        else if(n<0){
            System.out.println("It is Negative Number");
        }
        else{
            System.out.println("It is Zero Number");
        }
    }
}
