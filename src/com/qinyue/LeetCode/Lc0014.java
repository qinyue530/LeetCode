package com.qinyue.LeetCode;

public class Lc0014 {
    public static void main(String[] args) {
        String[] str = null;
        System.out.println(longestCommonPrefix(str));
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0)return "";
        String s = strs[0] ;
        int j ;
        for(int i = 0 ; i < strs.length ; i ++){
            if(s.length()==0||strs[i].length()==0)return "";
            for( j = 0 ;j<s.length() &&  j<strs[i].length() ; j++){
                if(s.charAt(j)!=strs[i].charAt(j)){
                    break;
                }
            }
            s = s.substring(0,j);
        }
        return s;
    }
}
