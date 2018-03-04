import java.util.Scanner;
public class DigitCount {
    public static void main(String[] args) {
        Scanner count=new Scanner(System.in);
        System.out.println("Enter the String Value: ");
        int n=count.nextInt();
        System.out.println("Enter the to be counted letter: ");
        int e=count.nextByte();
        System.out.println(count(n,e));
        }
        public static int count(int value, int cvalue){
            int c=0;
            while(value>0){
                int rem=value%10;
                if(rem==cvalue)
                    c++;
                value=value/10;
            }
            return c;
        }

}
