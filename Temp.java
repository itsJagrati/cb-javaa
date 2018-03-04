import java.util.Scanner;
public class Temp {
    public static void main(String[] args) {
        Scanner temp=new Scanner(System.in);
        int initial=temp.nextByte();
        int last=temp.nextByte();
        int step=temp.nextByte();
        for (int i = initial; i <=last ; i+=step) {
            float c=(5f/9)*(i-32);
            System.out.printf("%d  %.0f\n",i,c);
        }
    }
}
