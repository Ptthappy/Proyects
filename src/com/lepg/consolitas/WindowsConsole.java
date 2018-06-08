package com.lepg.consolitas;


import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 * @author luis
 */


public class WindowsConsole extends Console {
    FileInputStream fin;
    FileOutputStream fout;
    
    
    void CheckStr(String s) throws IOException {
        int x;
        String s2;
        String s3;
        
        x=s.indexOf(' ');
        if (x==-1) {
            s2=s;
            s3=null;
        }
        else {
            s2=s.substring(0, x);
            s3=s.substring(x+1);
        }
        
        s2=s2.toLowerCase();
        
        
        switch(s2) {
            
            case "echo":
                WriteTxt(s3);
                break;
            case "copy":
                CopyTxt();
                break;
            case "move":
                MoveTxt();
                break;
            case "del":
                DelTxt();
                break;
            case "notepad":
                ReadTxt();
                break;
            case "mkdir":
                CreateDir();
                break;
            case "dir":
                ListDir();
                break;
            case "rmdir":
                DelDir();
                break;
            case "cd":
                MoveMe();
                break;
            case "exit":
                break;
            default:
                System.out.println("No se reconoce el comando \"" + s2 + "\"");
                break;
                
        }
        
    }
    
    
    void WriteTxt(String s) throws IOException {
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
        Scanner sc=new Scanner (fin);
        
        
        
        
        
        
    }
    
    void MoveMe() {
        
    }
    void ListDir() {
        
    }
    void CreateDir() {
        
    }
    void CopyTxt() {
        
    }
    void MoveTxt() {
        
    }
    void DelTxt() {
        
    }
    void ReadTxt() {
        
    }
    void DelDir() {
        
    }
    
}