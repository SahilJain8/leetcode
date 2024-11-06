package Recursion;

public class Numbers {

    public static void main(String[] args) {
        System.out.println(countGoodNumbers(1));
    }

   static public int countGoodNumbers(long n) {


        count = countnumbershelper("0",n,0);
        return count;
    }


   static int count = 0;
    static int countnumbershelper(String number,long m,long i)
    {
        boolean flag = true;
        if (number.length() > m) return count;
        System.out.println(number);
        for (int j = 0; j < number.length(); j++) {
            System.out.println(number.charAt(j));
            if(i%2 == 0 && (int) number.charAt(j) % 2 !=0 || i%2 != 0 && (int) number.charAt(j) % 2 ==0) flag = false;
        }

        if (flag) count++;
        int num = Integer.parseInt(number) +1;
        return countnumbershelper("0"+ num,m,i+1);
    }
}
