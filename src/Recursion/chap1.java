package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class chap1 {
    public static void main(String[] args) {


        int[] arr = {1,2,3,6,4,5,6,6};

        System.out.println(findmultipleindex(arr,0,6));


    }



    static boolean findele(int[] arr,int index,int ele)
    {
        if(index == arr.length) return false;

        return arr[index] == ele || findele(arr,index+1,ele);
    }



    static ArrayList<Integer> findmultipleindex(int[] arr,int index,int ele)
    {

        ArrayList<Integer> ans = new ArrayList<>();
        if(index == arr.length) return ans;

        if(arr[index] == ele) ans.add(index);

        ArrayList<Integer> temp = findmultipleindex(arr,index+1,ele);

        ans.addAll(temp);

        return ans;

    }



}
