package com.lepg.consolitas;


import java.io.*;
import java.util.Scanner;
/**
 * @author luis
 */


public class debugger {
    File f1=new File("/");
    File f2=new File("C:/Users/luis/Desktop", "test.txt");
    File f3=new File(f1, "test2.txt");
    
    public void Test() throws IOException {
        System.out.println(f2.getParent());
        System.out.println(f2.exists());
        f2.createNewFile();
        System.out.println(f2.exists());
    }
}