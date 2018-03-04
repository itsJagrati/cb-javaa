import java.util.Scanner;

public class XN {
    public static void main(String[] args) {
        Scanner xn=new Scanner(System.in);
        System.out.println("Enter the base");
        int x=xn.nextInt();
        System.out.println("Enter the power");
        int n=xn.nextInt();
        System.out.println(xPn(x,n));
    }
    public static int xPn(int x, int n){
        int val=1;
        while(n>0){
            val=val*x;
            n--;
        }
        return val;
    }
}
