import java.util.Scanner;

public class Mirror {
    public static void main(String[] args) {
        Scanner inv=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=inv.nextInt();
        System.out.println(mir(n));
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
    public static boolean mir(int num) {
        int copy=num;
        int rev=inv(num);
        if(rev==copy)
            return true;
        else
            return false;
    }


}
