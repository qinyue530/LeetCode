package com.qinyue.LeetCode;


public class Lc0038 {
    public static void main(String[] args) {
        System.out.println(countAndSay(30));
    }
    //递归
    public static String countAndSay(int n) {
        if (n == 1) return "1";
        String s = countAndSay(n - 1);
        char[] c = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char flag = c[0];
        for (int i = 1; i < c.length; ++i) {
            if (flag == c[i]) {
                ++count;
            } else {
                sb.append(count);
                sb.append(flag);
                flag = c[i];
                count = 1;
            }
        }
        sb.append(count);
        sb.append(flag);
        return sb.toString();
    }
//     暴力算法
//    public static String countAndSay(int n) {
//        String result[]=new String[35];
//        result[1]="1";
//        result[2]="11";
//        for(int i = 2 ; i < 31 ; i++){
//            int sum = 1;
//            result[i+1]="";
//            for(int j=result[i].length()-1 ; j>=0 ; j--){
//                if(j>0&&result[i].charAt(j)==result[i].charAt(j-1)){
//                    sum++;
//                }else{
//                    result[i+1] = String.valueOf(sum)+result[i].charAt(j)+result[i+1];
//                    sum=1;
//                }
//            }
//        }
//        return result[n];
//
//    }
}



//1
//11
//21
//1211
//111221
//312211
//13112221
//1113213211
//31131211131221
//13211311123113112211
//11131221133112132113212221
//3113112221232112111312211312113211
//1321132132111213122112321311222113111221131221











