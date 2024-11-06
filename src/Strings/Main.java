package Strings;

public class Main {
    public static void main(String[] args) {

        System.out.println(reverseWords("the sky is blue"));

    }

    static public String reverseWords(String s) {
        String ans = "";
        int i = s.length()-1,j = s.length()-1;
        System.out.println(s.charAt(i));
        while (j >=0)
        {

            if(s.charAt(j) == ' ')
            {
                ans+=s.substring(j+1,i+1);
                i = j;
            }
            j--;


        }
return ans;

    }
}
