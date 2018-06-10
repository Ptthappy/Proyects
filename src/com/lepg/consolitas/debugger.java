package com.lepg.consolitas;


import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


/**
 * @author luis
 */


public class debugger {
    String test="C:/Users/luis/Desktop/test";
    File F=new File(test);
    String s[]=F.list();
    
    
    
    public void Test() throws IOException {
        F.mkdir();
        System.out.println(F.isDirectory());
        System.out.println(F.getName());
        if (F.isDirectory())
            System.out.println(Arrays.toString(s));
        
    }
}