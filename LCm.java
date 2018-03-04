import java.util.Scanner;
public class LCm {
    public static void main(String[] args) {
        Scanner lcm = new Scanner(System.in);
        System.out.println("Enter number one:");
        int n1 = lcm.nextInt();
        System.out.println("Enter number two ");
        int n2 = lcm.nextInt();
        System.out.println("LCM= " + lcm(n1, n2));
    }

    public static int lcm(int n1, int n2) {
        int lcm;
        if (n1 > n2)
            lcm = n1;
        else
            lcm = n2;
        while (true) {
            if (lcm % n1 == 0 && lcm % n2 == 0) {
                System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
                break;
            }
            ++lcm;
        }
        return lcm;
    }
}

