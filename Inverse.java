import java.util.Scanner;

public class Inverse {
    public static void main(String[] args) {
        Scanner inv=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=inv.nextInt();
        System.out.println(inv(n));
    }
    public static int inv (int num){
        int inverse=0;
        while(num>0){
            int rem=num%10;
            inverse=inverse*10+rem;
            num=num/10;
        }
        return inverse;
    }



}
