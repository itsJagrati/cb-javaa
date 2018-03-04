public class BinToDeci {
    public static void main(String[] args) {
        System.out.println(anyToDeci(111));

    }
    public static int anyToDeci(int bin){
        int deci=0;
        int power=1;
        while(bin>0){
            int rem=bin%10;
            deci=(rem*power)+deci;
            bin=bin/10;
            power=power*2;
        }
        return deci;

    }
}
