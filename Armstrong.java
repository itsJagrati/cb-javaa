import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner arm=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=arm.nextInt();
        System.out.println(isArmm(n));

    }

    public static boolean isArmm(int num){
        int copy=num;
        int arm=0;
        while(copy>0){
            int rem=copy%10;
            arm=arm+rem*rem*rem;
            copy=copy/10;
        }
        return arm==num;
    }

}
