public class OctToBin {
    public static void main(String[] args) {
        System.out.println(deciToBin(17));
    }
    public static int octToDeci(int oct) {
        int deci = 0;
        int power = 1;
        while (oct > 0) {
            int rem = oct % 10;
            deci = (rem * power) + deci;
            oct = oct / 10;
            power = power * 8;
        }
        return deci;
    }
    public static int deciToBin(int oct){
        int deci=octToDeci(17);
        int any=0;
        while(deci>0){
            int rem= deci%2;
            any=(any*10)+rem;
            deci=deci/2;

        }
        return any;
    }

}
