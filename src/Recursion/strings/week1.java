package Recursion.strings;

import java.util.ArrayList;
import java.util.List;

public class week1  {

    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        System.out.println(findKthBit(4,1));
    }

    static   String removeA(String S,int index)
    {
        String ans = "";
        if(index == S.length()) return ans;
        if(S.charAt(index) != 'a') ans+=S.charAt(index);
        String temp = removeA(S,index+1);
        return ans + temp;
    }

    static   String removeAwithoutarray(String S)
    {
        String ans = "";
        String  temp;
        if(S.isEmpty()) return S;
        if(!S.startsWith("apple") )
        {
            ans+=S.charAt(0);
            temp = removeAwithoutarray(S.substring(1));
        } else {
        temp  = removeAwithoutarray(S.substring(5));

        }

        return ans+temp;

    }

    static List<String> pad(String p,String up)
    {
        List<String> ans = new ArrayList<>();
        if(up.isEmpty())
        {

            ans.add(p);
            return ans;

        }

        int digit = up.charAt(0) - '0';
        for (int i = ((digit-1) *3 )-3 ; i <(3 * digit)-3 ; i++) {
            char ch = (char) ('a' +i);
          List<String> temp=  pad(p+ch,up.substring(1));
          ans.addAll(temp);
        }

        return ans;
    }


    static int ways =0;
  static   public int findTargetSumWays(int[] nums, int target){


     int way = helper(0,nums,target,0);
      System.out.println(way);

        return ways;
  }
  static int helper(int p,int[] up,int target,int i){

      if(i == up.length)
      {
          return p == target ?1:0;
      };


      int added = 0;
      int subtracted = 0;
    added =  helper(p + up[i],up,target,i+1);

   subtracted = helper(p - up[i],up,target,i+1);

   return added+subtracted;

  }
         static   public char findKthBit(int n, int k) {
            String p =helperkThbit("0",n,0);
             System.out.println(p);
             return  p.charAt(k-1);

         }

         static String helperkThbit(String up,int n,int i)
         {
             if(i == n) return up;

             StringBuilder newtemp = new StringBuilder(up).reverse();

             for (int j = 0; j < newtemp.length(); j++) {
                 if(newtemp.charAt(j) == '0') newtemp.setCharAt(j,'1');
                 else newtemp.setCharAt(j,'0');
             }
             up =up +"1" + newtemp;
            return helperkThbit(up,n,i+1);
         }
}
