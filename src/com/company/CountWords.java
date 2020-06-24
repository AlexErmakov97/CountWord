package com.company;

import java.util.StringTokenizer;

public class CountWords {

    public static int countWords(String s){

        String str = s;
        int count = 0;
        String compareItem = " ";
        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()) {
            if (st.nextToken() != compareItem){
                count++;
            }
        }
        return count;
    }
}
