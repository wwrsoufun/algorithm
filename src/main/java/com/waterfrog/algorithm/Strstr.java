package com.waterfrog.algorithm;

/**
 * Created by wangwanru on 16/10/14.
 * 实现一个字符串是否为另外字符串的子串
 */
public class Strstr {
    /**
     * 不考虑空的情况
     * @param source
     * @param dest
     * @return
     */
    public static boolean strstr(String source,String dest){
        int sourcelen= source.length();
        int destlen = dest.length();
        for(int i=0;i<sourcelen-destlen+1;i++){
            int j=0;
            for(;j<destlen;j++){
                if(dest.charAt(j)!=source.charAt(i+j)){
                    break;
                }
            }
            if(j==destlen){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(strstr("test1231232","t"));
    }
}
