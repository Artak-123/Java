import java.util.Arrays;

public class Bitvector {
    private int[] vector;

    public Bitvector(int size) {
        vector = new int[(size +31)/32];
    }

    public void set (int bitNum){
        int arrInd = (bitNum -1) / 32;
        int bitInd = (bitNum-1) % 32;
        vector [arrInd] |= 1 << bitInd;
        System.out.println(vector [arrInd]);
    }
    public void reSet(int bitNum){
        int arrInd = (bitNum -1) / 32;
        int bitInd = (bitNum -1) % 32;
        vector [arrInd] &= ~ (1<< bitInd);
        System.out.println(vector [arrInd]);
    }
    public boolean getInfo (int bitNum){
        int arrInd = (bitNum -1) / 32;
        int bitInd = (bitNum-1) % 32;
        return (vector[arrInd] & (1<< bitInd)) != 0;
    }
}

class itog{
    public static void main(String[] args) {
        Bitvector bity = new Bitvector(100);
        bity.set(32);
      //  bity.set(13);
        System.out.println(bity.getInfo(32));
        System.out.println(bity.getInfo(13));
        bity.reSet(32);

        System.out.println(bity.getInfo(15));
        System.out.println(bity.getInfo(13));
    }

    }
