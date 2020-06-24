package com.company;

import java.util.Scanner;
import static com.company.CountWords.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.print("Count of words in string - " + countWords(str));
    }
}
