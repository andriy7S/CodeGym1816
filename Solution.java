package com.codegym.task.task18.task1816;

/* 
ABCs

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        String fileName = args[0];
        FileInputStream in = new FileInputStream(fileName);

        int count = 0;
        int abc;
        while (in.available() > 0) {
            abc = in.read();
            if ((abc > 64 && abc < 91) || (abc > 96 && abc < 123)) {
                count++;
            }
        }
        in.close();
        System.out.println(count);
    }
}
