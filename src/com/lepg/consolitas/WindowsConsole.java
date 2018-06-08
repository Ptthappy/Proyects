package com.lepg.consolitas;


import java.io.FileInputStream;
import java.io.FileOutputStream;


/**
 * @author luis
 */


public class WindowsConsole extends Console {
    FileInputStream fin;
    FileOutputStream fout;
    
    
    void CheckStr(String s) {
        int x;
        
        
        x=s.indexOf(' ');
        String s2=s.substring(0, x);
        String s3=s.substring(x+1);
        s2=s2.toLowerCase();
        
        switch(s2) {
            
            case "echo":
                WriteTxt(s3);
                break;
            case "copy":
                break;
            case "move":
                break;
            case "del":
                break;
            case "notepad":
                break;
            case "mkdir":
                break;
            case "dir":
                break;
            case "rmdir":
                break;
            case "cd":
                break;
            default:
                System.out.println("No se reconoce el comando \"" + s2 + "\"");
                break;
                
        }
        
    }
    
    
    void WriteTxt(String s) throws Exception {
        char c;
        int n;
        int i1=32;
        int i2=62;
        boolean b;
        String s2;
        
        
        do {
            
            c=s.charAt(0);
            if(c==(char) i1) {
                s=s.substring(1);
                b=false;
            }
            
            else
                b=true;
            
        }while(b!=true);
        
        
        n=s.indexOf('>');
        if(s.charAt(n)==i2  && s.charAt(n+1)==i2) {
            
            s2=s.substring(0, n);
            s=s.substring(n+2);
            
        }
        
        fin=new FileInputStream(s);
        
        
        
        
        
    }
}