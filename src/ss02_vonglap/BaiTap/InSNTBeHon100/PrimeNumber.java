package ss02_vonglap.BaiTap.InSNTBeHon100;

public class PrimeNumber {
    public static void main(String[] args) {
        for (int i=2 ; i<100 ; i++) {
            byte uoc = 0;
            for (int j=1 ; j<=i ; j++) {
                if (i%j==0) {
                    uoc++;
                }
            }
            if (uoc==2) {
                System.out.printf(i+"   ");
            }
        }
    }
}
