import java.util.Scanner;

public class ArmRange {
    public static void main(String[] args) {
        Scanner arm=new Scanner(System.in);
        System.out.println("Enter the lower range");
        int n1=arm.nextInt();
        System.out.println("Enter the upper range:");
        int n2=arm.nextInt();
        printArm(n1,n2);
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

    public static void printArm(int start, int last) {
        int arm=0;
        for (int i = start; i <=last ; i++) {
            if(isArmm(i)){
                System.out.println(i);
            }}
    }
}
